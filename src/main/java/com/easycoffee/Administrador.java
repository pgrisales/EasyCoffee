package com.easycoffee;

public class Administrador extends Usuario{
    
    private Finca finca;

    public Administrador(String username, String password, String respuesta) {
        super(username, password, respuesta);
        this.finca = new Finca();
    }


    public Finca getFinca() {
        return finca;
    }

    public void setFinca(Finca finca) {
        this.finca = finca;
    }
    
    
}
