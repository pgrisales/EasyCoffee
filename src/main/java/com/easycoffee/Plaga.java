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

    /**
     *
     * @param nombrePlaga
     * @param imagen
     * @param descripcionPlaga
     * @param tratamientoPlaga
     */
    public Plaga(String nombrePlaga, ImageIcon imagen, String descripcionPlaga, String tratamientoPlaga) {
        this.nombrePlaga = nombrePlaga;
        this.imagen = imagen;
        this.descripcionPlaga = descripcionPlaga;
        this.tratamientoPlaga = tratamientoPlaga;
    }

    /**
     *
     * @return
     */
    public String getNombrePlaga() {
        return nombrePlaga;
    }

    /**
     *
     * @param nombrePlaga
     */
    public void setNombrePlaga(String nombrePlaga) {
        this.nombrePlaga = nombrePlaga;
    }

    /**
     *
     * @return
     */
    public ImageIcon getImagen() {
        return imagen;
    }

    /**
     *
     * @param imagen
     */
    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    /**
     *
     * @return
     */
    public String getDescripcionPlaga() {
        return descripcionPlaga;
    }

    /**
     *
     * @param descripcionPlaga
     */
    public void setDescripcionPlaga(String descripcionPlaga) {
        this.descripcionPlaga = descripcionPlaga;
    }

    /**
     *
     * @return
     */
    public String getTratamientoPlaga() {
        return tratamientoPlaga;
    }

    /**
     *
     * @param tratamientoPlaga
     */
    public void setTratamientoPlaga(String tratamientoPlaga) {
        this.tratamientoPlaga = tratamientoPlaga;
    }
    
}
