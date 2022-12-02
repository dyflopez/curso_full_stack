package com.semillero.arraylist.objetos.ejemplo2.supermercado;

import com.semillero.arraylist.objetos.ejemplo2.dto.Producto;
import com.semillero.arraylist.objetos.ejemplo2.uilidades.Utilities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionarSupermercado {
    private List<Producto> productoList = new ArrayList<>();
    static Producto producto;

    public void menu() {
        try {
            Scanner entrada = new Scanner(System.in);

            int opcion;


            System.out.println("      ⚜       Menu      ⚜      ");
            System.out.println("                                  ");
            System.out.println("\n   1.   Ingresar Productos      ");
            System.out.println("\n   2.   Listar los productos    ");
            System.out.println("\n   3.   Eliminar producto         ");
            System.out.println("\n   4.   Generar Factura         ");
            System.out.println("\n   5.   Guardar producto          ");
            System.out.println("\n   6.   Cargar producto        ");


            System.out.println("Por favor elija una opcion.");
            opcion = entrada.nextInt();

            switch (opcion) {


                case 1:
                    double precio = 0;
                    String idProducto = " ";
                    String nombre;
                    String marca;
                    int stock;

                    Utilities.mostrarMensaje("por favor ingrese la cantidad de productos que va registrar");
                    int cantidadProductos = Utilities.capturarEntero();

                    for (int i = 0; i < cantidadProductos; i++) {

                        Utilities.mostrarMensaje("Porfavor ingrese el id del producto " + (i + 1));
                        idProducto = Utilities.capturarString();

                        Utilities.mostrarMensaje("Porfavor ingrese el nombre del producto " + (i + 1));
                        nombre = Utilities.capturarString().toUpperCase();

                        Utilities.mostrarMensaje("Porfavor ingrese el  precio del producto " + (i + 1));
                        //producto.setPrecio(precio);
                        precio = Utilities.capturarDouble();


                        Utilities.mostrarMensaje("Porfavor ingrese la marca del producto " + (i + 1));
                        marca = Utilities.capturarString().toUpperCase();

                        Utilities.mostrarMensaje("Porfavor ingrese el valor del stock del producto " + (i + 1));
                        stock = Utilities.capturarEntero();

                        producto = new Producto(idProducto, nombre, precio, marca, LocalDate.now(), stock);

                        productoList.add(producto);


                    }
                    menu();
                    break;

                case 2:

                    for (Producto listar : productoList) {

                        Utilities.mostrarMensaje(listar.toString());

                    }
                    Utilities.mostrarMensaje("la cantidad de productos en la tienda es :" + productoList.size());

                    menu();
                    break;


                case 3:

                    boolean encontrado = false;

                    System.out.println("Ingresa el codigo del producto a eliminar");
                    idProducto = entrada.next();


                    for (int i = 0; i < productoList.size(); i++) {

                        if (productoList.get(i).getIdProducto().equals(idProducto)) {

                            encontrado = true;

                            productoList.remove(i);

                            System.out.println("Producto eliminado satisfactiamente ");

                        } else {

                            System.out.println("Codigo invalido");

                        }
                    }


                    menu();
                    break;

                case 4:

                    final double valorIVA = 0.19;


                    String empresa = "GRUPO EXITO S.A";
                    System.out.println("El codigo del producto es: " + producto.getIdProducto());
                    System.out.println("El nombre del producto es: " + producto.getNombre());
                    System.out.println("-----------Total de compra: " + producto.getPrecio());
                    System.out.println("-----------Total de compra mas IVA: " + ((producto.getPrecio() + (producto.getPrecio() * valorIVA))));
                    System.out.println("                               ");
                    System.out.println("------------------------------");
                    System.out.println(empresa);
                    System.out.println("------------------------------");


                    menu();
                    break;


            }
        } catch (Exception e) {
            System.out.println("Dato ingresado no valido");
        }


    }


}
