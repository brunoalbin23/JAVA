public class Tarea {

    private String nombre;
    private int id;
    private int porcentaje;
    private boolean completada;

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

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public Tarea(String nombre, int id, boolean completada) {
        this.nombre = nombre;
        this.id = id;
        this.completada = completada;
        this.porcentaje = 0;
    }
}
