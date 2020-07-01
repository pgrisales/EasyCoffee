package com.easycoffee;

/**
 *
 * @author Camilo Vargas
 */
public class Insumo {

    private String nombreInsumo;
    private String descripcionInsumo;
    private double precioCompra;
    private double cantidadAdquirida;

    public Insumo() {
    }

    public Insumo(String nombreInsumo, String descripcionInsumo, double precioCompra, double cantidadAdquirida) {
        this.nombreInsumo = nombreInsumo;
        this.descripcionInsumo = descripcionInsumo;
        this.precioCompra = precioCompra;
        this.cantidadAdquirida = cantidadAdquirida;
    }

    public String getNombreInsumo() {
        return nombreInsumo;
    }

    public void setNombreInsumo(String nombreInsumo) {
        this.nombreInsumo = nombreInsumo;
    }

    public String getDescripcionInsumo() {
        return descripcionInsumo;
    }

    public void setDescripcionInsumo(String descripcionInsumo) {
        this.descripcionInsumo = descripcionInsumo;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getCantidadAdquirida() {
        return cantidadAdquirida;
    }

    public void setCantidadAdquirida(double cantidadAdquirida) {
        this.cantidadAdquirida = cantidadAdquirida;
    }

}
