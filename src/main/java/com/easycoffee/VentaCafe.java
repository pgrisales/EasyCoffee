package com.easycoffee;

/**
 *
 *
 * @author Camilo Vargas
 */
public class VentaCafe {

    private int idUnicoFactura;
    private String fechaRegistro;
    private String variedadCafe;
    private double cantidadVendida;
    private double precioVenta;

    /**
     *
     */
    public VentaCafe() {
    }

    /**
     *
     * @param fechaRegistro
     * @param variedadCafe
     * @param cantidadVendida
     * @param precioVenta
     */
    public VentaCafe(String fechaRegistro, String variedadCafe, double cantidadVendida, double precioVenta) {
        this.fechaRegistro = fechaRegistro;
        this.variedadCafe = variedadCafe;
        this.cantidadVendida = cantidadVendida;
        this.precioVenta = precioVenta;
    }

    /**
     *
     * @param idUnicoFactura: Id Unico del registro de venta
     * @param fechaRegistro: Fecha de Registro de Venta en el Sistema
     * @param variedadCafe: Tipo de Cafe vendido
     * @param cantidadVendida: cantidad de Cafe vendida
     * @param precioVenta: Precio de Venta acordado y recibido
     */
    public VentaCafe(int idUnicoFactura, String fechaRegistro, String variedadCafe, double cantidadVendida, double precioVenta) {
        this.idUnicoFactura = idUnicoFactura;
        this.fechaRegistro = fechaRegistro;
        this.variedadCafe = variedadCafe;
        this.cantidadVendida = cantidadVendida;
        this.precioVenta = precioVenta;
    }

    /**
     *
     * @return Id Unico del registro de venta
     */
    public int getIdUnicoFactura() {
        return idUnicoFactura;
    }

    /**
     *
     * @param idUnicoFactura: Id Unico del registro de venta
     */
    public void setIdUnicoFactura(int idUnicoFactura) {
        this.idUnicoFactura = idUnicoFactura;
    }

    /**
     *
     * @return Fecha de Registro de Venta en el Sistema
     */
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     *
     * @param fechaRegistro: Fecha de Registro de Venta en el Sistema
     */
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     *
     * @return Tipo de Cafe vendido
     */
    public String getVariedadCafe() {
        return variedadCafe;
    }

    /**
     *
     * @param variedadCafe: Tipo de Cafe vendido
     */
    public void setVariedadCafe(String variedadCafe) {
        this.variedadCafe = variedadCafe;
    }

    /**
     *
     * @return cantidad de Cafe vendida
     */
    public double getCantidadVendida() {
        return cantidadVendida;
    }

    /**
     *
     * @param cantidadVendida: cantidad de Cafe vendida
     */
    public void setCantidadVendida(double cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    /**
     *
     * @return Precio de Venta acordado y recibido
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     *
     * @param precioVenta: Precio de Venta acordado y recibido
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

}
