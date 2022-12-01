package actividadarreglos;

import java.util.Scanner;

public class Utilidades {

    private static Scanner sc = new Scanner(System.in); // el in es para datos de entrada, out datos sde salida //

    public static String capturarDatos (){

        return sc.nextLine();

    }

    public static void imprimirMensaje (String mensaje){

        System.out.println(mensaje);

    }



}