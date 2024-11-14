import java.util.ArrayList;

public class Desarrollador extends Empleado{

    private ArrayList<Tarea> tareasPendientes;
    private ArrayList<Tarea> tareasTerminadas;
    private ArrayList<String> lenguajes;
    private int nivelHabilidad;
    private int bonoAnual;

    public Desarrollador(int cedula, String nombre, String correo, String direccion, int salario){
        super(cedula, nombre, correo, direccion, salario);
    }

    public void agregarLenguaje(String lenguaje){
        lenguajes.add(lenguaje);
    }

    // Este método simula mucho tiempo que el desarrollador a practicado e incrementa en 1 el nivel de hablidad
    public void entrenar(){
        if (nivelHabilidad<10){
            nivelHabilidad += 1;
        } else {
            System.out.println("EL desarrollador ya tiene un nivel 10 de habilidad!");
        }
    }

    public void hacerTarea(Tarea tarea, int porcentaje){
        tarea.sumarPorcentaje(porcentaje);
    }
}
