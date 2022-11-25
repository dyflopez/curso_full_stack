// El usuario va a ingresar una oracion o frase de N caracteres y un separador de palabras.
//sistema realiace las siguientes acciones:
/*1.El sistema debe mantener la primera y ultima letra de la palabras
  2.El sistema debe contar y omitir las coincidencias de las letras ya existentes
  3.El sistema debe mostrar el resultado final
  4.El sistema no debe procesar las palabras que sean menores o igual a 2 caracteres.
  5.El sistema debe mantener las caracteres especiales
*/



package Principal;
import Utilities.Utilidades;

import javax.lang.model.SourceVersion;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String frase="";
        String primerCaracter="";
        char [] firstChar = primerCaracter.toCharArray();
        String ultimoCaracter = "";
        char [] lastChar = ultimoCaracter.toCharArray();


        Utilidades.imprimirMensaje("Escribir frase");
        frase=Utilidades.capturarDatos();


        primerCaracter=frase.substring(frase.length(0,1));

        ultimoCaracter = frase.substring(frase.length()-1);
        System.out.println(ultimoCaracter);









  /*      if (frase.length() >=2){

            primerCaracter = frase;
            ultimoCaracter = frase(frase.length()-1);
        }


            while (stWords.hasMoreTokens()) {

                frase = stWords.nextToken();
                System.out.println(frase.substring(0, 1));

            }
            ultimoCaracter = frase.charAt(frase.length() - 1);
            System.out.println(ultimoCaracter);//



            
       /*  {
            // Almacenamos cada caracter en la variable //
            primera = frase.charAt(i);
            for (int i = 0; i < frase.length(); i++)
            posFinal = frase.charAt(frase.length() - 1); ////Restas uno para obtener el índice del ultimo caracter //
            char caracterFinal = frase.charAt(posFinal);
            System.out.println(posFinal);

            }*/
        


    }
}


