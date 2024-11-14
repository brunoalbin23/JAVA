import java.util.ArrayList;

public class DesarrolladorSenior extends Empleado{

    private ArrayList<Proyecto> proyectos;
    private int presupuesto;
    private int bonoAnual;

    public DesarrolladorSenior(int cedula, String nombre, String correo, String direccion, int salario){
        super(cedula, nombre, correo, direccion, salario);
    }

    public Tarea crearTarea(String nombre, int id, String lenguaje){
        return new Tarea(nombre, id, lenguaje);
    }

    public void asignarTarea(int cedula, Tarea tarea){
        // como mierda hago esto
    }

    public void programar(int idTarea, int porcentaje){
        // COmo hago estoooooo ajsdnk
    }
}
