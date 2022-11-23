package com.semillero.principal;

import com.semillero.negocio.Calculadora;
import com.semillero.negocio.Estudiante;
import com.semillero.utilitis.Utilidades;

public class Ejecutor {

    public static void main(String[] args) {

        Utilidades.imprimirMensaje("Hola soy dany");

        Utilidades.imprimirMensaje("que cuentas?");
        //vamos a crear un objeto de la clase Calculadora
        // NombreClase nombrevariable  = new NombreClase(constructor);
        Calculadora calculadora = new Calculadora(1,90);
        System.out.println(calculadora.getValor1()+"");

        calculadora.setValor1(100);

        System.out.println(calculadora.getValor1()+"");

        int resultadoSuma = calculadora.realizarSuma();

        Utilidades.imprimirMensaje("el resultado de la suma es = " + resultadoSuma);


        Estudiante daniel = new Estudiante(1,"Daniel","quinder");

        daniel.validarEstadoEstudiante();

        daniel.setEstado(false);

        daniel.validarEstadoEstudiante();



    }



}
