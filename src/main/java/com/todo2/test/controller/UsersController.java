package com.todo2.test.controller;

import org.springframework.web.bind.annotation.RestController;

import com.todo2.test.dto.request.UserRequestDto;
import com.todo2.test.dto.response.UserResponseDTO;
import com.todo2.test.service.UserService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UsersController {
    private final UserService userService;

    public UsersController(UserService userService){
        this.userService = userService;
    }
    
    @PostMapping("/api/v1/users")
    public ResponseEntity<UserResponseDTO> createUser(@Valid @RequestBody UserRequestDto dto) {
        return ResponseEntity.ok(userService.CrearUsuario(dto));
    }
    
}
