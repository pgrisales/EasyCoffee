package com.easycoffee;

/**
 *
 * @author Hp
 */
public class Arbol {

    private int idLote;
    private boolean estadoArbol;
    private String variedad;
    private String fechaDeSembrado;

    /**
     *
     * @param idLote
     * @param estadoArbol
     * @param variedad
     * @param fechaDeSembrado
     */
    public Arbol(int idLote, boolean estadoArbol, String variedad, String fechaDeSembrado) {

        this.idLote = idLote;
        this.estadoArbol = estadoArbol;
        this.variedad = variedad;
        this.fechaDeSembrado = fechaDeSembrado;
    }

    /**
     *
     * @param variedad
     * @param fechaDeSembrado
     */
    public Arbol(String variedad, String fechaDeSembrado) {
        this.variedad = variedad;
        this.fechaDeSembrado = fechaDeSembrado;
    }

    /**
     *
     * @return
     */
    public String getVariedad() {
        return variedad;
    }

    /**
     *
     * @return
     */
    public String getFechaDeSembrado() {
        return fechaDeSembrado;
    }

    /**
     *
     * @return
     */
    public int getIdLote() {
        return idLote;
    }

    /**
     *
     * @return
     */
    public boolean isEstadoArbolVivo() {
        return estadoArbol;
    }

    /**
     *
     * @param estadoArbol
     */
    public void setEstadoArbol(boolean estadoArbol) {
        this.estadoArbol = estadoArbol;
    }

}
