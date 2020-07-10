package com.easycoffee;

/**
 *
 * @author Camilo Vargas
 */
public class Memo {

    private int idMemo;
    private int idPersona;
    private String fecha;
    private String texto;

    /**
     *
     * @param idPersona
     * @param fecha
     * @param texto
     */
    public Memo(int idPersona, String fecha, String texto) {
        this.idPersona = idPersona;
        this.fecha = fecha;
        this.texto = texto;
    }

    /**
     *
     * @return
     */
    public String getFecha() {
        return fecha;
    }

    /**
     *
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     *
     * @return
     */
    public String getTexto() {
        return texto;
    }

    /**
     *
     * @param texto
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     *
     * @return
     */
    public int getIdPersona() {
        return idPersona;
    }

    /**
     *
     * @param idPersona
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    /**
     *
     * @return
     */
    public int getIdMemo() {
        return idMemo;
    }

    /**
     *
     * @param idMemo
     */
    public void setIdMemo(int idMemo) {
        this.idMemo = idMemo;
    }

}
