package com.easycoffee;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name= "USUARIO")
public class Usuario implements Serializable{
    
    private String username;
    private String password;
    private String respuesta;
    
    @Id
    private Long idUnico;

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

    //Identificadores Unicos de Usuario.xml
    public Long getIdUnico() {
        return idUnico;
    }

    public void setIdUnico(Long idUnico) {
        this.idUnico = idUnico;
    }
}
