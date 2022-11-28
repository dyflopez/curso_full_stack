package com.co.utilities;

import java.util.Scanner;
import java.util.regex.Pattern;


public class Utilies {

    static int numeroDeLetras;

    static int repeat;

    static char[] fraseArray;

    static int caracter;

    static int contador;



    static String frase = " ";


    public static void mostrarMensaje(String mensajeConsola) {
        System.out.println(mensajeConsola);


    }

    public static void mostrarVector() {

        for (int i = 0; i < fraseArray.length; i++) {

            if(fraseArray[i] != 0){

                System.out.println(fraseArray [i]);

            }



        }


    }

    public static int Contador() {


        Scanner entrada = new Scanner(System.in);


        do {
            frase = entrada.nextLine();
            frase = frase.toLowerCase();
            fraseArray = frase.toCharArray();

            String[] frasesArr = frase.split("-,&,\\*,@,#,%");

            for (int i = 0; i < frasesArr.length; i++) {
                if(frasesArr[i].equals(frase)){
                    System.out.println(frasesArr[i]);
                }

            }

        } while (frase.length() <= 2);


        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                numeroDeLetras++;

            }

        }
        System.out.println(frase.charAt(0) + "" + (numeroDeLetras - 2) + "" + frase.charAt(frase.length() - 1));


        return numeroDeLetras;
    }


    public static int letrasRepetidas() {

        //int z = 0;


        for (int i = 0; i < fraseArray.length; i++) {

            caracter = fraseArray[i];

            for (int j = 0; j < fraseArray.length; j++) {

                if (fraseArray[j] == caracter) {

                    contador++;

                }

            }

            System.out.println(fraseArray[i] + " " + contador);

            contador = 0;

        }
        int f[] = new int[fraseArray.length];

        int aux[] = new int[fraseArray.length];

        int elemento = 0, c, z = 0;

        for (int i = 0; i < fraseArray.length; i++) {

            c = 0;

            elemento = fraseArray[i];

            aux[i] = elemento;

            for (int j = 0; j < aux.length; j++) {

                if (elemento == aux[j]) {

                    c++;

                }

            }
            if(c==1){

                f[z] = elemento;

                z++;

            }

        }
        mostrarVector();

        return repeat;
    }


    }

