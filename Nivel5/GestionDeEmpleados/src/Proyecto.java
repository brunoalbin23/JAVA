import java.util.ArrayList;

public class Proyecto {

    private String nombre;
    private int id;
    private String descripcion;
    private int dinero;
    private String fechaEntrega;

    private ArrayList<Equipo> equipos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDinero() {
        return dinero;
    }

    public void agregarDinero(int dinero) {
        this.dinero += dinero;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Proyecto(String nombre, int id, String descripcion, int dinero, String fechaEntrega) {
        this.nombre = nombre;
        this.id = id;
        this.descripcion = descripcion;
        this.dinero = dinero;
        this.fechaEntrega = fechaEntrega;
    }
}
