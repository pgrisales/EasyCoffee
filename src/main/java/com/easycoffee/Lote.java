package com.easycoffee;

import java.util.ArrayList;

public class Lote {
    
    private int areaTotal;
    private String fechaDesyerbado;
    private String fechaAbonado;
    private ArrayList<Usuario> usuariosPermitidos = new ArrayList<>();
    private boolean carga;
    private ArrayList<Arbol> arbolesVivos;
    private ArrayList<Arbol> arbolesMuertos;

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
    public void matarArbol(int id){
        arbolesMuertos.add(arbolesVivos.get(id));
    }
    public void addArbol(Arbol arbol){
        arbolesVivos.add(arbol);
    }
     
}
