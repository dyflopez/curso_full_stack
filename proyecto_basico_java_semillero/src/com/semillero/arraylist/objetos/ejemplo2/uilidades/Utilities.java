package com.semillero.arraylist.objetos.ejemplo2.uilidades;

import java.util.Scanner;

public class Utilities {


    public static  String capturarString(){

        String cadena;

        Scanner scanner = new Scanner(System.in);

        cadena=scanner.next();


        return cadena;
    }

    public  static void mostrarMensaje(String mensaje){

        System.out.println(mensaje);

    }

    public  static void mostrarMensajError(String mensaje){

        System.err.println(mensaje);

    }

    public static  int capturarEntero(){

        int numero=0;
        Scanner scanner = new Scanner(System.in);

        try {
            numero=scanner.nextInt();
        }catch (Exception e){
            Utilities.mostrarMensajError("Error en el metodo capturarEntero() " + e.getMessage());

        }finally {
            Utilities.mostrarMensaje("Salio del metodo capturarEntero()");
        }


        return numero;

    }

    public static  double capturarDouble(){

        double numero=0.0;

        Scanner scanner = new Scanner(System.in);

        try {
            numero=scanner.nextDouble();
        }catch (Exception e){
            Utilities.mostrarMensajError("Error en el metodo capturarDouble() " + e.toString());
        }finally {
            Utilities.mostrarMensaje("Salio del metodo capturarDouble()");
        }

        return numero;

    }
}
