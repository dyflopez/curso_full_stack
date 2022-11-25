import java.util.Scanner;

public class Producto {

    static Producto p = new Producto();

    private int codigoProducto;
    private String nombreProducto;
    private double precioProducto;

    private int factura;


    public Producto() {
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }


    public double getPrecioProducto(double precioProducto) {
        return this.precioProducto;
    }

    public void  setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getFactura(int factura) {
        return this.factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }


    public static void mostrarMensaje(String mensajeConsola) {
        System.out.println(mensajeConsola);
    }

    public static int ingresarCodigoProducto() {

        int codigoProdcuto;
        Scanner entrada = new Scanner(System.in);
        codigoProdcuto = entrada.nextInt();
        p.setCodigoProducto(codigoProdcuto);

        return codigoProdcuto;
    }

    public static String ingresarNombreProducto() {

        String nombreProducto;

        Scanner entrada = new Scanner(System.in);

        nombreProducto = entrada.next();
        p.setNombreProducto(nombreProducto);


        return nombreProducto;

    }

    public static double ingresarPrecioProducto() {

        double precioProducto;

        Scanner entrada = new Scanner(System.in);

        precioProducto = entrada.nextDouble();
        p.setPrecioProducto(precioProducto);

        double valorIVA ;
        valorIVA = precioProducto * 0.19;

        String empresa = "GRUPO EXITO S.A";
        System.out.println("El codigo del producto es: " + p.getCodigoProducto());
        System.out.println("El nombre del producto es: " + p.getNombreProducto());
        System.out.println("-----------Valor del Producto: " + p.getPrecioProducto(precioProducto));
        System.out.println("-----------Total de Producto mas IVA: " + ((p.getPrecioProducto(precioProducto) + valorIVA )));
        System.out.println("                               ");
        System.out.println("------------------------------");
        System.out.println(empresa);
        System.out.println("------------------------------");

        return precioProducto;
    }


}