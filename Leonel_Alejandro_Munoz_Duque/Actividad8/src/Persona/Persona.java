package Persona;

public abstract class Persona {

    private int ID;

    private String nombre;

    private String apellido;

    private int edad;

    private double nota;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public abstract void registro();

    public void tomarAsignatura(){
        System.out.println("El profesor esta enfermo, no puede dar la clase");
    }

    public Persona(int ID, String nombre, String apellido, int edad) {

        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }
}
