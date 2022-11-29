import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Ingrese un numero ");
        num1= sc.nextInt();

        System.out.println("Ingrese un numero ");
        num2= sc.nextInt();

        Operacion ope = new Operacion();

        ope.sumar(num1,num2);
        ope.restar(num1,num2);
        ope.multiplicar(num1,num2);
        ope.dividir(num1,num2);
        ope.mostrarResultado();

    }
}