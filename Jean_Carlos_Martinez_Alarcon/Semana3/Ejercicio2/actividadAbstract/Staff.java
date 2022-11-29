package actividadh;

public class Staff extends SeleccionFutbol {

    private String titulacion;
    private int aniosExperiencia;


    public Staff(int idEquipo, String nombreEquipo, int anioFundacion, int id, String nombre, String apellidos, String titulacion, int aniosExperiencia) {
        super(idEquipo, nombreEquipo, anioFundacion, id, nombre, apellidos);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }


    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void Concentrase(){
        System.out.println("Reunion semanal con novedades de jugadores");

    }


    @Override
    public String toString() {
        return "Staff{" +
                ", id Personal = '" + this.getId() + '\'' +
                ", Nombre = '" + this.getNombre() + '\'' +
                ", Apellido = '" + this.getApellidos() + '\'' +
                ", Nombre del Equipo = '" + this.getNombreEquipo() + '\'' +
                ", Año Fundacion = '" + this.getAnoFundacion() + '\'' +
                ", ID Equipo = '" + this.getIdEquipo() + '\'' +
                "titulacion='" + titulacion + '\'' +
                ", años de Experiencia=" + aniosExperiencia +
                '}';
    }

    @Override
    public void salarioNeto() {

        System.out.println("El personal de apoyo gana 4 millones");
    }

}
