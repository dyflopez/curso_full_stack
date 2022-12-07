package Vector;

import Utilities.Utilities;

import java.util.Arrays;

public class EjecutarVector {

    public void ejecutarVectorMetodo(){

        int vector[] = null;

        //int vectorCopia[] = null;

        int tamano = 0;

        int valor, aux;

        Utilities.mostrarMensaje("Ingrese el tamaño del vector. ");
        tamano = Utilities.capturarEntero();

        vector = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            System.out.println("Por favor ingrese el valor # " + (i+1));
            vector[i] = Utilities.capturarEntero();
            
        }

        /*for (int i = 0; i < tamano; i++) {
            vectorCopia[i] = vector[i];
        }*/

        int[] vectorCopia = Arrays.copyOf(vector, tamano);

        System.out.println(vectorCopia);


        for (int i = 0; i < vectorCopia.length; i++) {
            System.out.println(vectorCopia[i]);

        }

        for (int i = 0; i < tamano; i++) {
            for (int j = i + 1; j < tamano; j++) {
                if(vector[i] < vector[j]){
                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
                
            }

        }

        for (int i = 0; i < tamano; i++) {
            System.out.println("El valor del campo " + i + " es: " + vector[i]);

        }
        boolean b = Arrays.equals(vector, vectorCopia);

        System.out.println("El numero mayor es: " + vector[0]);

        for (int i = 0; i < vectorCopia.length; i++) {

            if(vectorCopia[i] == vector[0]){

                System.out.println("El numero fue ingresado en la posicion: " + (i+1));

            }


        }

    }




}
