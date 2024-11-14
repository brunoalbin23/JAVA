import java.time.LocalDate;
import java.util.ArrayList;

public class Gestion {

    public ArrayList<Empleado> empleados;

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
        for (Empleado i : empleados){
            if (i.getCedula() == cedula){
                System.out.println("Nombre: "+i.getNombre()+"\nCedula: "+i.getCedula()+"\nCorreo: "+i.getCorreo()+"\nDirección: "+i.getDireccion()+"\nSalario: "+i.getSalario()+"\nPuesto: "+i.getPuesto());
            }
        }
    }

    public void actualizarSalario(int cedula, int nuevoSueldo){
        for (Empleado i : empleados){         // empleados.removeIf(i -> i.getCedula() == cedula); interesante saber esto
            if (i.getCedula() == cedula){
                i.setSalario(nuevoSueldo);
            }
        }
    }

    public Proyecto crearProyecto(String nombre, int id, String descripcion, int dinero, String fechaEntrega){
        return new Proyecto(nombre, id, descripcion, dinero, fechaEntrega);
    }


}
