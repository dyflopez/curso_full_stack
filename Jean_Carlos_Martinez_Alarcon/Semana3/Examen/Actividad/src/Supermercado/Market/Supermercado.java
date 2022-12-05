package Supermercado.Market;

import Supermercado.Principal.Producto;
import Supermercado.Utilidades.Utilities;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Supermercado {


    private static ArrayList<Producto> productolist = new ArrayList<>();


    public void ingresoProductos() throws IOException {

        Producto producto = new Producto();

        String opcion="";


        do {
            Utilities.imprimirMensaje("\n\tSupermercado 🍔🍔\n");
            Utilities.imprimirMensaje("\n-------MENU-----------\n");
            Utilities.imprimirMensaje("[1☺]Añadir productos 🍳");
            Utilities.imprimirMensaje("[2☺]Lista de articulos 🍺");
            Utilities.imprimirMensaje("[3☺]Mostrar productos 🥩🍗🧀");
            Utilities.imprimirMensaje("[4☺]Eliminar productos🍽🥄");
            Utilities.imprimirMensaje("[5☺]Salvar productos🍤🍣🍚");
            Utilities.imprimirMensaje("[6☺]Cargar productos🎁");
            Utilities.imprimirMensaje("[7☺]Comprar🛒🛒");
            Utilities.imprimirMensaje("[8☺]salir🕶👓");
            Utilities.imprimirMensaje("Opcion");
            opcion = Utilities.capturarDatos();


            switch (opcion) {

                case "0":
                Utilities.imprimirMensaje("\n\t FIN");
                break;
                case "1":
                    anadirProducto();
                break;
                case "2":
                    listaDeArticulos();
                break;
                case "3":
                   mostrarProductos();

                break;
                case"4":
                    eliminarProductos();
                break;
                case"5":
                    salvarTxt();
                break;
                case"6":
                    cargarProductos();
                break;
                case"7":
                    comprar();
                break;
                case"8":

                Utilities.imprimirMensaje("\nGracias por su visita🎨\n");
                break;
                    default:
                    Utilities.imprimirMensaje("\nOpcion erronea\n");
                }
            }while (!opcion.equals("0")) ;


        }

        public void anadirProducto (){

            Producto producto = new Producto();

            int num=0;
            do {
                Utilities.imprimirMensaje("Ingrese la cantidad de productos");
                num = Utilities.capturarEntero();
            } while (num < 1);

            for (int i = 0; i < num; i++) {

                producto = new Producto();

                Utilities.imprimirMensaje("Nombre del Producto");
                producto.setNombreProducto(Utilities.capturarDatos());
                Utilities.imprimirMensaje("Categoria del Producto");
                producto.setCategoria(Utilities.capturarDatos());
                boolean salir = false;
                do {
                    Utilities.imprimirMensaje("Precio del Producto");
                    double valor =Utilities.capturarDouble();
                    if (valor>=0){
                        producto.setPrecio(valor);
                        salir=true;
                    }else{
                        Utilities.imprimirMensaje("Vuelva a ingresa el valor correcto");
                    }
                }while (!salir);

                productolist.add(producto);
            }



        }

        public void listaDeArticulos (){

            Utilities.imprimirMensaje("\n\tLos productos son: \n" +productolist.size());

            Utilities.imprimirMensaje("\n\tlista de articulos ♀\t\n");

            productolist.forEach(System.out::println);

                }

        public void mostrarProductos() {

            for (Producto produ : productolist) {

                Utilities.imprimirMensaje(produ.toString());
            }
        }
        public void eliminarProductos(){

            Producto producto = new Producto();

            Utilities.imprimirMensaje("\nEliminar productos\n");



            if (!productolist.isEmpty())
                Utilities.imprimirMensaje("\nLos productos eliminados: " +productolist.remove(productolist.size()-1));
            else
                Utilities.imprimirMensaje("\nLa lista esta vacia. No puedes borrar mas elementos");

            Utilities.imprimirMensaje("Hay " + productolist.size()  + " productos en la lista");

            Utilities.imprimirMensaje("\n🎄🎄🎄\n");

        }

        public static void salvarTxt(){

            Utilities.imprimirMensaje("\nSalvar productos\n");



            File productosSuper = new File("C:\\\\Users\\\\jmartala\\\\Downloads\\\\Rappi.txt");

            try {
                if (!productosSuper.exists()){
                     productosSuper.createNewFile();
                }
                FileWriter fc = new FileWriter(productosSuper);
                //SE CREA UN OBJETO DE TIPO BUFFEREDWRITER PARA PODER ESCRIBIR DENTRO DEL ARCHIVO//
                BufferedWriter bw = new BufferedWriter(new FileWriter(productosSuper));

                for (Producto p: productolist){
                   bw.write(p.getNombreProducto() + "\t" + p.getCategoria() + "\t" + p.getPrecio() + "\r\n");
                                       }
                    bw.close();
            }catch (Exception e){
                System.out.println("fallo el programa " + e.getMessage());
                //Captura un posible error le imprime en pantalla
            }

            Utilities.imprimirMensaje("\r\nInbox🎩🎩\r\n");

       }

        public void cargarProductos() throws IOException {
            Utilities.imprimirMensaje("Cargar productos");

            ArrayList<Producto> lista_productos = new ArrayList<>();

            try {
                File ruta = new File("C:\\Users\\jmartala\\Downloads\\Rappi.txt");
                FileReader fr = new FileReader(ruta);
                BufferedReader entrada = new BufferedReader(fr);
                String linea = "";
                String[] attr;


                while ((linea = entrada.readLine()) != null) {

                    linea.split(";");
                  //lista_productos.add(new Producto(attr[0],attr[1], Double.parseDouble(attr[2]))); // ACA SE CREA EL OBJETO

                    Utilities.imprimirMensaje(linea.toString());

                }




                        entrada.close();
                        fr.close();





            } catch(Exception e) {
                Utilities.imprimirMensaje("No existe el fichero indicado " + e.getMessage());

            }


            Utilities.imprimirMensaje("\r\nYujuuu🎩🎩\r\n");


        }
        public void comprar(){
        //Producto mercancia = new Producto();

        Utilities.imprimirMensaje("Carrito de compras🎃🎃");

            System.out.println("");

            productolist.forEach(System.out::println);


            double importe=0;
            for (Producto prod:productolist)

            importe = prod.getPrecio();

            double iva = +importe * 0.19;
            Utilities.imprimirMensaje("\n\tEl total de la caja es :  ");
            Utilities.imprimirMensaje("Total de la compra: "+ importe);
            Utilities.imprimirMensaje("Iva: "+ iva);
            Utilities.imprimirMensaje("Total de la compra "+ ( importe+iva ));
    }



    }




