package Profesor;

import Persona.Persona;

public class Profesor extends Persona {
    private String asignatura;


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

}
