package Utilities;

import java.util.Scanner;

public class Utilidades {

    private static Scanner sc = new Scanner(System.in);

    public static String capturarDatos (){

        return sc.nextLine();

    }

    public static void imprimirMensaje (String mensaje){

        System.out.println(mensaje);

    }

}
