package com.easycoffee;

import java.util.*;

public class Usuario extends Persona {

    private String password;
    private String[] respuesta=new String[3];
    private ArrayList<Integer> idLotes;
    
    public Usuario(String password, Long cedula, String nombre, String apellido, 
            boolean estado, String rta1,String rta2, String rta3 ) {
        super(cedula, nombre, apellido, estado);
        this.password = password;
        this.respuesta[0] = rta1;
        this.respuesta[1] = rta2;
        this.respuesta[2] = rta3;
    }

    public Usuario(String password, Long cedula, String nombre, String apellido, boolean estado) {
        super(cedula, nombre, apellido, estado);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Lote> setEspacioDeTrabajo() {
        ArrayList<Lote> lotes = new ArrayList<>();
        return lotes;
    }

    public String[] getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String[] respuesta) {
        this.respuesta = respuesta;
    }

    public ArrayList<Integer> getIdLotes() {
        return idLotes;
    }

    public void setIdLotes(ArrayList<Integer> idLotes) {
        this.idLotes = idLotes;
    }

    @Override
    public String toString() {
        return "Usuario{" + "password=" + password + '}';
    }

    
    

}
