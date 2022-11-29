package com.semillero.abtraccion.ejemplo1;

public class Pajaro extends  Animal{

    private String colores;

    private String tamanoPico;


    public Pajaro(String especie, int numeroPatas, String colores, String tamanoPico) {
        super(especie, numeroPatas);
        this.colores = colores;
        this.tamanoPico = tamanoPico;
    }


    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public String getTamanoPico() {
        return tamanoPico;
    }

    public void setTamanoPico(String tamanoPico) {
        this.tamanoPico = tamanoPico;
    }

    @Override
    public String toString() {
        return "Pajaro{" +
                "colores='" + colores + '\'' +
                ", tamanoPico='" + tamanoPico + '\'' +
                '}';
    }

    @Override
    public void moverse() {
        System.out.println("caminar, correr y volar");
    }

    @Override
    public void comer(){
        System.out.printf("no come carne");
    }

}
