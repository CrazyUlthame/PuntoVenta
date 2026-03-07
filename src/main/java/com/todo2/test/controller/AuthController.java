package com.todo2.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo2.test.config.JwtUtil;
import com.todo2.test.dto.request.LoginRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    
    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil){
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        //usuario falso pa pruebas de token en lo que acá la bd
        if ("admin".equals(request.getUsername()) &&
            "1234".equals(request.getPassword())){
                String token = jwtUtil.generatedToken(request.getUsername());
                return ResponseEntity.ok(token);
            }
        
        return ResponseEntity.status(401).body("Credenciales inválidas");
    }
    
}
