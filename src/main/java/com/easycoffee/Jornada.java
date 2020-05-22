package com.easycoffee;


import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nivektakedown
 */
public class Jornada {
    private float arrobasRecogidas;
    private String horaDeRegistro;
    private String fechaJornada;
    private Lote loteTrabajado;
    
    public Jornada(float arrobasRecogidas,Lote lote) {
        this.arrobasRecogidas = arrobasRecogidas;
        this.loteTrabajado=lote;
        Calendar horaRegistro= Calendar.getInstance();
        horaDeRegistro=horaRegistro.get(Calendar.HOUR_OF_DAY)+"/"+horaRegistro.get(Calendar.MINUTE)+"/"+horaRegistro.get(Calendar.SECOND);
        fechaJornada=horaRegistro.get(Calendar.DATE)+"/"+horaRegistro.get(Calendar.MONTH)+"/"+horaRegistro.get(Calendar.YEAR);
    }

    public float getArrobasRecogidas() {
        return arrobasRecogidas;
    }

    public void setArrobasRecogidas(float arrobasRecogidas) {
        this.arrobasRecogidas = arrobasRecogidas;
    }


    public String getFechaJornada() {
        return fechaJornada;
    }

    public void setFechaJornada(String fechaJornada) {
        this.fechaJornada = fechaJornada;
    }

    
   
}
