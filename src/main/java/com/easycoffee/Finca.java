package com.easycoffee;

import java.util.ArrayList;

public class Finca {

    private String nombreFinca;
    private ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
    private ArrayList<Usuario> auxiliares = new ArrayList<Usuario>();
    private ArrayList<Lote> lotes = new ArrayList<Lote>();
    private ArrayList<Plaga> plagas = new ArrayList<Plaga>();

    public Finca() {
        this.auxiliares = new ArrayList<Usuario>();;
        this.lotes = new ArrayList<Lote>();
        this.nombreFinca = "";
        this.trabajadores = new ArrayList<Trabajador>();
        this.plagas = new ArrayList<Plaga>();
    }

    public Finca(String name) {
        this.auxiliares = null;
        this.lotes = null;
        this.nombreFinca = name;
        this.trabajadores = null;
        this.plagas = null;
    }

    public String getNombreFinca() {
        return nombreFinca;
    }

    public void setNombreFinca(String nombreFinca) {
        this.nombreFinca = nombreFinca;
    }

    public void agregarlote(Lote lote) {
        lotes.add(lote);
    }

    public void agregarAuxiliar(Usuario usuario) {
        auxiliares.add(usuario);
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public ArrayList<Usuario> getAuxiliares() {
        return auxiliares;
    }

    public void setAuxiliares(ArrayList<Usuario> auxiliares) {
        this.auxiliares = auxiliares;
    }

    public ArrayList<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(ArrayList<Lote> lotes) {
        this.lotes = lotes;
    }

    public ArrayList<Plaga> getPlagas() {
        return plagas;
    }

    public void setPlagas(ArrayList<Plaga> plagas) {
        this.plagas = plagas;
    }
    
}
