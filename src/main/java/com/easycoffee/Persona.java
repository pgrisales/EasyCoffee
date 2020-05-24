package com.easycoffee;

public class Persona {

    private Long cedula;
    private String nombre;
    private String apellido;
    private boolean estado;

    public Persona(Long cedula, String nombre, String apellido, boolean estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", estado=" + estado + '}';
    }
}
