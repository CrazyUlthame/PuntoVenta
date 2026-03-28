package com.todo2.test.service;

import java.util.List;

import com.todo2.test.dto.request.UserRequestDto;
import com.todo2.test.dto.response.UserResponseDTO;

public interface UserService {
    UserResponseDTO CrearUsuario(UserRequestDto dto);

    List<UserResponseDTO> findAll();
}
