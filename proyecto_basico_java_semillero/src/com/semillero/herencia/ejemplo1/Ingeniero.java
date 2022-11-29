package com.semillero.herencia.ejemplo1;

import java.time.LocalDate;

public class Ingeniero extends Persona{

    private String cargo;

    private String tipo;


    public Ingeniero(String nombre, String nacionalidad, char genero, String lenguaje, int salario, String cargo, String tipo) {
        super(nombre, nacionalidad, genero, lenguaje, salario);
        this.cargo = cargo;
        this.tipo = tipo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void correr(){
        System.out.println(" un ingeniero no corre ya que el ingniero es gordito");
    }


    /**
     * sobre carga
     */
    public void validarSalario(){
        if(this.getSalario() < 1000000){
            System.out.printf("El ingeniero esta mal pago");
        }else{
            System.out.printf("El ingeniero esta re bn pago");
        }
    }

    public void validarSalario(int salarioPromedio){
        if(this.getSalario() < salarioPromedio){
            System.out.printf("Le han hecho una buena propuesta de sueldo al ingeniero  ");
        }else{
            System.out.printf("quedarce en el trabajo actual ya que no ofrecieron buena plata , tacaños");
        }
    }

}
