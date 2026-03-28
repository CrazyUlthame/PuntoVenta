package com.todo2.test.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todo2.test.dto.request.UserRequestDto;
import com.todo2.test.dto.response.UserResponseDTO;
import com.todo2.test.exception.UserException;
import com.todo2.test.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    
    @Override
    public UserResponseDTO CrearUsuario(UserRequestDto dto){
        boolean algoFalla = false;
        if(algoFalla){
            throw new UserException("Error simulado");
        }

        return new UserResponseDTO("Usuario Creado con Exito, Nombre: " + dto.getNombre()+ ", Email: "+ dto.getEmail());
    }

    @Override
    public List<UserResponseDTO> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
}
