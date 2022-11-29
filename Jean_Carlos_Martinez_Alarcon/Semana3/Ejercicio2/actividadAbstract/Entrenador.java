package actividadh;

public class Entrenador extends SeleccionFutbol{

    private String nacionalidad;

    public Entrenador(int idEquipo, String nombreEquipo, int anioFundacion, int id, String nombre, String apellidos, String nacionalidad) {
        super(idEquipo, nombreEquipo, anioFundacion, id, nombre, apellidos);
        this.nacionalidad = nacionalidad;
    }


    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


    @Override
    public void Concentrase(){
        System.out.println("El tiempo de concentracion es cada semana despues de partido");

    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "nacionalidad='" + nacionalidad + '\'' +
                ", Nombre del Equipo = '" + this.getNombreEquipo() + '\'' +
                ", Año Fundacion = '" + this.getAnoFundacion() + '\'' +
                ", ID Equipo = '" + this.getIdEquipo() + '\'' +
                ", id Entrenador = '" + this.getId() + '\'' +
                ", Nombre = '" + this.getNombre() + '\'' +
                ", Apellido = '" + this.getApellidos() + '\'' +
                '}';
    }

    @Override
    public void salarioNeto() {

        System.out.println("El Entrenador le pagan por partidos GANADOS👳‍👳‍");
    }
}
