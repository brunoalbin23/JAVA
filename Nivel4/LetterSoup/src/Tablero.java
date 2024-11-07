import java.util.ArrayList;
import java.util.Random;

public class Tablero {

    private int ancho;
    private int largo;
    Character[][] array;
    Boolean[][] arrayPalabrasOcupadas;

    public Tablero(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
        this.array = new Character[largo][ancho];
        this.arrayPalabrasOcupadas = new Boolean[largo][ancho];
    }

    public void crearTablero(){
        Random random = new Random();
        for(int i = 0; i<largo; i++) {
            for (int j = 0; j < ancho; j++) {
                int ascciLetra = random.nextInt(26) + 65;
                char valor = (char) ascciLetra;
                array[i][j] = valor;
            }
        }
    }

    public void pintarTablero(){
        for(int i = 0; i<largo; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("["+array[i][j]+"]");
            }
            System.out.println();
        }
    }

    public boolean estaLibre(int num1, int num2){
        for(int i = 0; i<largo; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("["+array[i][j]+"]");
            }
            System.out.println();
        }
    }

    public void agregarPalabrasAlTablero(String[] palabras){
        Random random = new Random();
        for (String i : palabras){

            char[] letras = i.toCharArray();
            int direccion = random.nextInt(8)+1;
            int largoPalabra = i.length();
            int coordenadaY;
            int coordenadaX;
            int count = 0;

            switch (direccion){
                case 1:
                    coordenadaY = random.nextInt(largo-largoPalabra)+largoPalabra-1;
                    coordenadaX = random.nextInt(ancho);
                    for (int j = 0; j<i.length(); j++){
                        array[coordenadaY][coordenadaX] = letras[count];
                        count++;
                        coordenadaY--;
                    }
                    break;
                case 2:
                    coordenadaY = random.nextInt(largo-largoPalabra);
                    coordenadaX = random.nextInt(ancho);
                    for (int j = 0; j<i.length(); j++){
                        array[coordenadaY][coordenadaX] = letras[count];
                        count++;
                        coordenadaY++;
                    }
                    break;
                case 3:
                    coordenadaY = random.nextInt(largo);
                    coordenadaX = random.nextInt(ancho-largoPalabra);
                    for (int j = 0; j<i.length(); j++){
                        array[coordenadaY][coordenadaX] = letras[count];
                        count++;
                        coordenadaX++;
                    }
                    break;
                case 4:
                    coordenadaY = random.nextInt(largo);
                    coordenadaX = random.nextInt(ancho-largoPalabra)+largoPalabra-1;
                    for (int j = 0; j<i.length(); j++){
                        array[coordenadaY][coordenadaX] = letras[count];
                        count++;
                        coordenadaX--;
                    }
                    break;
                case 5:
                    coordenadaY = random.nextInt(largo-largoPalabra);
                    coordenadaX = random.nextInt(ancho-largoPalabra);
                    for (int j = 0; j<i.length(); j++){
                        array[coordenadaY][coordenadaX] = letras[count];
                        count++;
                        coordenadaX++;
                        coordenadaY++;
                    }
                    break;
                case 6:
                    coordenadaX = random.nextInt(ancho-largoPalabra);
                    coordenadaY = random.nextInt(largo-largoPalabra)+largoPalabra-1;
                    for (int j = 0; j<i.length(); j++){
                        array[coordenadaY][coordenadaX] = letras[count];
                        count++;
                        coordenadaX++;
                        coordenadaY--;
                    }
                    break;
                case 7:
                    coordenadaY = random.nextInt(largo-largoPalabra)+largoPalabra-1;
                    coordenadaX = random.nextInt(ancho-largoPalabra)+largoPalabra-1;
                    for (int j = 0; j<i.length(); j++){
                        array[coordenadaY][coordenadaX] = letras[count];
                        count++;
                        coordenadaX--;
                        coordenadaY--;
                    }
                    break;
                case 8:
                    coordenadaY = random.nextInt(largo-largoPalabra);
                    coordenadaX = random.nextInt(ancho-largoPalabra)+largoPalabra-1;
                    for (int j = 0; j<i.length(); j++){
                        array[coordenadaY][coordenadaX] = letras[count];
                        count++;
                        coordenadaX--;
                        coordenadaY++;
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
// Probando push