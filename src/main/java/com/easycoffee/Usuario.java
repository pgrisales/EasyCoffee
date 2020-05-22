package com.easycoffee;

import java.util.ArrayList;

public class Usuario {
    
    private String username;
    private String password;
    private String respuesta;

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    public Usuario() {
    }
    public Usuario(String username, String password, String respuesta) {
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
    
    public ArrayList<Lote> setEspacioDeTrabajo(){
        ArrayList<Lote> lotes = new ArrayList<>();
        return lotes;
    }
}
