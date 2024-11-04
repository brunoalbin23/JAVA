//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cajero cajero = new Cajero(1,"Cordon",10000);

        Cuenta cuenta = new Cuenta(1, "Bruno Albín",1000,56315544,1234);
        Cuenta cuenta2 = new Cuenta(2, "Guille",2000,55555555,1234);
        Cuenta cuenta3 = new Cuenta(3, "Albert",500,44444444,1234);
        Cuenta cuenta4 = new Cuenta(4, "Juana",200,33333333,1234);

        cajero.agregarCuenta(cuenta);
        cajero.agregarCuenta(cuenta2);
        cajero.agregarCuenta(cuenta3);
        cajero.agregarCuenta(cuenta4);

        cajero.consultarSaldo(3);
        System.out.println(cajero.getDinero());

        cajero.retirarDinero(3,5000);
        cajero.consultarSaldo(3);
        System.out.println(cajero.getDinero());

        cajero.depositarDinero(3,1000);
        cajero.consultarSaldo(3);
        System.out.println(cajero.getDinero());

        cajero.retirarDinero(3,10000);
        cajero.consultarSaldo(3);
        System.out.println(cajero.getDinero());

        cajero.depositarDinero(3,4600);
        cajero.consultarSaldo(3);
        System.out.println(cajero.getDinero());
    }
}