package com.semillero.arraylist.objetos.ejemplo2.supermercado;

import com.semillero.arraylist.objetos.ejemplo2.dto.Producto;
import com.semillero.arraylist.objetos.ejemplo2.uilidades.Utilities;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionarSupermercado {
    private List<Producto> productoList = new ArrayList<>();
    static Producto producto;
    static double total = 0;

    static int cantidadProductos;

    String ruta="C:/Users/Public/Documents/facturaCarrito.txt";

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
            System.out.println("\n   5.   Guardar compra          ");
            System.out.println("\n   6.   Cargar compra        ");


            System.out.println("Por favor elija una opcion.");
            opcion = entrada.nextInt();

            switch (opcion) {


                case 1:

                    //Ingresamos los productos y los agregamos a la lista

                    double precio = 0;

                    int idProducto;
                    String nombre;
                    String marca;
                    int stock;


                    do {

                        Utilities.mostrarMensaje("por favor ingrese la cantidad de productos que va registrar");
                        cantidadProductos = Utilities.capturarEntero();

                    }while (cantidadProductos <= 0);

                    for (int i = 0; i < cantidadProductos; i++) {

                        Utilities.mostrarMensaje("Porfavor ingrese el id del producto " + (i + 1));
                        idProducto = Utilities.capturarEntero();

                        Utilities.mostrarMensaje("Porfavor ingrese el nombre del producto " + (i + 1));
                        nombre = Utilities.capturarString().toUpperCase();

                        Utilities.mostrarMensaje("Porfavor ingrese el  precio del producto " + (i + 1));
                        precio = Utilities.capturarDouble();

                        //Creamos variable total donde se va sumando el precio de los productos ingresados
                        total += precio;


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

                    //Recorremo la lista de los productos con un for each

                    for (Producto listar : productoList) {

                        Utilities.mostrarMensaje(listar.toString());

                    }
                    Utilities.mostrarMensaje("la cantidad de productos en la tienda es :" + productoList.size());

                    menu();
                    break;


                case 3:
                    int opcionEliminar;

                    System.out.println("Que opcion desea escoger:");
                    System.out.println("\t\t\t 1. Eliminar 1 producto. ");
                    System.out.println("\t\t\t 2. Vaciar el carrito. ");


                    opcionEliminar = entrada.nextInt();

                    //Implementamos switch anidado para dar opcion de eliminar un solo producto o vaciar el carrito

                    switch (opcionEliminar) {

                        case 1:

                            boolean encontrado = false;

                            System.out.println("Ingresa el codigo del producto a eliminar");
                            idProducto = entrada.nextInt();


                            for (int i = 0; i < productoList.size(); i++) {

                                if (productoList.get(i).getIdProducto() == (idProducto)) {

                                    encontrado = true;

                                    productoList.remove(i);

                                    System.out.println("Producto eliminado satisfactiamente ");

                                } else {

                                    System.err.println("Codigo invalido");

                                }
                            }
                            menu();
                            break;

                        case 2:

                            productoList.clear();

                            if( productoList.isEmpty() ){
                                System.err.println("Tu carrito esta vacio. ");
                            }

                            menu();
                            break;


                    }


                case 4:

                    //Generamos la factura recorriendo los productos con un for e imprimiendo el total con el iva incluido

                    final double valorIVA = 0.19;


                    String empresa = "GRUPO EXITO S.A";

                    for (int i = 0; i < productoList.size(); i++) {

                        System.out.println("El codigo del producto es: " + productoList.get(i).getIdProducto());
                        System.out.println("El nombre del producto es: " + productoList.get(i).getNombre());
                        System.out.println("-----------Valor del producto: " + productoList.get(i).getPrecio());


                    }

                    System.out.println("-----------Total de compra mas IVA: " + (total + (total * valorIVA)));
                    System.out.println("                               ");
                    System.out.println("------------------------------");
                    System.out.println(empresa);
                    System.out.println("------------------------------");


                    menu();
                    break;


                case 5:

                    //Guardamos la informacion agregada en la lista en un archivo plano

                    File file = new File(ruta);

                    try {
                        if(!file.exists()){
                            file.createNewFile();
                        }

                        FileWriter fc  = new FileWriter(file);
                        BufferedWriter bw = new BufferedWriter(fc);

                        bw.write(productoList.toString());
                        bw.close();

                    }catch (Exception e){
                        System.err.println("fallo el programa " + e.getMessage());
                    }


                case 6:

                    //En el caso 6 implementamos el metodo BufferReader para leer el archivo plano anteriormente guardado

                    try{

                        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Public\\Documents\\facturaCarrito.txt"));
                        String temp = "";
                        String bfRead;
                        while ((bfRead = bf.readLine()) != null){

                            temp += bfRead;
                            System.out.println(bfRead);

                        }


                    }catch (Exception e){
                        System.err.println("No se encontro el archivo");

                    }

            }

        } catch (Exception e) {
            System.err.println("Dato ingresado no valido");

        }menu();


    }


}
