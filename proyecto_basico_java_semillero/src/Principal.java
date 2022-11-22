import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        String mensaje ;
        Principal.mostrarMensaje("Ingrese su nombre");
        mensaje= Principal.capturaPorConsola();

        Principal.mostrarMensaje("su nombre es " + mensaje);

    }


    /**
     * un metood que no retorna tiene la palabra void
     * a continuacion se da un ejemplo de un metodo que no retorna
     * public void nombreMetodo(){
     *     contenido
     * }
     */
    public static void mostrarMensaje(String mensajeConsola){
        System.out.println(mensajeConsola);
    }

    /**
     * Metodo que retorna una informacion  que captura por consola
     *
     * public tipoDatoDeRetorno nombreMetodo (parametros){
     *
     *     //los metodos que retornan siempre tienen que llevar la palabra reserbada returun
     *     Return;
     * }
     *
     */
    public static String capturaPorConsola(){
        String mensajeCapturado;
        Scanner capturaTeclado = new Scanner(System.in);

        mensajeCapturado = capturaTeclado.next();
        return mensajeCapturado;
    }
}
