package com.Actividad.Spring.services;

import org.springframework.stereotype.Service;

import java.util.Stack;
import java.util.StringTokenizer;

@Service
public class LogicaImpl implements IActividad {

    @Override
    public String cifrarMensaje(String mensaje) {

        StringBuilder cifrado = new StringBuilder();

        try {

            char vectorCaracteres[] = mensaje.toCharArray();
            int ultimaPosicion = mensaje.length() - 1;

            if (mensaje.length() > 2) {
                cifrado.append(vectorCaracteres[0]);

                for (int i = 1; i < ultimaPosicion; i++)
                {
                    cifrado.append("*");
                }
                cifrado.append(vectorCaracteres[ultimaPosicion]);

            } else {
                cifrado.append("La cadena tiene menos de dos digitos");
            }

        } catch (Exception e) {
            cifrado.append("Error en LogicaImpl.cifrarMensaje ");

        } finally {
            System.err.printf("Se ejecuto LogicaEjercicio.cifrarMensaje");
        }


        return cifrado.toString();
    }

    @Override
    public String cifrarConCaracter(String mensaje, String caracter) {

        StringBuilder cifrado = new StringBuilder();

        char vectorCaracter[] = mensaje.toCharArray();
        int ultimaPosicion = mensaje.length() - 1;

        if (mensaje.length() > 2)
        {
            cifrado.append(vectorCaracter[0]);

            for (int i = 1; i < ultimaPosicion; i++)
            {
                cifrado.append(caracter);
            }
            cifrado.append(vectorCaracter[ultimaPosicion]);

        } else {
            cifrado.append("La cadena tiene menos de dos digitos");
        }

        return cifrado.toString();
    }

    @Override
    public int sumar(int num1, int num2) {

        int suma;

        suma = num1+num2;

        return suma;
    }
    @Override
    public String invertirCadena(String texto){

        StringBuilder sb = new StringBuilder(texto); // SB Invierte una cadena de caracteres, caracter por caracter //
        Stack<String> palabras = new Stack<>(); // Invertir palabra x palabra
        StringTokenizer st = new StringTokenizer(texto, "*"); // Particionar la cadena (texto) palabra x palabra .

            while (st.hasMoreTokens()){
                palabras.add(st.nextToken()); // Stack (PILA) el primer elemento en entrar es el ultimo en salir
            }
            sb.reverse();

            while(!palabras.empty()){

            sb.append(palabras.pop());
            sb.append(' ');

        }

        return sb.toString();
    }


}