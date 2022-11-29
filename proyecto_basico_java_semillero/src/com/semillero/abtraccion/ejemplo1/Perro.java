package com.semillero.abtraccion.ejemplo1;

import java.time.LocalDate;

public class Perro extends  Animal{

    private LocalDate fechaNacimiento;

    private String nombre;

    private String tamano;


    public Perro() {
        super("No identificada", 0);
    }

    public Perro(String especie, int numeroPatas) {
        super(especie, numeroPatas);
        this.fechaNacimiento = LocalDate.now();
        this.nombre="firulais";
        this.tamano="pequeño";
    }

    @Override
    public void moverse() {
        System.out.println("caminar o correr");
    }

    public Perro(String especie, int numeroPatas, LocalDate fechaNacimiento, String nombre, String tamano) {
        super(especie, numeroPatas);
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "fechaNacimiento=" + fechaNacimiento +
                ", nombre='" + nombre + '\'' +
                ", tamano='" + tamano + '\'' +
                ", especie='"+ this.getEspecie()+'\'' +
                ", numeroPatas='"+ this.getNumeroPatas()+'\'' +
                '}';
    }
}
