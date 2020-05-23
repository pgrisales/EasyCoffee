package com.easycoffee;

public class Administrador extends Usuario{
    
    private Finca finca;

    public Administrador(Finca finca, String username, String password, String respuesta, Long idUnico, long cedula, String nombre, boolean estado) {
        super(username, password, respuesta, idUnico, cedula, nombre, estado);
        this.finca = finca;
    }


    public Finca getFinca() {
        return finca;
    }

    public void setFinca(Finca finca) {
        this.finca = finca;
    }
    
    
}
