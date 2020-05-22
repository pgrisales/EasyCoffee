package com.easycoffee;

import java.util.ArrayList;

public class Trabajador {
    
    private double salario;
    private ArrayList<Jornada> jornada =new ArrayList<>();
    public Trabajador() {
    }

    public void insertarJornada(Jornada jornada) {
        this.jornada.add(jornada) ;
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
