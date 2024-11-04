import java.util.Scanner;

public class Jugador {

    Scanner scanner = new Scanner(System.in);
    private int numeroJugador;
    private String nombreJugador;

    public int getNumeroJugador() {
        return numeroJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public Jugador(int num){
        this.numeroJugador = num;
        System.out.println("Jugador número "+num+", ingrese su nombre: ");
        this.nombreJugador = scanner.nextLine();
    }

    public int hacerJugada() {

        System.out.print(nombreJugador+", ingresá la posición donde quieres colocar tu ficha: ");
        int num = scanner.nextInt();
        return num;
    }
}
