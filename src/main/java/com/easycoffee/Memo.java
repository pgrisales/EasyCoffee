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

    public Memo(int idPersona, String fecha, String texto) {
        this.idPersona = idPersona;
        this.fecha = fecha;
        this.texto = texto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdMemo() {
        return idMemo;
    }

    public void setIdMemo(int idMemo) {
        this.idMemo = idMemo;
    }

}
