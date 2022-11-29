package com.semillero;



import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        //estructura para declar un vector es
        //List<TipoDato> nombreVariable = new ArrayList<TipoDato>();
        //de declarar un vector de numeros enteros
        List<Integer> numeros = new ArrayList<Integer>();

        //ver tamaño de la lista
        System.out.println( "el tamaño de la lista es = " +numeros.size());

        //agregar dato a la lista

        numeros.add(1);

        System.out.println( "el tamaño de la lista es = " +numeros.size());

        numeros.add(23);

        System.out.println( "el tamaño de la lista es = " +numeros.size());

        for (int index =0; index<numeros.size();index++){
            System.out.println(numeros.get(index));
        }

        System.out.println(numeros.get(0));


        System.out.println("----------FOR EACH------");

        for (Integer valor: numeros) {
            System.out.println(valor);
        }

        //eliminar un valor de la lista

        numeros.remove(1);


        System.out.println("----------Imprimir arreglo------");
        for (Integer valor: numeros) {
            System.out.println(valor);
        }

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println("----------Stream------");

        numeros.stream().forEach( n -> {
            System.out.println("el valor es " + n);
        });

        //elminar todos los datos

        numeros.clear();

        System.out.println("----------se limpia arreglo------");
        System.out.println( "el tamaño de la lista es = " +numeros.size());



    }


}
