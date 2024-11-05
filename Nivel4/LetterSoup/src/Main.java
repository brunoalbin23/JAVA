import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Tablero tablero = new Tablero(20,10);
        String[] palabras = {"LLLLL"};

        tablero.crearTablero();
        tablero.agregarPalabrasAlTablero(palabras);
        tablero.pintarTablero();
    }
}

