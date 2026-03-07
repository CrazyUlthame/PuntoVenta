package com.todo2.test.service.impl;

import org.springframework.stereotype.Service;

import com.todo2.test.dto.response.HolaResponseDTO;
import com.todo2.test.exception.HolaException;
import com.todo2.test.service.HolaService;

@Service
public class HolaServiceImpl implements HolaService{
    
    @Override
    public HolaResponseDTO obtenerHola(){
        boolean algoFalla = false;
        if (algoFalla){
            throw new HolaException("Error simulado en service");
        }

        return new HolaResponseDTO("hola mundo desde sprig + service + responseEntity");
    }
}
