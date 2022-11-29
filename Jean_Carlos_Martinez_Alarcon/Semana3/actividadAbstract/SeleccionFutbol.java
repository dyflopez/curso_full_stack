package actividadh;

public abstract class  SeleccionFutbol {

    private int idEquipo;
    private String nombreEquipo;
    private int anioFundacion;
    private int id;
    private String nombre;
    private String apellidos;

    public SeleccionFutbol(int idEquipo, String nombreEquipo, int anioFundacion, int id, String nombre, String apellidos) {
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
        this.anioFundacion = anioFundacion;
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public SeleccionFutbol(int id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public SeleccionFutbol() {

    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getAnoFundacion() {
        return anioFundacion;
    }

    public void setAnoFundacion(int anoFundacion) {
        this.anioFundacion = anoFundacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void Concentrase(){
        System.out.println();

    }
    public void Viajar (){
        System.out.println();
           }

    public abstract void salarioNeto();



    @Override
    public String toString() {
        return "SeleccionFutbol{" +
                "idEquipo=" + idEquipo +
                ", nombreEquipo='" + nombreEquipo + '\'' +
                ", anioFundacion=" + anioFundacion +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
