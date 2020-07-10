package com.easycoffee;

import javax.swing.ImageIcon;

/**
 *
 * @author Hp
 */
public class Administrador extends Usuario {

    private Finca finca;

    /**
     *
     * @param password
     * @param cedula
     * @param nombre
     * @param apellido
     * @param estado
     * @param rta1
     * @param rta2
     * @param rta3
     * @param rol
     */
    public Administrador(String password, Long cedula, String nombre, String apellido, boolean estado, String rta1, String rta2, String rta3, boolean rol) {
        super(password, cedula, nombre, apellido, estado, rta1, rta2, rta3, rol);
        this.finca = new Finca("");
    }

    /**
     *
     * @return
     */
    public Finca getFinca() {
        return finca;
    }

    /**
     *
     * @param finca
     */
    public void setFinca(Finca finca) {
        this.finca = finca;
    }

}
