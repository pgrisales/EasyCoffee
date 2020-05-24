package com.easycoffee;

public class Administrador extends Usuario{
    
    private Finca finca;

    public Administrador(String username, String password, String respuesta, Long cedula, String nombre, String apellido, boolean estado, int idLote) {
        super(username, password, respuesta, cedula, nombre, apellido, estado, 1);
       
    }

    public Finca getFinca() {
        return finca;
    }

    public void setFinca(Finca finca) {
        this.finca = finca;
    }
    
    
}
