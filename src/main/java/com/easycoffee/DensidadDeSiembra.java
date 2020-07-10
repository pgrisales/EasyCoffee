package com.easycoffee;

/**
 *
 * @author Hp
 */
public class DensidadDeSiembra {

    private String[] variedad;
    private double[] A;
    private double[] B;

    /**
     *
     */
    public DensidadDeSiembra() {
        this.variedad = new String[]{"Típica", "Borbón", "Maragogipe", "Tabi", "Caturra", "Variedad Colombia"};
        this.A = new double[]{6.0, 9.0, 12.0};
        this.B = new double[]{1.0, 1.42, 2.0};
    }

    /**
     *
     * @param variedad
     */
    public void densidadDeSiembra(int variedad) {

    }

}
