package com.easycoffee;

public class Administrador extends Usuario{
    
    private Finca finca;

    public Administrador(String username, String password, Long cedula, String nombre, String apellido, boolean estado, String rta1, String rta2, String rta3) {
        super(username, password, cedula, nombre, apellido, estado, rta1, rta2, rta3);
    }

    
    public Finca getFinca() {
        return finca;
    }

    public void setFinca(Finca finca) {
        this.finca = finca;
    }
    
}
    


    
    
