package com.easycoffee;

import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class Trabajador extends Persona {

    private double salario;
    private ArrayList<Jornada> jornada = new ArrayList<>();

    /**
     *
     * @param salario
     * @param cedula
     * @param nombre
     * @param apellido
     * @param estado
     */
    public Trabajador(double salario, Long cedula, String nombre, String apellido, boolean estado) {
        super(cedula, nombre, apellido, estado);
        this.salario = salario;
    }

    /**
     *
     * @param jornada
     */
    public void insertarJornada(Jornada jornada) {
        this.jornada.add(jornada);
    }

    /**
     *
     * @return
     */
    public ArrayList<Jornada> getJornada() {
        return jornada;
    }

    /**
     *
     * @param jornada
     */
    public void setJornada(Jornada jornada) {
        this.jornada.add(jornada);
    }

    /**
     *
     * @return
     */
    public double getSalario() {
        return salario;
    }

    /**
     *
     * @param jornada
     */
    public void setJornada(ArrayList<Jornada> jornada) {
        this.jornada = jornada;
    }

    /**
     *
     * @param salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     *
     * @return
     */
    public double obtenerRendimiento() {
        return 0;
    }
}
