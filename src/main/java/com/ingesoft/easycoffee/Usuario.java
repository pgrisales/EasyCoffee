package com.ingesoft.easycoffee;

import java.util.ArrayList;

public class Usuario {
    
    private String username;
    private String password;

    public Usuario() {
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
