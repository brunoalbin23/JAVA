import java.time.LocalDate;

public class Producto {

    private int id;
    private String nombre;
    private String descripcion;
    private int cantidad;
    private LocalDate fechaVencimiento;
    private int precioVenta;
    private int precioCompra;

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Producto (int id, String nombre, String descripcion, int cantidad, int precioVenta, int precioCompra){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.fechaVencimiento = LocalDate.now().plusYears(1);
    }

    public void vendido(){
        cantidad --;
    }

    public void vendidoVarios(int num){
        cantidad -= num;
    }

}
