package com.easycoffee;

import java.util.ArrayList;

public class Trabajador extends Persona {

    private double salario;
    private ArrayList<Jornada> jornada = new ArrayList<>();

    public Trabajador(double salario, Long cedula, String nombre, String apellido, boolean estado) {
        super(cedula, nombre, apellido, estado);
        this.salario = salario;
    }


    public void insertarJornada(Jornada jornada) {
        this.jornada.add(jornada);
    }

    public ArrayList<Jornada> getJornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada.add(jornada);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double obtenerRendimiento() {
        return 0;
    }
}
