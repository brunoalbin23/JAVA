import java.util.ArrayList;

public class Gestion {

    private ArrayList<Empleado> empleados;

    public void registrarEmpleado(int cedula, String nombre, String correo, String direccion, int salario){
        empleados.add(new Empleado(cedula, nombre, correo, direccion, salario));
    }

    public void eliminarEmpleado(int cedula){
        for (Empleado i : empleados){         // empleados.removeIf(i -> i.getCedula() == cedula); interesante saber esto
            if (i.getCedula() == cedula){
                empleados.remove(i);
            }
        }
    }

    public void buscarEmpleado(int cedula){

    }

    public void actualizarSalario(int cedula, int nuevoSueldo){
        for (Empleado i : empleados){         // empleados.removeIf(i -> i.getCedula() == cedula); interesante saber esto
            if (i.getCedula() == cedula){
                i.setSalario(nuevoSueldo);
            }
        }
    }
}
