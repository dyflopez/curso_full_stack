package com.semillero.negocio;

public class Calculadora {

    /**
     * atributos
     */
    private int valor1;

    private int valor2;

    /**
     * constructor
     */
    public Calculadora(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public Calculadora() {
        this.valor1 = 10;
        this.valor2 = 20;
    }

    /**
     * metodos de acceso  get y set
     *
     */
    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int realizarSuma(){
        return  this.getValor1()+this.getValor2();
    }
}
