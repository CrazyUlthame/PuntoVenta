package com.todo2.test.service;

import com.todo2.test.dto.request.UserRequestDto;
import com.todo2.test.dto.response.UserResponseDTO;

public interface UserService {
    UserResponseDTO CrearUsuario(UserRequestDto dto);
}
