package com.todo2.test.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRequestDto {
    
    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 3, max = 50, message = "El nombre debe tener entre 3 y 50 caracteres")
    private String nombre;

    @NotBlank(message = "El email es obligatorio")
    @Email(message = "Debe ser un email válido")
    private String email;

    public String getNombre(){ return nombre; }
    public void setNombre(String nombre) {this.nombre = nombre; }
    public String getEmail() {return email; }
    public void setEmail(String email) { this.email = email; }
}
