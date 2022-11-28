package com.co.utilities;

import java.util.*;


public class Utilies {

    static String[] fraseArray;

    static String frase = " ";
    static String fraseMinus = " ";

    static int contador = 0;

    static int i;

    static int i1 = 0;


    public static void mostrarMensaje(String mensajeConsola) {

        System.out.println(mensajeConsola);

    }



    public static int Contador() {

        Scanner entrada = new Scanner(System.in);

        do {
            frase = entrada.nextLine();
            fraseMinus = frase;
            //Separa oración cada que encuentra un guion
            fraseArray = fraseMinus.split("-");


            //Convierte Array a Lista
            List<String> listFrase = Arrays.asList(fraseArray);



            for (int i = 0; i < listFrase.size(); i++) {

                contador++;

                System.out.println(listFrase.get(i));

                System.out.println(listFrase.get(i).charAt(i1));


            }


            System.out.println(contador);


        } while (frase.length() <= 2);









        return 0;

    }



}

