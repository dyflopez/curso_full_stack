package Vector;

import Vector.utilidades.Utilities;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static <menor> void main(String[] args) {

        int num=0;
        int []list_nums= null;
        double mayor = 0;
        double menor = 0;
        int posicionMayor=0;
        int posicionMenor=0;


        do {
            Utilities.imprimirMensaje("Ingrese la cantidad de numeros a registrar 🎇");
            num = Utilities.capturarEntero();
        } while (num < 1);

                list_nums = new int[num];

            for (int i=0; i<num;i++) {   //  RECORRER LA INFO //
                   Utilities.imprimirMensaje("Digite el Nro: " + (i + 1));
                    list_nums[i] = Utilities.capturarEntero();


                    if (list_nums[i] > mayor) {
                        mayor = list_nums[i];
                        posicionMayor = i;

                    }
                    if (list_nums[i] < menor) {
                        menor = list_nums[i];
                        posicionMenor = i;
                    }
            }

                Arrays.sort(list_nums);

        System.out.println(" ");
            System.out.println("Lista de numeros de Menor a Mayor");
                for (int lista:list_nums)
                    System.out.print(lista+ " ");
        System.out.println(" ");
              System.out.println("Lista de numeros de Mayor a Menor");
                 for (int j=list_nums.length-1; j>=0; j-- ) {
                     System.out.print(""+list_nums[j]);
                 }

        System.out.println(" ");
             System.out.println("El numero mayor es: "+mayor + " La posicion es : "+posicionMayor);
               System.out.println("El numero menor es: "+menor + " La posicion es : "+posicionMenor);



    }
}