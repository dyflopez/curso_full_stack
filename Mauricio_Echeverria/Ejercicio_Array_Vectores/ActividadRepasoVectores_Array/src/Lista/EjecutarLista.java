package Lista;

import Utilities.Utilities;

import java.util.*;

public class EjecutarLista {

        static int c;

        public void ejecutarListaMetodo(){

            Scanner entrada = new Scanner(System.in);

            List<Integer> listaNumero = new ArrayList<>();

            int tamano = 0;

            int num;

            Utilities.mostrarMensaje("Ingrese el tamaño de la lista. ");
            tamano = Utilities.capturarEntero();



            for (int i = 0; i < tamano; i++) {
                System.out.println("Por favor ingrese el valor # " + (i+1));
                num = entrada.nextInt();
                listaNumero.add(num);

            }



            List<Integer> copiaLista = List.copyOf(listaNumero);




            for (int i = 0; i < copiaLista.size(); i++) {
                System.out.println(copiaLista.get(i));

            }

            Collections.sort(listaNumero);

            System.out.println("La lista ordenada de menor a mayor es: " + listaNumero);


            Comparator<Integer> comparador = Collections.reverseOrder();

            Collections.sort(listaNumero, comparador);

            System.out.println("Lista ordenada de mayor a menor: " + listaNumero);

            /*for (int i = 0; i < copiaLista.size(); i++) {
                if(copiaLista.equals(listaNumero)){
                    System.out.println("Esta en la posicion: " + (i+1));
                }

            }*/


            int elemento =  copiaLista.size()-1;
            for (int i = 0; i < listaNumero.size(); i++){
                if(elemento == listaNumero.get(i)){
                    System.out.println("El numero mayor fue ingresdo en la posicion: " + (i+1));
                }
            }


        }

    }
