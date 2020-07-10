package com.easycoffee;

/**
 *
 * @author Hp
 */
public class Persona {

    private Long cedula;
    private String nombre;
    private String apellido;
    private boolean estado;

    /**
     *
     * @param cedula La cédula de la persona
     * @param nombre El nombre de la persona
     * @param apellido El apellido de la persona
     * @param estado Si la cuenta está activa o inactiva
     */
    public Persona(Long cedula, String nombre, String apellido, boolean estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
    }

    /**
     *
     * @return
     */
    public Long getCedula() {
        return cedula;
    }

    /**
     *
     * @param cedula
     */
    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     *
     * @param estado
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", estado=" + estado + '}';
    }
}
