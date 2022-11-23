package productos;

import java.util.Scanner;

public class Producto {

    String nombre;
    double precio;
    int cantidad;
    double subTotal;
    double total;
    double impuesto;
    double iva=0.19;

    public Producto() {
    }
    public void obtenerDatos(){
        Scanner prod = new Scanner(System.in);
        System.out.println("Bienvenido a SuperMarket");

        System.out.println("Ingrese producto");
        nombre=prod.next();
        System.out.println("Digite cantidad de: " + nombre+ " que desea llevar");
        cantidad=prod.nextInt();
        System.out.print("Digite precio de: " + nombre);
        precio=prod.nextDouble();
        subTotal=precio*cantidad;
        impuesto=(subTotal*iva);
        total=subTotal+impuesto;

    }
    public void facturar(){
        System.out.println("--------FACTURA---------"
                + "\nProducto: "+nombre
                +"\nPrecio: "+precio
                +"\nCantidad comprada: "+cantidad
                +"\nSubTotal: "+subTotal
                +"\nImpuesto: "+impuesto
                +"\nTotal: "+total);
    }

}
