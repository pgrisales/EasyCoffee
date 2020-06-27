/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.easycoffee;

import javax.swing.ImageIcon;

/**
 * 
 * @author Diego Lopez Avila <dlopezav at unal.edu.co>
 */
public class Plaga {
    private String nombrePlaga;
    private ImageIcon imagen;
    private String descripcionPlaga;
    private String tratamientoPlaga;

    public Plaga(String nombrePlaga, ImageIcon imagen, String descripcionPlaga, String tratamientoPlaga) {
        this.nombrePlaga = nombrePlaga;
        this.imagen = imagen;
        this.descripcionPlaga = descripcionPlaga;
        this.tratamientoPlaga = tratamientoPlaga;
    }

    public String getNombrePlaga() {
        return nombrePlaga;
    }

    public void setNombrePlaga(String nombrePlaga) {
        this.nombrePlaga = nombrePlaga;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public String getDescripcionPlaga() {
        return descripcionPlaga;
    }

    public void setDescripcionPlaga(String descripcionPlaga) {
        this.descripcionPlaga = descripcionPlaga;
    }

    public String getTratamientoPlaga() {
        return tratamientoPlaga;
    }

    public void setTratamientoPlaga(String tratamientoPlaga) {
        this.tratamientoPlaga = tratamientoPlaga;
    }
    
}
