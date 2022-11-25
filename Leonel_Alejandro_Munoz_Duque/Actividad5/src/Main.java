import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
        suma(0, 0);
        restar(0, 0);
        multiplicacion(0, 0);
        division(0, 0);


    }

    public static void menu() {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int resultado;

        int opcion;


        System.out.println("      ⚜       Menu      ⚜      ");
        System.out.println("                                  ");
        System.out.println("\n   1.   Sumar               ");
        System.out.println("\n   2.   restar              ");
        System.out.println("\n   3.   multiplicar         ");
        System.out.println("\n   4.   dividir             ");
        System.out.println("\n      Ingrese una Opcion        ");

        opcion = entrada.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Ingrese el numero 1 por favor: ");
                numero1 = entrada.nextInt();
                System.out.println("Ingrese el numero 2 por favor");
                numero2 = entrada.nextInt();
                resultado = suma(numero1, numero2);
                System.out.println("El resultado de la suma es: " + resultado);

                menu();
                break;


            case 2:
                System.out.println("Ingrese el numero 1 por favor: ");
                numero1 = entrada.nextInt();
                System.out.println("Ingrese el numero 2 por favor");
                numero2 = entrada.nextInt();
                resultado = restar(numero1, numero2);
                System.out.println("El resultado de la resta es: " + resultado);

                menu();
                break;


            case 3:
                System.out.println("Ingrese el numero 1 por favor: ");
                numero1 = entrada.nextInt();
                System.out.println("Ingrese el numero 2 por favor");
                numero2 = entrada.nextInt();
                resultado = multiplicacion(numero1, numero2);
                System.out.println("El resultado de la multiplicacion es: " + resultado);

                menu();
                break;

            case 4:
                System.out.println("Ingrese el numero 1 por favor: ");
                numero1 = entrada.nextInt();
                System.out.println("Ingrese el numero 2 por favor");
                numero2 = entrada.nextInt();
                resultado = division(numero1, numero2);
                System.out.println("El resultado de la division es: " + resultado);

                menu();
                break;


        }


    }


    public static int suma(int numero1, int numero2) {

        int resultado = 0;

        resultado = numero1 + numero2;

        return resultado;
    }

    public static int restar(int numero1, int numero2) {

        int resultado = 0;

        resultado = numero1 - numero2;

        return resultado;
    }

    public static int multiplicacion(int numero1, int numero2) {

        int resultado = 0;

        resultado = numero1 * numero2;

        return resultado;
    }

    public static int division(int numero1, int numero2) {

        int resultado = 0;

        resultado = (int) (numero1 * 1.0 / numero2);

        return resultado;
    }


}