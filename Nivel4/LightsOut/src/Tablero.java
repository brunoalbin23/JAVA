import java.util.Random;
import java.util.Scanner;

public class Tablero{

    private int tamano;
    Integer[][] tablero;

    public Tablero(int tamano){
        this.tamano = tamano;
        tablero = new Integer[tamano][tamano];
    }

    public void crearTablero() {
        Random random = new Random();
        for (int i = 0; i < tamano; i++) {
            for (int k = 0; k < tamano; k++) {
                tablero[i][k] = random.nextInt(2);
            }
        }
    }

    public void pintarTablero() {
        Random random = new Random();
        int contador = 1;
        for (int i = 0; i < tamano; i++) {
            for (int k = 0; k < tamano; k++) {
                System.out.print("["+tablero[i][k]+"]");
            }
            System.out.println();
        }
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        while (!hayGanador()){
            System.out.print("Ingrese la posición x: ");
            int x = scanner.nextInt(); // Esto aca no anda, cambiar el metodo para hacer la llamada con un while desde el main y asi usar el scanner solo desde la main, no se si es eso el problema pero queda mejor estrucuturado
            System.out.print("Ingrese la posición y: ");
            int y = scanner.nextInt();

            contador++;

            if (tablero[x][y]==1){
                tablero[x][y]=0;
            } else {
                tablero[x][y]=1;
            }

            if (existeArriba(x,y)){
                tablero[x-1][y]=0;
            } else {
                tablero[x-1][y]=1;
            }

            if (existeAbajo(x,y)){
                tablero[x+1][y]=0;
            } else {
                tablero[x+1][y]=1;
            }

            if (existeDerecha(x,y)){
                tablero[x][y+1]=0;
            } else {
                tablero[x][y+1]=1;
            }

            if (existeIzq(x,y)){
                tablero[x][y-1]=0;
            } else {
                tablero[x][y-1]=1;
            }

            pintarTablero();
        }
        System.out.println("---------------GANASTE---------------\n LO HICISTE EN "+contador+" intentos");
        pintarTablero();
        System.out.println("-------------------------------------");
    }

    public boolean hayGanador() {
        for (int i = 0; i < tamano; i++) {
            for (int k = 0; k < tamano; k++) {
                if (tablero[i][k] == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean existeArriba(int x, int y){
        return x > 0;
    }

    public boolean existeAbajo(int x, int y){
        return x < tamano;
    }

    public boolean existeDerecha(int x, int y){
        return y < tamano;
    }

    public boolean existeIzq(int x, int y){
        return y > 0;
    }
}