package com.easycoffee;

import javax.swing.ImageIcon;

public class Administrador extends Usuario {

    private Finca finca;

    public Administrador(String password, Long cedula, String nombre, String apellido, boolean estado, boolean rol) {
        super(password, cedula, nombre, apellido, estado, rol);
    }

    public Administrador(String password, Long cedula, String nombre, String apellido, boolean estado, String rta1, String rta2, String rta3, boolean rol) {
        super(password, cedula, nombre, apellido, estado, rta1, rta2, rta3, rol);
    }

    public Administrador(String password, ImageIcon imagen, Long cedula, String nombre, String apellido, boolean estado, boolean rol) {
        super(password, imagen, cedula, nombre, apellido, estado, rol);
    }

    public Finca getFinca() {
        return finca;
    }

    public void setFinca(Finca finca) {
        this.finca = finca;
    }

}
