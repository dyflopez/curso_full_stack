package com.semillero.arraylist.objetos.ejemplo2;


import com.semillero.arraylist.objetos.ejemplo2.supermercado.GestionarSupermercado;
import com.semillero.arraylist.objetos.ejemplo2.uilidades.Utilities;
import jdk.jshell.execution.Util;

public class EjecutorEjemplo2Arrays {


    public void ejecutar(){

        GestionarSupermercado supermercado = new GestionarSupermercado();


        Utilities.mostrarMensaje("por favor ingrese la cantidad de productos que va registrar");
        int cantidadProductos = Utilities.capturarEntero();

        for (int i =0 ;i<cantidadProductos;i++){
            supermercado.agregarProducto();
        }


        supermercado.mostrarCantidadDeProductos();


        supermercado.imprimirProdutosForEach();

    }


}
