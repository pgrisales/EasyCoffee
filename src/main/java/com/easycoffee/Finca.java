package com.easycoffee;

import java.util.ArrayList;

public class Finca {
    
    private String nombreFinca;
    private ArrayList<Trabajador> trabajadores = new ArrayList<>();
    private ArrayList<Usuario> auxiliares = new ArrayList<>();
    private ArrayList<Lote> lotes = new ArrayList<>();

    public Finca() {
    }

    public String getNombreFinca() {
        return nombreFinca;
    }

    public void setNombreFinca(String nombreFinca) {
        this.nombreFinca = nombreFinca;
    }
    public void agregarlote(Lote lote){
        lotes.add(lote);
    } 
    public void agregarAuxiliar(Usuario usuario){
        auxiliares.add(usuario);
    }
    
    
}
