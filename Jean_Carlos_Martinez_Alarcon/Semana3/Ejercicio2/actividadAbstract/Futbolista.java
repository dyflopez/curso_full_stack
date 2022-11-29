package actividadh;

public class Futbolista extends SeleccionFutbol{

    private int dorsal;
    private String posicion;



    public Futbolista(int id, String nombre, String apellidos) {
        super(id, nombre, apellidos);
        this.dorsal = 10;
        this.posicion = "Delantero";

    }

    public Futbolista(int idEquipo, String nombreEquipo, int anioFundacion, int id, String nombre, String apellidos, int dorsal, String posicion) {
        super(idEquipo, nombreEquipo, anioFundacion, id, nombre, apellidos);
        this.dorsal = dorsal;
        this.posicion = posicion;

    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getMarca() {
        return posicion;
    }

    public void setMarca(String marca) {
        this.posicion = marca;
    }


    @Override
    public void Concentrase(){
        System.out.println("El tiempo de concentracion es cada 2 dias o 4 si hay partido");
    }
    @Override
    public void Viajar (){
        System.out.println("Tener documentacion preparada para el viaje");
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", Posicion = '" + posicion + '\'' +
                ", id = '" + this.getId() + '\'' +
                ", Nombre = '" + this.getNombre() + '\'' +
                ", Apellido = '" + this.getApellidos() + '\'' +
                ", Nombre del Equipo = '" + this.getNombreEquipo() + '\'' +
                ", Año Fundacion = '" + this.getAnoFundacion() + '\'' +
                ", ID Equipo = '" + this.getIdEquipo() + '\'' +
                 '}';
    }

    @Override
    public void salarioNeto() {

        System.out.println("El futbolista gana 4 millones");
    }
}





