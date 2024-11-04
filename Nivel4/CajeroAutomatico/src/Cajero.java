import java.util.ArrayList;

public class Cajero {

    ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
    private int idCajero;
    private String zona;
    private int dinero;

    public int getIdCajero() {
        return idCajero;
    }

    public void setIdCajero(int idCajero) {
        this.idCajero = idCajero;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public Cajero(int idCajero, String zona, int dinero) {
        this.idCajero = idCajero;
        this.zona = zona;
        this.dinero = dinero;
    }

    public void retirarDinero(int idCuenta, int dineroRetirar){
        if (dineroRetirar<0){
            System.out.println("No se puede retirar dinero negativo");
        } else {
            if (dineroRetirar>dinero){
                System.out.println("No hay ese monto en el cajero, operación cancelada");
            } else {
                for (Cuenta i : cuentas){
                    if (idCuenta==i.getId()){
                        dinero-=dineroRetirar;
                        i.ingresarDinero(dineroRetirar);
                    }
                }
            }
        }
    }

    public void depositarDinero(int idCuenta, int dineroIngresar){
        if (dineroIngresar<0){
            System.out.println("No se puede ingresar dinero negativo");
        } else {
            for (Cuenta i : cuentas){
                if (idCuenta==i.getId()){
                    if (dineroIngresar>i.getDinero()){
                        System.out.println("No tiene dinero suficiente en su cuetna, operación cancelada");
                    } else {
                        dinero+=dineroIngresar;
                        i.sacarDinero(dineroIngresar);
                    }
                }
            }
        }
    }

    public void consultarSaldo(int idCuenta){
        for (Cuenta i : cuentas){
            if (idCuenta==i.getId()){
                System.out.println("Saldo: "+i.getDinero());
            }
        }
    }

    public void agregarCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
    }
}
