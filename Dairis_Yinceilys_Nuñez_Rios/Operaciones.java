public class Operaciones {

    int num1 = 7;
    int num2 = 9;
    int suma, resta, multiplicacion, division;



    public void Bienvenida(){
        System.out.println("Bienvenido");

    }
    public void suma(){

        suma = num1 + num2;
    }

    public void resta(){

        resta = num1 - num2;
    }

    public void multiplicacion(){

        multiplicacion = num1 * num2;
    }

    public void division(){

        division = num1 / num2;
    }

    public void resultado(){
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }


}
