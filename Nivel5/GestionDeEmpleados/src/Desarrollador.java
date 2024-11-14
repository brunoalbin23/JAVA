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

    public void hacerTarea(int idTarea, int porcentaje){
        for (Tarea i : tareasPendientes){
            if (i.getId() == idTarea){
                i.sumarPorcentaje(porcentaje);
                if (i.estaCompletada()){
                    tareasPendientes.remove(i);
                    tareasTerminadas.add(i);
                }
            }
        }
    }

    public void verTareasPendientes(){
        if (tareasPendientes.isEmpty()){
            System.out.println("El desarrollador no tiene tareas pendientes asignadas");
        } else {
            System.out.println("Tareas pendientes:");
            for (Tarea i : tareasPendientes){
                System.out.println("Id: "+i.getId()+" - Nombre: "+i.getNombre()+"\nDescricpión: "+i.getDescripcion()+"\nPorcentaje terminado: "+i.getPorcentaje()+" - Lenguaje: "+i.getLenguaje());
            }
        }
    }

    public void verTareasTerminadas(){
        if (tareasTerminadas.isEmpty()){
            System.out.println("El desarrollador no tiene tareas terminadas aún");
        } else {
            System.out.println("Tareas terminadas:");
            for (Tarea i : tareasTerminadas){
                System.out.println("Id: "+i.getId()+" - Nombre: "+i.getNombre()+"\nDescricpión: "+i.getDescripcion()+"\nPorcentaje terminado: "+i.getPorcentaje()+" - Lenguaje: "+i.getLenguaje());
            }
        }
    }

    public void tareaNueva(Tarea tarea){
        tareasPendientes.add(tarea);
    }
}
