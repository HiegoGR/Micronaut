package com.projeto.api.entity;


import com.projeto.api.dto.UserDTO;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private String telefone;
    private String email;

    public UserEntity() {
    }
}

