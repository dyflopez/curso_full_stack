import Estudiante.Estudiante;

import Profesor.Profesor;

public class Main {

    public static void main(String[] args) {

        Profesor teach = new Profesor(1,"Eugenio","Pecha",65,"Calculo Vectorial");

        teach.tomarAsignatura();

        Estudiante student = new Estudiante(7,"Tom", "Sawyer",13,0.4,412);

        student.tomarAsignatura();

        student.califNotas();


    }
}
