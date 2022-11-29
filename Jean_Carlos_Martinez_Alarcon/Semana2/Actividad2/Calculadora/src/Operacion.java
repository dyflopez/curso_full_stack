public class Operacion {

    int sumar;
    int restar;
    int multiplicar;
    int dividir;


    public void sumar(int num1, int num2){
        sumar =num1+num2;
    }
    public void restar(int num1, int num2){
        restar =num1-num2;
    }
    public void multiplicar(int num1, int num2){
        multiplicar =num1*num2;
    }
    public void dividir(int num1, int num2){
        dividir =num1/num2;
    }


    public void mostrarResultado(){

        System.out.println("La suma es: "+sumar);
        System.out.println("La resta es: "+restar);
        System.out.println("La Multiplicacion  es: "+ multiplicar);
        System.out.println("La division es: "+ dividir);

    }

}
