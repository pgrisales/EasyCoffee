package com.easycoffee;

import java.util.ArrayList;

public class Lote {
    private int frecDesyer;
    private Long IdLote;
    private double areaTotal;
    private String fechaDesyerbado;
    private String fechaAbonado;
    private boolean carga;
    private ArrayList<Arbol> arbolesVivos;
    private ArrayList<Arbol> arbolesMuertos;

    public Lote(Long IdLote, double areaTotal, String fechaDesyerbado, String fechaAbonado, boolean carga) {
        this.IdLote = IdLote;
        this.areaTotal = areaTotal;
        this.fechaDesyerbado = fechaDesyerbado;
        this.fechaAbonado = fechaAbonado;
        this.carga = carga;
        this.arbolesMuertos = new ArrayList<>();
        this.arbolesVivos = new ArrayList<>();
        frecDesyer=60;
    }

    public int getFrecDesyer() {
        return frecDesyer;
    }

    public void setFrecDesyer(int frecDesyer) {
        this.frecDesyer = frecDesyer;
    }
    
    //Óptimo económico: 9.404 - 9.852 plantas/ha
    public double[] optimoEconomico(){
        double[] optimo={(this.areaTotal/10000)*9.404,(this.areaTotal/10000)* 9.852};
        return optimo;
    }
    public Lote() {
    }

    public Long getIdLote() {
        return IdLote;
    }

    public double getAreaTotal() {
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

    public void matarArbol(int id) {
        arbolesMuertos.add(arbolesVivos.get(id));
    }

    public void addArbol(Arbol arbol) {
        arbolesVivos.add(arbol);
    }

    public boolean isCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    public ArrayList<Arbol> getArbolesVivos() {
        return arbolesVivos;
    }

    public void setArbolesVivos(ArrayList<Arbol> arbolesVivos) {
        this.arbolesVivos = arbolesVivos;
    }

    public ArrayList<Arbol> getArbolesMuertos() {
        return arbolesMuertos;
    }

    public void setArbolesMuertos(ArrayList<Arbol> arbolesMuertos) {
        this.arbolesMuertos = arbolesMuertos;
    }

}
