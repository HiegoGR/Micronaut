package com.projeto.api.mapper;

import com.projeto.api.dto.UserDTO;
import com.projeto.api.entity.UserEntity;
import jakarta.inject.Singleton;

@Singleton
public class UserMapper {

    public static UserDTO toDTO(UserEntity entity) {
        return new UserDTO(
                entity.getId(),
                entity.getNome(),
                entity.getEmail(),
                entity.getIdade(),
                entity.getTelefone()
        );
    }


    public static UserEntity toEntity(UserDTO dto) {
        UserEntity entity = new UserEntity();
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        entity.setIdade(dto.getIdade());
        entity.setTelefone(dto.getTelefone());
        entity.setEmail(dto.getEmail());
        return entity;
    }
}
