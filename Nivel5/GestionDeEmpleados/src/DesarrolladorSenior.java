import java.util.ArrayList;

public class DesarrolladorSenior extends Empleado{

    private ArrayList<Proyecto> proyectos;
    private int presupuesto;
    private int bonoAnual;

    public DesarrolladorSenior(int cedula, String nombre, String correo, String direccion, int salario){
        super(cedula, nombre, correo, direccion, salario);
    }

    public void crearTarea(){

    }

    public void asignarTarea(Desarrollador desarrollador, Tarea tarea){

    }
}
