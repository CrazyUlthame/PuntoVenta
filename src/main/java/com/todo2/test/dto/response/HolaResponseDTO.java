package com.todo2.test.dto.response;

public class HolaResponseDTO {
    private String mensaje;

    public HolaResponseDTO() {}

    public HolaResponseDTO(String mensaje){
        this.mensaje = mensaje;
    }

    public String getMensaje(){
        return mensaje;
    }

    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }
}
