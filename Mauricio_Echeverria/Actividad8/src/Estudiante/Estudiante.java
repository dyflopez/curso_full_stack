package Estudiante;

import Persona.Persona;

import java.util.Scanner;

public class Estudiante extends Persona {

    private int aula;
    private int idEstudent;

    private String gradoEstudiante;

    String salto;

    private double nota;




    public Estudiante(int ID, String nombre, String apellido, int edad, double nota, int aula) {
        super(ID, nombre, apellido, edad);
        this.aula = aula;
        this.nota = nota;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }



    public void califNotas(){
        if(this.getNota() >= 3){
            System.out.println("El estudiante aprobo la materia.");
        }else
            System.out.println("Lo siento, te espero el proximo semestre.");

    }

    @Override
    public void registro() {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Ingresa el ID del estudiante: ");
        idEstudent = entrada.nextInt();

        salto = entrada.nextLine();

        System.out.println("Ingresa el grado del año en curso: ");
        gradoEstudiante = entrada.nextLine();


    }

    @Override
    public void tomarAsignatura() {
        System.out.println("El estudiante no puede tomar la asignatura.");
    }

    @Override
    public String toString() {
        return "Estudiante: " +
                "\n idEstudent: " + idEstudent + "\n nombre: " + getNombre() + "\n apellido: " + getApellido() +
                "\n aula : " + aula + "\n edad: " + getEdad() + "\n grado: " + gradoEstudiante ;
    }
}
