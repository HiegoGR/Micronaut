package com.projeto.api.controller;

import com.projeto.api.dto.UserDTO;
import com.projeto.api.service.UserService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/api/users")
public class UserController {

    @Inject
    private UserService userService;

    @Post
    public HttpResponse<UserDTO> createUser(@Body UserDTO userDTO) {
        UserDTO createdUser = userService.createUser(userDTO);
        return HttpResponse.created(createdUser);
    }

    @Get
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @Get("/{id}")
    public HttpResponse<UserDTO> getUserById(@PathVariable Long id) {
        try {
            UserDTO userDTO = userService.getUserById(id);
            return HttpResponse.ok(userDTO);
        } catch (RuntimeException e) {
            return HttpResponse.notFound();
        }
    }

    @Put("/{id}")
    public HttpResponse<UserDTO> updateUser(@PathVariable Long id, @Body UserDTO userDTO) {
        try {
            UserDTO updatedUser = userService.updateUser(id, userDTO);
            return HttpResponse.ok(updatedUser);
        } catch (RuntimeException e) {
            return HttpResponse.notFound();
        }
    }

    @Delete("/{id}")
    public HttpResponse<Void> deleteUser(@PathVariable Long id) {
        if (userService.deleteUser(id)) {
            return HttpResponse.noContent();
        }
        return HttpResponse.notFound();
    }

}
