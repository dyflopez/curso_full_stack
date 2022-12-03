package Supermercado.Principal;

public class Producto {

    private String nombreProducto;
    private String categoria;
    private double precio;


    public Producto(String nombreProducto, String categoria, double precio) {
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.precio = precio;
    }

    public Producto() {

    }




    @Override
    public String toString() {
        return "Producto{" +
                "Nombre del Producto= '" + nombreProducto + '\'' +
                ", categoria= '" + categoria + '\'' +
                ", precio= " + precio +
                '}';
    }


    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
