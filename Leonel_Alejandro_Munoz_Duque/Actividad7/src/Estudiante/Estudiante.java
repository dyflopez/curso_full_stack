package Estudiante;

import Persona.Persona;

public class Estudiante extends Persona {

    private int aula;


    public Estudiante(int ID, String nombre, String apellido, int edad, double nota, int aula) {
        super(ID, nombre, apellido, edad);
        this.aula = aula;
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
    public void tomarAsignatura() {
        System.out.println("El estudiante no puede tomar la asignatura.");
    }
}
