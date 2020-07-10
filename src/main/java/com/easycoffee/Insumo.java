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

    /**
     *
     */
    public Insumo() {
    }

    /**
     *
     * @param nombreInsumo
     * @param descripcionInsumo
     * @param precioCompra
     * @param cantidadAdquirida
     */
    public Insumo(String nombreInsumo, String descripcionInsumo, double precioCompra, double cantidadAdquirida) {
        this.nombreInsumo = nombreInsumo;
        this.descripcionInsumo = descripcionInsumo;
        this.precioCompra = precioCompra;
        this.cantidadEnStock = cantidadAdquirida;
    }

    /**
     *
     * @return
     */
    public String getNombreInsumo() {
        return nombreInsumo;
    }

    /**
     *
     * @param nombreInsumo
     */
    public void setNombreInsumo(String nombreInsumo) {
        this.nombreInsumo = nombreInsumo;
    }

    /**
     *
     * @return
     */
    public String getDescripcionInsumo() {
        return descripcionInsumo;
    }

    /**
     *
     * @param descripcionInsumo
     */
    public void setDescripcionInsumo(String descripcionInsumo) {
        this.descripcionInsumo = descripcionInsumo;
    }

    /**
     *
     * @return
     */
    public double getPrecioCompra() {
        return precioCompra;
    }

    /**
     *
     * @param precioCompra
     */
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    /**
     *
     * @return
     */
    public double getCantidadEnStock() {
        return cantidadEnStock;
    }

    /**
     *
     * @param cantidadEnStock
     */
    public void setCantidadEnStock(double cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    /**
     *
     * @param cantidadaAniadir
     */
    public void addCantidadStock(double cantidadaAniadir) {
        this.cantidadEnStock += cantidadaAniadir;
    }

    /**
     *
     * @param cantidadaReducir
     */
    public void removeCantidadStock(double cantidadaReducir) {
        this.cantidadEnStock -= cantidadaReducir;
    }

    /**
     *
     * @return
     */
    public int getIdLote() {
        return idLote;
    }

    /**
     *
     * @param idLote
     */
    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    /**
     *
     * @return
     */
    public int getIdInsumo() {
        return idInsumo;
    }

    /**
     *
     * @param idInsumo
     */
    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

}
