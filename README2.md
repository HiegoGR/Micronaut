## Micronaut API - User Management

API REST desenvolvida com Micronaut para gerenciamento de usuários, com operações CRUD completas.

## Tecnologias Utilizadas
- Java 21
- Micronaut Framework
- Micronaut Data (JPA)
- Hibernate
- H2 Database (in-memory)
- Lombok
- Micronaut Serialization (Serde)
- Swagger / OpenAPI
- Gradle

## Framework Utilizado
- Micronaut
Micronaut é um framework moderno focado em:

⚡ Alta performance (compile-time)

🚀 Baixo consumo de memória

❌ Sem reflection pesada (diferente do Spring)

📦 Ideal para microserviços

## Estrutura do Projeto

```
com.projeto.api
├── controller
│   └── UserController.java
├── service
│   └── UserService.java
├── repository
│   └── UserRepository.java
├── entity
│   └── UserEntity.java
├── dto
│   └── UserDTO.java
├── mapper
│   └── UserMapper.java
├── config
│   └── swagger
│       └── SwaggerConfig.java
```

## Swagger
```http://localhost:8080/swagger-ui/index.html#```