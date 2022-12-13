package Utilities;

import java.util.Scanner;

public class Utilities {

    public static String capturarString() {

        String cadena;

        Scanner scanner = new Scanner(System.in);

        cadena = scanner.nextLine();

        return cadena;
    }

    public static void mostrarMensaje(String mensaje) {

        System.out.println(mensaje);

    }

    public static int capturarEntero() {

        int numero = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            numero = scanner.nextInt();
        } catch (Exception e) {
            Utilities.mostrarMensaje("Error en el metodo capturarEntero() " + e.getMessage());
        }

        return numero;

    }

    public static double capturarDouble() {

        double numero = 0.0;
        Scanner scanner = new Scanner(System.in);

        try {
            numero = scanner.nextDouble();
        } catch (Exception e) {
            Utilities.mostrarMensaje("Error en el metodo capturarDouble() " + e.toString());
        }


        return numero;

    }

}


