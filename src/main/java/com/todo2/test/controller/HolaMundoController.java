package com.todo2.test.controller;

import org.springframework.web.bind.annotation.RestController;

import com.todo2.test.dto.response.HolaResponseDTO;
import com.todo2.test.service.HolaService;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HolaMundoController {

    private final HolaService holaService;

    public HolaMundoController(HolaService holaService){
        this.holaService = holaService;
    }

    @Operation(summary = "Retorna un saludo básico..")
    @GetMapping("/api/v1/hola")
    public ResponseEntity<HolaResponseDTO> holaMundo() {
        HolaResponseDTO response = holaService.obtenerHola();
        return ResponseEntity.ok(response);
    }
    
    
}
