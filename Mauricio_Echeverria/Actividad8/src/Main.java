import Estudiante.Estudiante;

import Profesor.Profesor;

public class Main {

    public static void main(String[] args) {

        Profesor teach = new Profesor(1,"Eugenio","Pecha",65,"Calculo Vectorial");

        teach.registro();



        System.out.println(teach.toString());

        Estudiante student = new Estudiante(7,"Tom", "Sawyer",13,2.0,412);

        student.registro();

        System.out.println(student.toString());

        student.califNotas();




    }
}
