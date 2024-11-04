import java.util.ArrayList;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Tablero tablero = new Tablero();

        Jugador jugador1 = new Jugador(1);
        Jugador jugador2 = new Jugador(2);

        int comienza = random.nextInt(2)+1;

        int jugadas = 0;
        while (!tablero.hayGanador() && jugadas<9){

            tablero.pintarTablero();
            tablero.jugada(jugador1, jugador1.hacerJugada());
            jugadas++;

            if (tablero.hayGanador()){
                System.out.println("--------------------TA TE TI, GANÓ - "+jugador1.getNombreJugador()+" --------------------");
                tablero.pintarTablero();
                break;
            }

            if (jugadas==9){
                System.out.println("--------------------EMPATE--------------------");
                tablero.pintarTablero();
                break;
            }

            tablero.pintarTablero();
            tablero.jugada(jugador2, jugador2.hacerJugada());
            jugadas++;

            if (tablero.hayGanador()){
                System.out.println("--------------------TA TE TI, GANÓ - "+jugador2.getNombreJugador()+" --------------------");
                tablero.pintarTablero();
                break;
            }
        }
    }
}
