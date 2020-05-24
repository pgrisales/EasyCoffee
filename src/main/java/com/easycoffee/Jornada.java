package com.easycoffee;


import java.util.Calendar;

public class Jornada {
    private float arrobasRecogidas;
    private String horaDeRegistro;
    private String fechaJornada;
    private Long loteTrabajado;
    private int idJornada;
    private Long idTrabajador;
    
    public Jornada(float arrobasRecogidas,Lote lote,Trabajador tr) {
        this.arrobasRecogidas = arrobasRecogidas;
        this.loteTrabajado=lote.getIdLote();
        this.idTrabajador = tr.getCedula();
        Calendar horaRegistro= Calendar.getInstance();
        horaDeRegistro=horaRegistro.get(Calendar.HOUR_OF_DAY)+"/"+horaRegistro.get(Calendar.MINUTE)+"/"+horaRegistro.get(Calendar.SECOND);
        fechaJornada=horaRegistro.get(Calendar.DATE)+"/"+horaRegistro.get(Calendar.MONTH)+"/"+horaRegistro.get(Calendar.YEAR);
    }

    public Jornada(float arrobasRecogidas, String horaDeRegistro, String fechaJornada, Long loteTrabajado, int idJornada) {
        this.arrobasRecogidas = arrobasRecogidas;
        this.horaDeRegistro = horaDeRegistro;
        this.fechaJornada = fechaJornada;
        this.loteTrabajado = loteTrabajado;
        this.idJornada = idJornada;
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

    public String getHoraDeRegistro() {
        return horaDeRegistro;
    }

    public void setHoraDeRegistro(String horaDeRegistro) {
        this.horaDeRegistro = horaDeRegistro;
    }

    public Long getLoteTrabajado() {
        return loteTrabajado;
    }

    public void setLoteTrabajado(Long loteTrabajado) {
        this.loteTrabajado = loteTrabajado;
    }

    public int getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(int idJornada) {
        this.idJornada = idJornada;
    }

    public Long getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(Long idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    
   
}
