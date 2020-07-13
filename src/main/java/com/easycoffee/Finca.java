package com.easycoffee;

import Frontera.FramePrincipal;
import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class Finca {

    private String nombreFinca;
    private ArrayList<Trabajador> trabajadores;
    private ArrayList<Usuario> auxiliares;
    private ArrayList<Lote> lotes;
    private ArrayList<Plaga> plagas;
    private ArrayList<Variedad> variedad;
    private ArrayList<VentaCafe> ventasRegistradas;
    private String coordenadas;
    private String shape;

    /**
     *
     * @param name
     */
    public Finca(String name) {
        
        this.auxiliares = new ArrayList<Usuario>();
        this.lotes = new ArrayList<Lote>();
        this.nombreFinca = name;
        this.trabajadores = null;
        this.plagas = new ArrayList<Plaga>();
        this.variedad = new ArrayList<Variedad>();
        this.ventasRegistradas = new ArrayList<>();
        this.coordenadas=null;
        this.shape=null;
    }

    /**
     *
     * @return
     */
    public String getNombreFinca() {
        return nombreFinca;
    }

    /**
     *
     * @param nombreFinca
     */
    public void setNombreFinca(String nombreFinca) {
        this.nombreFinca = nombreFinca;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }
    public String getShape() {
        return shape;
        
    }
    public void setShape(String shape) {
        this.shape = shape;
    }

    /**
     *
     * @param lote
     */
    public void agregarlote(Lote lote) {
        lotes.add(lote);
    }

    /**
     *
     * @param usuario
     */
    public void agregarAuxiliar(Usuario usuario) {
        auxiliares.add(usuario);
    }

    /**
     *
     * @return
     */
    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    /**
     *
     * @param trabajadores
     */
    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    /**
     *
     * @return
     */
    public ArrayList<Usuario> getAuxiliares() {
        return auxiliares;
    }

    /**
     *
     * @param auxiliares
     */
    public void setAuxiliares(ArrayList<Usuario> auxiliares) {
        this.auxiliares = auxiliares;
    }

    /**
     *
     * @return
     */
    public ArrayList<Lote> getLotes() {
        return lotes;
    }

    /**
     *
     * @param lotes
     */
    public void setLotes(ArrayList<Lote> lotes) {
        this.lotes = lotes;
    }

    /**
     *
     * @return
     */
    public ArrayList<Plaga> getPlagas() {
        return plagas;
    }

    /**
     *
     * @param plagas
     */
    public void setPlagas(ArrayList<Plaga> plagas) {
        this.plagas = plagas;
    }

    /**
     *
     * @return
     */
    public ArrayList<VentaCafe> getVentasRegistradas() {
        return ventasRegistradas;
    }

    /**
     *
     * @param ventasRegistradas
     */
    public void setVentasRegistradas(ArrayList<VentaCafe> ventasRegistradas) {
        this.ventasRegistradas = ventasRegistradas;
    }

    /**
     *
     * @param vc
     */
    public void addVentaRegistro(VentaCafe vc) {
        this.ventasRegistradas.add(vc);
    }

    /**
     *
     * @return
     */
    public ArrayList<Variedad> getVariedad() {
        return variedad;
    }

    /**
     *
     * @param variedad
     */
    public void setVariedad(ArrayList<Variedad> variedad) {
        this.variedad = variedad;
    }
    
}
