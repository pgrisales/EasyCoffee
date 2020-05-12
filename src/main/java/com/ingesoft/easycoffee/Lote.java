package com.ingesoft.easycoffee;

import java.util.ArrayList;

public class Lote {
    
    private int areaTotal;
    private String fechaDesyerbado;
    private String fechaAbonado;
    private ArrayList<Usuario> usuariosPermitidos = new ArrayList<>();

    public Lote() {
    }

    public int getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(int areaTotal) {
        this.areaTotal = areaTotal;
    }

    public String getFechaDesyerbado() {
        return fechaDesyerbado;
    }

    public void setFechaDesyerbado(String fechaDesyerbado) {
        this.fechaDesyerbado = fechaDesyerbado;
    }

    public String getFechaAbonado() {
        return fechaAbonado;
    }

    public void setFechaAbonado(String fechaAbonado) {
        this.fechaAbonado = fechaAbonado;
    }
    
        
}
