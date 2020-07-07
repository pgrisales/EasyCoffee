package com.easycoffee;

import java.util.ArrayList;

public class Finca {

    private String nombreFinca;
    private ArrayList<Trabajador> trabajadores;
    private ArrayList<Usuario> auxiliares;
    private ArrayList<Lote> lotes;
    private ArrayList<Plaga> plagas;
    private ArrayList<Variedad> variedad;
    private ArrayList<VentaCafe> ventasRegistradas;


    public Finca(String name) {
        this.auxiliares = new ArrayList<Usuario>();
        this.lotes = new ArrayList<Lote>();
        this.nombreFinca = name;
        this.trabajadores = null;
        this.plagas = new ArrayList<Plaga>();
        this.variedad = new ArrayList<Variedad>();
        this.ventasRegistradas = new ArrayList<>();
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

    public ArrayList<VentaCafe> getVentasRegistradas() {
        return ventasRegistradas;
    }

    public void setVentasRegistradas(ArrayList<VentaCafe> ventasRegistradas) {
        this.ventasRegistradas = ventasRegistradas;
    }

    public void addVentaRegistro(VentaCafe vc) {
        this.ventasRegistradas.add(vc);
    }

    public ArrayList<Variedad> getVariedad() {
        return variedad;
    }

    public void setVariedad(ArrayList<Variedad> variedad) {
        this.variedad = variedad;
    }
    
}
