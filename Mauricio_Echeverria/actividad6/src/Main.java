import java.util.Scanner;

public class Main {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        Producto producto = new Producto();
        int opcion = 0;

        System.out.println("-------------------------------------------------- ");
        System.out.println("     --->       1.  Carrito                 <---   ");
        System.out.println("                                            ");
        System.out.println("            ---Digite una Opcion---         ");
        opcion = entrada.nextInt();


        switch (opcion) {

            case 1:
                Producto.mostrarMensaje("Ingrese el codigo del producto");
                Producto.ingresarCodigoProducto();

                Producto.mostrarMensaje("Ingrese el nombre del producto");
                Producto.ingresarNombreProducto();

                Producto.mostrarMensaje("Ingrese el precio del producto");
                Producto.ingresarPrecioProducto();

                Producto.mostrarMensaje("Los Datos de la factura son  ");

                menu();
                break;

        }


    }

}