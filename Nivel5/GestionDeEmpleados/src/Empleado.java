public class Empleado {

    private int cedula;
    private String nombre;
    private String correo;
    private String direccion;
    private int salario;
    private String puesto;

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }


    public Empleado(int cedula, String nombre, String correo, String direccion, int salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.salario = salario;
    }

}
