package com.easycoffee;

import java.util.*;

public class Usuario extends Persona {

    private String username;
    private String password;
    private String respuesta;
    private int idLote;

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Usuario(String username, String password, String respuesta, Long cedula, String nombre, String apellido, boolean estado) {
        super(cedula, nombre, apellido, estado);
        this.username = username;
        this.password = password;
        this.respuesta = respuesta;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

}
