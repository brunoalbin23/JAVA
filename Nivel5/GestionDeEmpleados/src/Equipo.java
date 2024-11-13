import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private int id;
    private String descripcion;

    private ArrayList<DesarrolladorSenior> desarrolladoresSr;
    private ArrayList<Desarrollador> desarrolladoresJr;

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

    public Equipo(String nombre, int id, String descripcion) {
        this.nombre = nombre;
        this.id = id;
        this.descripcion = descripcion;
    }

    public void agregarSr(DesarrolladorSenior desSr){
        desarrolladoresSr.add(desSr);
    }

    public void agregarJr(Desarrollador desJr){
        desarrolladoresSr.add(desJr);
    }

    public void eliminarEmpledo(int cedula){
        for (DesarrolladorSenior i : desarrolladoresSr){
            if (cedula == i.getCedula()){
                desarrolladoresSr.remove(i);
            }
        }
    }
}
