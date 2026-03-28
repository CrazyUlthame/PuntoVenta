package com.todo2.test.dto.response;

public class DipositivaSucursalResponseDTO {
    private int id;
    private String observaciones;
    private String data;
    private int consecutivo;
    private byte[] RowVersion;
    private int sucursalId;
    private boolean todas;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public int getConsecutivo() {
        return consecutivo;
    }
    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }
    public byte[] getRowVersion() {
        return RowVersion;
    }
    public void setRowVersion(byte[] rowVersion) {
        RowVersion = rowVersion;
    }
    public int getSucursalId() {
        return sucursalId;
    }
    public void setSucursalId(int sucursalId) {
        this.sucursalId = sucursalId;
    }
    public boolean isTodas() {
        return todas;
    }
    public void setTodas(boolean todas) {
        this.todas = todas;
    }

    
}
