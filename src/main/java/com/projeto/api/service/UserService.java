package com.projeto.api.service;

import com.projeto.api.dto.UserDTO;
import com.projeto.api.entity.UserEntity;
import com.projeto.api.mapper.UserMapper;
import com.projeto.api.repository.UserRepository;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO createUser(UserDTO userDTO) {
        UserEntity user = UserMapper.toEntity(userDTO);
        return UserMapper.toDTO(userRepository.save(user));
    }

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(UserMapper::toDTO)
                .toList();
    }

    public UserDTO getUserById(Long id) {
        return userRepository.findById(id)
                .map(UserMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado com o ID: " + id));
    }

    public UserDTO updateUser(Long id, UserDTO userDTO) {

        return userRepository.findById(id).map(user -> {
            user.setNome(userDTO.getNome());
            user.setIdade(userDTO.getIdade());
            user.setTelefone(userDTO.getTelefone());
            user.setEmail(userDTO.getEmail());

            UserEntity updatedUser = userRepository.save(user);
            return UserMapper.toDTO(updatedUser);

        }).orElseThrow(() -> new RuntimeException("Usuário não encontrado com o ID: " + id));
    }

    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
    
}
