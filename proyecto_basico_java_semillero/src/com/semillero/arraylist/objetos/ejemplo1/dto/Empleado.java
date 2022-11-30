package com.semillero.arraylist.objetos.ejemplo1.dto;

import java.time.LocalDate;

public class Empleado {

    /**
     * atributos
     */

    private String nombre;

    private String apellidos;

    private LocalDate fechaNacimiento;

    private  double salario;

    /**
     * contructor
     *
     */


    /**
     * Metodos
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", salario=" + salario +
                '}';
    }
}
