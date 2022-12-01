package com.semillero.arraylist.objetos.ejemplo2.supermercado;

import com.semillero.arraylist.objetos.ejemplo2.dto.Producto;
import com.semillero.arraylist.objetos.ejemplo2.uilidades.Utilities;

import java.util.ArrayList;
import java.util.List;

public class GestionarSupermercado {


    private List<Producto> productoList = new ArrayList<>();

    public void agregarProducto(){

        Producto producto = new Producto();
        String  nombre;
        double precio;
        String marca;
        int stock;

        Utilities.mostrarMensaje("Porfavor ingrese el nombre del producto");
        nombre= Utilities.capturarString();

        Utilities.mostrarMensaje("Porfavor ingrese el  precio del producto");
        precio= Utilities.capturarDouble();

        Utilities.mostrarMensaje("Porfavor ingrese la marca del producto");
        marca= Utilities.capturarString();

        Utilities.mostrarMensaje("Porfavor ingrese el valor del stock del producto");
        stock= Utilities.capturarEntero();

        producto = new Producto(nombre,precio,marca,stock);

        productoList.add(producto);

    }

    public void mostrarCantidadDeProductos(){
        Utilities.mostrarMensaje("la cantidad de productos en la tienda es :" +productoList.size());
    }

    public void imprimirProdutosForEach(){
        for (Producto producto: productoList) {
            Utilities.mostrarMensaje(producto.toString());
        }
    }




}
