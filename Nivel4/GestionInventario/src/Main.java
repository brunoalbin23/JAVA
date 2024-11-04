//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Inventario inventario = new Inventario("Bruno´Store");
        inventario.setDinero(100000);

        Producto producto1 = new Producto(1,"Tubo PVC","Tubo de plastico de pvc",10,20,15);
        Producto producto2 = new Producto(2,"Termo Stanley","Termo para mantener la temperatura del liquido",5,3000,1200);
        Producto producto3 = new Producto(3,"Fibra amarilla","Fibra de color amarillo",5,2,1);
        Producto producto4 = new Producto(4,"Cepillo de dientes","Cepillo de oro para lavar los dientes",10,20000,12000);
        Producto producto5 = new Producto(5,"Empanada de pollo","Empanada con carne de pollo y queso",100,40,15);

        System.out.println(inventario.getDinero());

        inventario.comprarProducto(producto1);
        inventario.comprarProducto(producto2);
        inventario.comprarProducto(producto3);
        inventario.comprarProducto(producto4);
        inventario.comprarProducto(producto5);

        System.out.println(inventario.getDinero());

        inventario.venderVariosProductoPorId(1,10);
        inventario.venderVariosProductoPorId(3,5);
        inventario.venderVariosProductoPorId(4,6);

        inventario.saberCantidadProducto(producto2);
        inventario.saberCantidadTotal();

        inventario.verStock();

        System.out.println(inventario.getDinero());
    }
}