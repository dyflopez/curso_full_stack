package Profesor;

import Persona.Persona;

import java.util.Scanner;

public class Profesor extends Persona {
    private String asignatura;

    private int codigoTeach;

    private String salto;

    private String escalafonProfesor;

    public Profesor(int ID, String nombre, String apellido, int edad, String asignatura) {
        super(ID, nombre, apellido, edad);
        this.asignatura = asignatura;
    }


    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }


    @Override
    public void registro() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el ID del profesor: ");
        codigoTeach = entrada.nextInt();

        salto = entrada.nextLine();

        System.out.println("Ingresa el escalafon actual: ");
        escalafonProfesor = entrada.nextLine();

    }

    @Override
    public String toString() {
        return "Profesor{" + "ID: " + codigoTeach +  "\n nombre: " + getNombre() + "\n apellido: " + getApellido() +
                "\n edad: " + getEdad() +  "\n Escalafon: " + escalafonProfesor +   "\n asignatura='" + asignatura + '\'' +
                '}';
    }

}
