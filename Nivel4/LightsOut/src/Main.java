import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño NxN del tablero, n = ");
        int tamanio = scanner.nextInt();
        scanner.nextLine();
        scanner.close();

        Tablero tablero = new Tablero(tamanio);
        tablero.crearTablero();
        tablero.pintarTablero();

        tablero.jugar();
    }
}