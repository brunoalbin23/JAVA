public class Tarea {

    private String nombre;
    private int id;
    private String descripcion;
    private int porcentaje;
    private boolean completada;
    private String lenguaje;

    public Tarea(String nombre, int id, String descripcion, String lenguaje) {
        this.nombre = nombre;
        this.id = id;
        this.descripcion = descripcion;
        this.completada = false;
        this.porcentaje = 0;
        this.lenguaje = lenguaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

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

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public void sumarPorcentaje(int porcentaje) {
        if (this.porcentaje + porcentaje >= 100){
            this.porcentaje = 100;
            setCompletada(true);
        } else {
            this.porcentaje += porcentaje;
        }
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public boolean estaCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}
