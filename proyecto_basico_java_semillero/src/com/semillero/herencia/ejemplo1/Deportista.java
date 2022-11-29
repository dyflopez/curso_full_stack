package com.semillero.herencia.ejemplo1;

public class Deportista extends Persona {

    private String tipoDiciplina;


    public Deportista(String nombre, String nacionalidad, char genero, String lenguaje, String tipoDiciplina) {
        super(nombre, nacionalidad, genero, lenguaje);
        this.tipoDiciplina = tipoDiciplina;
    }

    public String getTipoDiciplina() {
        return tipoDiciplina;
    }

    public void setTipoDiciplina(String tipoDiciplina) {
        this.tipoDiciplina = tipoDiciplina;
    }


    @Override
    public void correr(){
        System.out.println(" un deportista corre Dies kilómetros por hora.");
    }





}
