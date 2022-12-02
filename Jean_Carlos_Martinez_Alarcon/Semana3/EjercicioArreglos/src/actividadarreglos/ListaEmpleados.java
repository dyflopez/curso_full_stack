package actividadarreglos;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaEmpleados {

        Scanner sc = new Scanner(System.in);
        private ArrayList<Empleado> empleadoList = new ArrayList<>();
        public void ingresoEmpleados () {


            Empleado empleado = new Empleado();


            int num = 0;


            do {
                Utilidades.imprimirMensaje("\nIngrese la cantidad de empleados\n");
                num = Integer.parseInt(Utilidades.capturarDatos());
            } while (num < 1);

            for (int i = 0; i < num; i++) {

                empleado = new Empleado();

                Utilidades.imprimirMensaje("Ingrese el nombre del empleado");
                empleado.setNombre(Utilidades.capturarDatos());
                Utilidades.imprimirMensaje("Ingrese el Apellido del empleado");
                empleado.setApellido(Utilidades.capturarDatos());
                Utilidades.imprimirMensaje("Ingrese el Cargo del empleado");
                empleado.setCargo(Utilidades.capturarDatos());
                boolean salir = false;
                do {
                    Utilidades.imprimirMensaje("Ingrese el sueldo del empleado");
                    double sueldo = Double.parseDouble(Utilidades.capturarDatos());
                    if (sueldo>=0){
                    empleado.setSueldo(sueldo);
                    salir=true;
                    }else{
                        System.out.println("Vuelva a ingresar el sueldo ");
                    }
                    }while(!salir);

                empleadoList.add(empleado);

            }
        }

            public void empleadosCompletos () {


                Utilidades.imprimirMensaje("\n\t La cantidad de empleados son : "+empleadoList.size());

                System.out.println("\n\t Los empleados son: \t\n");

                for (Empleado employee : empleadoList) {

                    System.out.println(employee.toString());
                }

              }


            public void calcularSalario() {

                for (int i = 0; i < empleadoList.size(); i++) {
                    if (empleadoList.get(i).getSueldo() < 1000000){
                        System.out.println("*" + empleadoList.get(i).getNombre());
                         }else{
                    System.out.println(empleadoList.get(i).getNombre());
                }

            }

        }

}







