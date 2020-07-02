package com.easycoffee;

/**
 *
 * @author Camilo Vargas
 */
public class Insumo {

    private int idLote;
    private int idInsumo;
    private String nombreInsumo;
    private String descripcionInsumo;
    private double precioCompra;
    private double cantidadEnStock;     //Cantidad dada en Kilogramos

    public Insumo() {
    }

    public Insumo(String nombreInsumo, String descripcionInsumo, double precioCompra, double cantidadAdquirida) {
        this.nombreInsumo = nombreInsumo;
        this.descripcionInsumo = descripcionInsumo;
        this.precioCompra = precioCompra;
        this.cantidadEnStock = cantidadAdquirida;
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

    public double getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(double cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public void addCantidadStock(double cantidadaAniadir) {
        this.cantidadEnStock += cantidadaAniadir;
    }

    public void removeCantidadStock(double cantidadaReducir) {
        this.cantidadEnStock -= cantidadaReducir;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

}
