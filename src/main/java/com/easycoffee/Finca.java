package com.easycoffee;

import java.util.ArrayList;

public class Finca {

    private String nombreFinca;
    private ArrayList<Trabajador> trabajadores;
    private ArrayList<Usuario> auxiliares;
    private ArrayList<Lote> lotes;
    private ArrayList<Plaga> plagas;
    private ArrayList<VentaCafe> ventasRegistradas;

    public Finca() {
        this.auxiliares = new ArrayList<>();
        this.lotes = new ArrayList<>();
        this.nombreFinca = "";
        this.trabajadores = new ArrayList<>();
        this.plagas = new ArrayList<>();
        this.ventasRegistradas = new ArrayList<>();
    }

    public Finca(String name) {
        this.auxiliares = null;
        this.lotes = null;
        this.nombreFinca = name;
        this.trabajadores = null;
        this.plagas = new ArrayList<Plaga>();
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

}
