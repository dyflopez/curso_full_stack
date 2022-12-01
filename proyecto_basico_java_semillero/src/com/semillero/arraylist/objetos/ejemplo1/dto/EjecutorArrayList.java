package com.semillero.arraylist.objetos.ejemplo1.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EjecutorArrayList {


    private List<Empleado> empleadoList = new ArrayList<>();

    public void ejecutar(){

        System.out.println("Hola estas en el proceso de arreglo con objetos");

        verTamanoArreglo();

        Empleado  empleado = new Empleado();

        empleado.setApellidos("florez");
        empleado.setNombre("Daniel");
        empleado.setSalario(10);
        empleado.setFechaNacimiento(LocalDate.now());

        empleadoList.add(empleado);

        verTamanoArreglo();

        System.out.println("imprimir informacion");

        for (Empleado simpleEmpleado:empleadoList) {

            System.out.println(simpleEmpleado.toString());

        }

        empleado = new Empleado();

        empleado.setApellidos("lopez");
        empleado.setNombre("gustavo");
        empleado.setSalario(100);
        empleado.setFechaNacimiento(LocalDate.now());


        empleadoList.add(empleado);


        System.out.println("mostrar datos");

        for (Empleado simpleEmpleado:empleadoList) {

            System.out.println(simpleEmpleado.toString());

        }

    }

    public void verTamanoArreglo(){
        System.out.println("el tamaño del arreglo es :" +this.empleadoList.size());
    }

}
