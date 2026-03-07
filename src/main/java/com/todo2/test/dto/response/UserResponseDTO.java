package com.todo2.test.dto.response;

public class UserResponseDTO {
    private String mensaje;

    public UserResponseDTO() {
    }

    public UserResponseDTO(String mensaje){
        this.mensaje = mensaje;
    }

    public String getMensaje(){
        return mensaje;
    }

    public void setMensaje(String mensaje){
        this.mensaje  = mensaje;
    }
    
}
