import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Tablero tablero = new Tablero(20,10);

        //No se pueden agreagar palabras mas grandes que el ancho o largo del tablero
        String[] palabras = {"XXXXXXZZ","XXXXXXOO","XXXXXPP","XXXXRR"};

        tablero.crearTablero();
        tablero.agregarPalabrasAlTablero(palabras);
        tablero.pintarTablero();
    }
}

