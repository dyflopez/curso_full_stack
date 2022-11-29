package com.market.producto;

public class Producto {

    private String nombreProducto;
    private double precio;
    private String marca;
    private String categoria;

    public Producto() {

    }


    public Producto(String nombreProducto, double precio, String marca, String categoria) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.marca = marca;
        this.categoria = categoria;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
