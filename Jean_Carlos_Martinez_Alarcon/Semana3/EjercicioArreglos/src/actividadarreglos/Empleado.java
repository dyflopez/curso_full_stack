package actividadarreglos;

public class Empleado {


    private String nombre;
    private String apellido;
    private String cargo;
    private double sueldo;


    /* Construtor */



    /* Metodos */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{ " +
                "nombre= '" + nombre +  '\'' +
                ", apellido= '" + apellido  + '\'' +
                ", cargo= '" + cargo  + '\'' +
                ", sueldo= " + sueldo  +
                '}';
    }




}


