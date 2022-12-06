package Vector.utilidades;

import java.util.Scanner;

public class Utilities {

    // el in es para datos de entrada, out datos sde salida //

    public static String capturarDatos() {
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();

    }

    public static void imprimirMensaje(String mensaje) {

        System.out.println(mensaje);

    }

    public static int capturarEntero() {

        int numero = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            numero = scanner.nextInt();
        } catch (Exception e) {
            Utilities.imprimirMensaje("Error en el metodo capturarEntero() " + e.getMessage());
        } finally {
            Utilities.imprimirMensaje("Salio del metodo capturarEntero()");
        }

        return numero;

    }
}