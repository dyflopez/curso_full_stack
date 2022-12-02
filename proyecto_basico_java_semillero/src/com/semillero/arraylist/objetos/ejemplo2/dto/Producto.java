package com.semillero.arraylist.objetos.ejemplo2.dto;

import java.time.LocalDate;

public class Producto {

    private int idProducto;
    private String nombre;

    private double precio;

    private String marca;

    private LocalDate fechaVencimiento;

    private int stock;

    /**
     * constructor
     */
    public Producto(String nombre, double precio, String marca, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.stock = stock;
    }

    public Producto(int idProducto, String nombre, double precio, String marca, LocalDate fechaVencimiento, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.fechaVencimiento = fechaVencimiento;
        this.stock = stock;
        this.idProducto = idProducto;
    }

    public Producto() {
    }

    /***
     * metodos
     */



    /**
     * metodos de get set
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * toString
     */

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                ", stock=" + stock +
                ", codigo= " + idProducto+
                '}';
    }
}
