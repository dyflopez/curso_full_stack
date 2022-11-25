package com.semillero.supermercado;

public class CarritoCompras {


    public static  final double VALOR_IVA=0.18;

    public double calcularProductoConIva(double precio){

        double impuesto= precio*CarritoCompras.VALOR_IVA;

        double precioConIVaIncluido=precio+impuesto;

        return precioConIVaIncluido;

    }

}
