package com.easycoffee;

import java.util.Calendar;

/**
 *
 * @author Hp
 */
public class Jornada {

    private float arrobasRecogidas;
    private String horaDeRegistro;
    private String fechaJornada;
    private Long loteTrabajado;
    private int idJornada;
    private Long idTrabajador;

    /**
     *
     * @param arrobasRecogidas
     * @param lote
     * @param tr
     */
    public Jornada(float arrobasRecogidas, Lote lote, Trabajador tr) {
        this.arrobasRecogidas = arrobasRecogidas;
        this.loteTrabajado = lote.getIdLote();
        this.idTrabajador = tr.getCedula();
        Calendar horaRegistro = Calendar.getInstance();
        horaDeRegistro = horaRegistro.get(Calendar.HOUR_OF_DAY) + "/" + horaRegistro.get(Calendar.MINUTE) + "/" + horaRegistro.get(Calendar.SECOND);
        fechaJornada = horaRegistro.get(Calendar.DATE) + "/" + horaRegistro.get(Calendar.MONTH) + "/" + horaRegistro.get(Calendar.YEAR);
    }

    /**
     *
     * @param arrobasRecogidas
     * @param horaDeRegistro
     * @param fechaJornada
     * @param loteTrabajado
     * @param idJornada
     */
    public Jornada(float arrobasRecogidas, String horaDeRegistro, String fechaJornada, Long loteTrabajado, int idJornada) {
        this.arrobasRecogidas = arrobasRecogidas;
        this.horaDeRegistro = horaDeRegistro;
        this.fechaJornada = fechaJornada;
        this.loteTrabajado = loteTrabajado;
        this.idJornada = idJornada;
    }

    /**
     *
     * @return
     */
    public float getArrobasRecogidas() {
        return arrobasRecogidas;
    }

    /**
     *
     * @param arrobasRecogidas
     */
    public void setArrobasRecogidas(float arrobasRecogidas) {
        this.arrobasRecogidas = arrobasRecogidas;
    }

    /**
     *
     * @return
     */
    public String getFechaJornada() {
        return fechaJornada;
    }

    /**
     *
     * @param fechaJornada
     */
    public void setFechaJornada(String fechaJornada) {
        this.fechaJornada = fechaJornada;
    }

    /**
     *
     * @return
     */
    public String getHoraDeRegistro() {
        return horaDeRegistro;
    }

    /**
     *
     * @param horaDeRegistro
     */
    public void setHoraDeRegistro(String horaDeRegistro) {
        this.horaDeRegistro = horaDeRegistro;
    }

    /**
     *
     * @return
     */
    public Long getLoteTrabajado() {
        return loteTrabajado;
    }

    /**
     *
     * @param loteTrabajado
     */
    public void setLoteTrabajado(Long loteTrabajado) {
        this.loteTrabajado = loteTrabajado;
    }

    /**
     *
     * @return
     */
    public int getIdJornada() {
        return idJornada;
    }

    /**
     *
     * @param idJornada
     */
    public void setIdJornada(int idJornada) {
        this.idJornada = idJornada;
    }

    /**
     *
     * @return
     */
    public Long getIdTrabajador() {
        return idTrabajador;
    }

    /**
     *
     * @param idTrabajador
     */
    public void setIdTrabajador(Long idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

}
