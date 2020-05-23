package com.easycoffee;

public class Persona {
    private Long cedula;
    private String nombre;
    private String apellido;
    private boolean estado;

    public Persona(long cedula, String nombre, boolean estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.estado = estado;
    }
   

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
