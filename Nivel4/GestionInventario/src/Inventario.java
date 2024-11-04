import java.time.LocalDate;
import java.util.ArrayList;

public class Inventario {
    private String nombre;
    private ArrayList<Producto> productos;
    private int dinero = 0;

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public Inventario(String nombre) {
        this.nombre = nombre;
    }

    public void comprarProducto(Producto producto){
        if (this.productos == null){
            productos = new ArrayList<Producto>();
            productos.add(producto);
            dinero-=producto.getPrecioCompra();
        } else {
            for (Producto i : productos ){
                if (producto.getId()==i.getId()){
                    System.out.println("No se puede añadir el mismo producto");
                    break;
                }
            }
            if (getDinero()>producto.getPrecioCompra()){
                productos.add(producto);
                dinero-=producto.getPrecioCompra();
            }else {
                System.out.println("Compra no realizada, dinero insuficiente");
            }
        }
    }

    public void venderUnProductoPorId(int id){
        for (Producto i : productos){
            if (i.getId()==id){
                if (i.getFechaVencimiento().isBefore(LocalDate.now())){
                    System.out.println("PRODUCTO VENCIDO, no se pudo realizar la venta");
                }
                if (i.getCantidad()>0){
                    i.vendido();
                    dinero += i.getPrecioVenta();
                }
                if (i.getCantidad()==0){
                    productos.remove(i);
                }
            }
        }
    }

    public void venderVariosProductoPorId(int id, int cantidad){
        for (Producto i : productos){
            if (i.getId()==id){
                if (i.getFechaVencimiento().isBefore(LocalDate.now())){
                    System.out.println("PRODUCTO VENCIDO, no se pudo realizar la venta");
                }
                if (i.getCantidad()>=cantidad){
                    i.vendidoVarios(cantidad);
                    dinero += i.getPrecioVenta()*cantidad;
                }else{
                    System.out.println("No se puedo realizar la compra, solo hay "+i.getCantidad()+" productos disponibles");
                }
            }
        }
    }

    public void cambiarPrecio(Producto producto, int precio){
        producto.setPrecioVenta(precio);
    }

    public void saberCantidadProducto(Producto producto){
        System.out.println("ID: "+producto.getId()+" - Nombre: "+producto.getNombre()+" - Cantidad: "+producto.getCantidad());
    }

    public void saberCantidadTotal(){
        for (Producto i : productos){
            System.out.println("ID: "+i.getId()+" - Nombre: "+i.getNombre()+" - Cantidad: "+i.getCantidad());
        }
    }

    public void informacionProductoPorId(int id){
        for (Producto i : productos){
            if (id==i.getId()){
                System.out.println("--------------------------------");
                System.out.println("ID: "+i.getId()+"\nNombre: "+i.getNombre()+"\nDescripción: "+i.getDescripcion()+"\nCantidad: "+i.getCantidad()+"\nFecha vencimiento: "+i.getFechaVencimiento()+"\nPrecio venta: "+i.getPrecioVenta()+"\nPrecio compra: "+i.getPrecioCompra());
                System.out.println("--------------------------------");
            }
        }
    }

    public void verStock(){
        for (Producto i : productos){
            System.out.println("--------------------------------");
            System.out.println("ID: "+i.getId()+"\nNombre: "+i.getNombre()+"\nDescripción: "+i.getDescripcion()+"\nCantidad: "+i.getCantidad()+"\nFecha vencimiento: "+i.getFechaVencimiento()+"\nPrecio venta: "+i.getPrecioVenta()+"\nPrecio compra: "+i.getPrecioCompra());
        }
        System.out.println("--------------------------------");
    }
}
