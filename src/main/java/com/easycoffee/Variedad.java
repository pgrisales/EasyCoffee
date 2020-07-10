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
public class Variedad {
    private String nombrevar;
    private ImageIcon imagen;
    private String descripcion;
    private String colorHoja;
    private String produccion;
    private String porte;

    /**
     *
     * @param nombrevar
     * @param imagen
     * @param descripcion
     * @param colorHoja
     * @param produccion
     * @param porte
     */
    public Variedad(String nombrevar, ImageIcon imagen, String descripcion, String colorHoja, String produccion, String porte) {
        this.nombrevar = nombrevar;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.colorHoja = colorHoja;
        this.produccion = produccion;
        this.porte = porte;
    }

    /**
     *
     * @return
     */
    public String getNombrevar() {
        return nombrevar;
    }

    /**
     *
     * @param nombrevar
     */
    public void setNombrevar(String nombrevar) {
        this.nombrevar = nombrevar;
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
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @return
     */
    public String getColorHoja() {
        return colorHoja;
    }

    /**
     *
     * @param colorHoja
     */
    public void setColorHoja(String colorHoja) {
        this.colorHoja = colorHoja;
    }

    /**
     *
     * @return
     */
    public String getProduccion() {
        return produccion;
    }

    /**
     *
     * @param produccion
     */
    public void setProduccion(String produccion) {
        this.produccion = produccion;
    }

    /**
     *
     * @return
     */
    public String getPorte() {
        return porte;
    }

    /**
     *
     * @param porte
     */
    public void setPorte(String porte) {
        this.porte = porte;
    }

    
}
