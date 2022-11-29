package com.market.ppal;

import com.market.producto.Carro;
import com.market.producto.Producto;
import com.market.utilities.Utilidades;

import java.util.Scanner;

public class Principal {

        private static Scanner teclado = new Scanner(System.in);
        private static Carro carroCompra = new Carro();
        private static Producto newProducto = new Producto(); // Objeto, construtor vacio //


    public static void main(String[] args) {

        double totalProducto;

        String opcion= " ";

        do {
                System.out.println("\n\t Supermercado  \n\t");
                System.out.println("\n\t-----------------\n");
                System.out.println("\n\tEscoja la opcion \n");
                System.out.println("\n\t[1] Añadir productos \n");
                System.out.println("\n\t[2] Carrito ♪♪ \n");
                System.out.println("\n\t[3] comprar ☺ \n");
                System.out.println("\n\t[4] Salir ♥  \n");
                        opcion=teclado.nextLine();



           switch (opcion) {

                    case "0":
                    System.out.println("\n\t Fin \n");
                    break;
                    case "1":
                    System.out.println("\n\t Añadir productos ");
                    Utilidades.imprimirMensaje("Ingrese el nombre del producto");
                    newProducto.setNombreProducto(Utilidades.capturarDatos());
                    Utilidades.imprimirMensaje("Ingrese el precio del producto");
                    newProducto.setPrecio(Double.parseDouble(Utilidades.capturarDatos()));
                    Utilidades.imprimirMensaje("Ingrese la marca del producto");
                    newProducto.setMarca(Utilidades.capturarDatos());
                    Utilidades.imprimirMensaje("Ingrese la categoria del producto");
                    newProducto.setCategoria(Utilidades.capturarDatos());




                    break;

                    case "2":
                   System.out.println("\n\t productos registrados");


                    break;
                    case "3":
                   System.out.println("\n\t caja 🙀🙀🙀 ");
                   totalProducto = carroCompra.calcularProductoIva(newProducto.getPrecio());
                   Utilidades.imprimirMensaje("El valor total es: "+totalProducto);
                    break;
                   case "4":
                    System.out.println("\n\t Vuelva pronto 😎😎");
                    break;
                   default:
                    System.out.println("\n-----Opcion Erronea😋---");
                   break;

                       }


                }while (!opcion.equals("0"));

    }
}
