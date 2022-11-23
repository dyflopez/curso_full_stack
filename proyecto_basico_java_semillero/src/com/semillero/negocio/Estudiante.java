package com.semillero.negocio;

import com.semillero.utilitis.Utilidades;

import java.time.LocalDate;

public class Estudiante {


    private int codigo;

    private String nombre;

    private String grado;

    private LocalDate fechaNacimiento;

    private boolean estado;

    public Estudiante(int codigo, String nombre, String grado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.grado = grado;
        this.fechaNacimiento = LocalDate.now();
        this.estado = true;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void validarEstadoEstudiante(){
        if(this.estado){
            Utilidades.imprimirMensaje("esta activo el estudiante  " + this.nombre);
        }else {
            Utilidades.imprimirMensaje("esta inactivo el estudiante "+ this.nombre);
        }
    }

}
