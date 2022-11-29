package actividadh;

public class Principal {
    public static void main(String[] args) {

        Futbolista f = new Futbolista(10,"Real barcelona",1980,1070,"P⚽le","Maradona",10,"Delantero");

        System.out.println(f.toString());
        f.Concentrase();
        f.Viajar();
        f.salarioNeto();

        Entrenador entrenador = new Entrenador (10,"Real barcelona",1980,5632,"Andres","Lozano","colombiano");
        System.out.println(entrenador.toString());
        entrenador.Concentrase();
        entrenador.salarioNeto();


        Staff staff = new Staff(10,"Real Barcelona",1980,50364,"Juana", "Perez", "Medico", 10);
        System.out.println(staff.toString());
        staff.Concentrase();
        staff.salarioNeto();














    }

}