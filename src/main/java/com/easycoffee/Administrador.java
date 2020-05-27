package com.easycoffee;

public class Administrador extends Usuario{
    
    private Finca finca;

    /*public Administrador(Finca finca, String username, String password, Long cedula, String nombre, String apellido, boolean estado) {
        super(username, password, cedula, nombre, apellido, estado);
        this.finca = finca;
    }
*/
    


    public Finca getFinca() {
        return finca;
    }

    public void setFinca(Finca finca) {
        this.finca = finca;
    }
    
    
}