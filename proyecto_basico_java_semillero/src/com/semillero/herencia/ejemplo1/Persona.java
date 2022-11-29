package com.semillero.herencia.ejemplo1;

import java.time.LocalDate;

public class Persona {

    /**
     * atrubutos
     */
    private String nombre;

    private LocalDate fechaNacimiento;

    private String nacionalidad;

    private char genero;

    private String lenguaje;

    private int salario;

    /**
     * contructor
     */
    public Persona(String nombre, String nacionalidad, char genero, String lenguaje) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.lenguaje = lenguaje;
    }

    public Persona(String nombre, String nacionalidad, char genero, String lenguaje, int salario) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.lenguaje = lenguaje;
        this.salario = salario;
    }

    /**
     * metodos
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public void alimentarse(){
        System.out.printf("La persona come carne, vegetales, pescado, mariscos, hamburguesas , pizza, dumplings");
    }

    public void correr(){
        System.out.println("tres kilómetros por hora.");
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", genero=" + genero +
                ", lenguaje='" + lenguaje + '\'' +
                '}';
    }

}
