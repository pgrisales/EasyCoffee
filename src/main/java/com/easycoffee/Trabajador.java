package com.easycoffee;

import java.util.ArrayList;

public class Trabajador extends Persona{
    
    private double salario;
    private ArrayList<Jornada> jornada =new ArrayList<>();

    public Trabajador(double salario, long cedula, String nombre, boolean estado) {
        super(cedula, nombre, estado);
        this.salario = salario;
    }


    public void insertarJornada(Jornada jornada) {
        this.jornada.add(jornada) ;
    }

    public ArrayList<Jornada> getJornada() {
        return jornada;
    }

    public void setJornada(ArrayList<Jornada> jornada) {
        this.jornada = jornada;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double obtenerRendimiento(){
        return 0;
    }
}
