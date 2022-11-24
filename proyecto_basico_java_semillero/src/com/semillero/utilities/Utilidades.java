package com.semillero.utilities;

import java.util.Scanner;

public class Utilidades {

    private static Scanner scanner = new Scanner(System.in);
    public static void imprimirMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public static String  capturarValor(){
        return scanner.next();
    }

    /**
     * sobreCarga
     */

    public static int  capturarValorEntero(){
        return scanner.nextInt();
    }

}
