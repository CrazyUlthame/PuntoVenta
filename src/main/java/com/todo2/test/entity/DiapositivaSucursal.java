package com.todo2.test.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name = "PI_DIAPOSITIVASSUCURSALES", schema = "dbo")
public class DiapositivaSucursal {
    
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "data")
    private String data;

    @Column(name = "consecutivo")
    private int consecutivo;

    @Column(name = "sucursalId")
    private int sucursalId;

    @Column(name = "todas")
    private int todas;

    @Version
    @Column(name = "RowVersion")
    private byte[] RowVersion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(int sucursalId) {
        this.sucursalId = sucursalId;
    }

    public int getTodas() {
        return todas;
    }

    public void setTodas(int todas) {
        this.todas = todas;
    }

    public byte[] getRowVersion() {
        return RowVersion;
    }

    public void setRowVersion(byte[] rowVersion) {
        RowVersion = rowVersion;
    }

    
}
