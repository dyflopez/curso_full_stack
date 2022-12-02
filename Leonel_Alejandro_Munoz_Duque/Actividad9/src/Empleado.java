import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int sueldo;

    List<Empleado> listEmpleado = new ArrayList<>();

    public Empleado() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void registro() {

        int numEmp = 0;

        Scanner entrada = new Scanner(System.in);

        try {

            System.out.println("Por favor ingrese el numero de Empleados a registrar: ");

            numEmp = entrada.nextInt();


        }catch (Exception e){

            System.out.println("Error, intente de nuevo. \n");

            registro();

        }





        for (int i = 0; i < numEmp; i++) {

            Empleado empleado = new Empleado();

            System.out.println("Ingresa el nombre del empleado: ");
            nombre = entrada.next();
            empleado.setNombre(nombre);

            do {

                System.out.println("Ingresa el sueldo del empleado: ");
                sueldo = entrada.nextInt();
                empleado.setSueldo(sueldo);

            } while (sueldo < 0);

            listEmpleado.add(empleado);

        }


    }


    public void consulta() {

        for (Empleado listar : listEmpleado) {

            System.out.println(listar);

        }


    }

    public void salario() {


        for (int i = 0; i < listEmpleado.size(); i++) {

            if (listEmpleado.get(i).getSueldo() < 1000000) {

                System.out.println("*" + listEmpleado.get(i).getNombre());

            } else {

                System.out.println(listEmpleado.get(i).getNombre());

            }

        }


    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo='" + sueldo + '\'' +
                '}';
    }
}
