package com.semillero.abtraccion.ejemplo1;

public abstract class Animal {

    private String especie;

    private int numeroPatas;

    public Animal(String especie, int numeroPatas) {
        this.especie = especie;
        this.numeroPatas = numeroPatas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public  abstract  void moverse();

    public void comer(){
        System.out.printf("el come todo");
    }
}
