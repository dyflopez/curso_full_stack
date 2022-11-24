package com.semillero;

import com.semillero.supermercado.CarritoCompras;
import com.semillero.supermercado.Producto;
import com.semillero.utilities.Utilidades;

public class Principal {

    public static void main(String[] args) {


        //caso 1 en el cual se usa el contructor con datos
        String nombreProducto;

        String categoria;

        double precio;

        int stock;

        int codigo;

        Producto producto;

        double totalProducto;

        CarritoCompras carritoCompras = new CarritoCompras();

        Utilidades.imprimirMensaje("Ingrese el nombre del producto ");
        nombreProducto= Utilidades.capturarValor();

        Utilidades.imprimirMensaje("Ingrese Categoria ");
        categoria= Utilidades.capturarValor();

        Utilidades.imprimirMensaje("Ingrese valor ");
        precio= Double.parseDouble(Utilidades.capturarValor());

        Utilidades.imprimirMensaje("Ingrese stock ");
        stock= Utilidades.capturarValorEntero();

        Utilidades.imprimirMensaje("Ingrese codigo ");
        codigo= Utilidades.capturarValorEntero();

        producto = new Producto(codigo,nombreProducto,categoria,precio,stock);

        totalProducto= carritoCompras.calcularProductoConIva(producto.getPrecio());

        Utilidades.imprimirMensaje("El valor total del producto es "+ totalProducto);

        Utilidades.imprimirMensaje("--------------**************forma 2********************--------------------");
        //Caso 2 se usa el constructor vacio

        Producto productoNuevo = new Producto();

        Utilidades.imprimirMensaje("Ingrese el nombre del producto ");
        productoNuevo.setNombre(Utilidades.capturarValor());

        Utilidades.imprimirMensaje("Ingrese Categoria ");
        productoNuevo.setCategoria(Utilidades.capturarValor());

        Utilidades.imprimirMensaje("Ingrese precio del producto ");
        productoNuevo.setPrecio(Double.parseDouble(Utilidades.capturarValor()));

        Utilidades.imprimirMensaje("Ingrese stock ");
        productoNuevo.setStock(Utilidades.capturarValorEntero());

        Utilidades.imprimirMensaje("Ingrese codigo ");
        productoNuevo.setCodigo(Utilidades.capturarValorEntero());

        Utilidades.imprimirMensaje("El valor total del producto es "+ carritoCompras.calcularProductoConIva(productoNuevo.getPrecio()));

    }


}
