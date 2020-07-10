package com.easycoffee;

import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class Lote {

    private int frecDesyer;
    private Long IdLote;
    private double areaTotal;
    private String fechaDesyerbado;
    private String fechaAbonado;
    private boolean carga;
    private ArrayList<Arbol> arbolesVivos;
    private ArrayList<Arbol> arbolesMuertos;
    private ArrayList<Insumo> insumos;

    /**
     *
     * @param IdLote
     * @param areaTotal
     * @param fechaDesyerbado
     * @param fechaAbonado
     * @param carga
     */
    public Lote(Long IdLote, double areaTotal, String fechaDesyerbado, String fechaAbonado, boolean carga) {
        this.IdLote = IdLote;
        this.areaTotal = areaTotal;
        this.fechaDesyerbado = fechaDesyerbado;
        this.fechaAbonado = fechaAbonado;
        this.carga = carga;
        this.arbolesMuertos = new ArrayList<>();
        this.arbolesVivos = new ArrayList<>();
        this.insumos = new ArrayList<>();
        frecDesyer = 60;
    }

    /**
     *
     * @return
     */
    public int getFrecDesyer() {
        return frecDesyer;
    }

    /**
     *
     * @param frecDesyer
     */
    public void setFrecDesyer(int frecDesyer) {
        this.frecDesyer = frecDesyer;
    }

    private int insumo(int[] cantidad) {
        int hec = (int) this.getAreaTotal() / 10000;
        if (this.arbolesVivos.size() < 5000 * hec) {
            return cantidad[0] * hec;
        } else if (this.arbolesVivos.size() < 7500 * hec) {
            return cantidad[1] * hec;
        } else {
            return cantidad[2] * hec;
        }
    }

    /**
     *
     * @return
     */
    public int[] insumos() {
        //nitrogeno-potasio-fosforo,magnecio,azufre
        int[] insum = new int[]{insumo(new int[]{255, 285, 300}), insumo(new int[]{220, 250, 260}), insumo(new int[]{50, 48, 43})};
        return insum;
    }

    //Óptimo económico: 9.404 - 9.852 plantas/ha

    /**
     *
     * @return
     */
    public double[] optimoEconomico() {
        double[] optimo = {(this.areaTotal / 10000) * 9.404, (this.areaTotal / 10000) * 9.852};
        return optimo;
    }

    /**
     *
     */
    public Lote() {
    }

    /**
     *
     * @return
     */
    public Long getIdLote() {
        return IdLote;
    }

    /**
     *
     * @return
     */
    public double getAreaTotal() {
        return areaTotal;
    }

    /**
     *
     * @param areaTotal
     */
    public void setAreaTotal(int areaTotal) {
        this.areaTotal = areaTotal;
    }

    /**
     *
     * @return
     */
    public String getFechaDesyerbado() {
        return fechaDesyerbado;
    }

    /**
     *
     * @param fechaDesyerbado
     */
    public void setFechaDesyerbado(String fechaDesyerbado) {
        this.fechaDesyerbado = fechaDesyerbado;
    }

    /**
     *
     * @return
     */
    public String getFechaAbonado() {
        return fechaAbonado;
    }

    /**
     *
     * @param fechaAbonado
     */
    public void setFechaAbonado(String fechaAbonado) {
        this.fechaAbonado = fechaAbonado;
    }

    /**
     *
     * @param id
     */
    public void matarArbol(int id) {
        arbolesMuertos.add(arbolesVivos.get(id));
    }

    /**
     *
     * @param arbol
     */
    public void addArbol(Arbol arbol) {
        arbolesVivos.add(arbol);
    }

    /**
     *
     * @return
     */
    public boolean isCarga() {
        return carga;
    }

    /**
     *
     * @param carga
     */
    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    /**
     *
     * @return
     */
    public ArrayList<Arbol> getArbolesVivos() {
        return arbolesVivos;
    }

    /**
     *
     * @param arbolesVivos
     */
    public void setArbolesVivos(ArrayList<Arbol> arbolesVivos) {
        this.arbolesVivos = arbolesVivos;
    }

    /**
     *
     * @return
     */
    public ArrayList<Arbol> getArbolesMuertos() {
        return arbolesMuertos;
    }

    /**
     *
     * @param arbolesMuertos
     */
    public void setArbolesMuertos(ArrayList<Arbol> arbolesMuertos) {
        this.arbolesMuertos = arbolesMuertos;
    }

    /**
     *
     * @return
     */
    public ArrayList<Insumo> getInsumos() {
        return insumos;
    }

    /**
     *
     * @param insumo
     */
    public void addInsumo(Insumo insumo) {
        this.insumos.add(insumo);
    }

    /**
     *
     * @param insumos
     */
    public void setInsumos(ArrayList<Insumo> insumos) {
        this.insumos = insumos;
    }

    /**
     *
     * @param insumo
     * @param cantidadaGastarEnKg
     */
    public void gastarInsumo(Insumo insumo, Double cantidadaGastarEnKg) {
        for (Insumo insumo1 : this.insumos) {
            if (insumo1.getNombreInsumo().equals(insumo.getNombreInsumo())) {
                insumo1.setCantidadEnStock(insumo1.getCantidadEnStock() - cantidadaGastarEnKg);
            }
        }
        System.out.println("Insumo No encontrado");
    }

}
