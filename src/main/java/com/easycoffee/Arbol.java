/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoffee;

/**
 *
 * @author Nivektakedown
 */
public class Arbol {

    private int idLote;
    private boolean estadoArbol;
    private String variedad;
    private String fechaDeSembrado;

    public Arbol(int idLote, boolean estadoArbol, String variedad, String fechaDeSembrado) {
  
        this.idLote = idLote;
        this.estadoArbol = estadoArbol;
        this.variedad = variedad;
        this.fechaDeSembrado = fechaDeSembrado;
    }

    public Arbol(String variedad, String fechaDeSembrado) {
        this.variedad = variedad;
        this.fechaDeSembrado = fechaDeSembrado;
    }

   

    public String getVariedad() {
        return variedad;
    }

    public String getFechaDeSembrado() {
        return fechaDeSembrado;
    }

    public int getIdLote() {
        return idLote;
    }

    public boolean isEstadoArbolVivo() {
        return estadoArbol;
    }

    public void setEstadoArbol(boolean estadoArbol) {
        this.estadoArbol = estadoArbol;
    }

}
