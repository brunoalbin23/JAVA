import java.util.Random;

public class Tablero {

    private int ancho;
    private int largo;
    Character[][] array;

    public Tablero(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
        this.array = new Character[largo][ancho];
    }

    public void pintarTablero(String[] palabras){
        Random random = new Random();
        for(int i = 0; i<largo; i++){
            for (int j = 0; j<ancho; j++){
                int ascciLetra = random.nextInt(26)+65;
                char valor = (char) ascciLetra;
                array[i][j] = valor;
                System.out.print("["+valor+"]");
            }
            System.out.println();
        }
        for (String i : palabras){

            char[] letras = i.toCharArray();
            int direccion = 1; // int direccion = random.nextInt(8)+1;
            int largoPalabra = i.length();
            int coordenadaX = random.nextInt(largo)+1;
            int coordenadaY = random.nextInt(ancho)+1;

            switch (direccion){
                case 1:
                    int count = 0;
                    for (int j = 0; j<i.length(); j++){
                        array[coordenadaX][coordenadaY] = letras[count];
                        count++;
                        coordenadaY++;
                    }
            }
        }
        for(int i = 0; i<largo; i++){
            for (int j = 0; j<ancho; j++){
                int ascciLetra = random.nextInt(26)+65;
                char valor = (char) ascciLetra;
                array[i][j] = valor;
                System.out.print("[ ]"); //System.out.print("["+valor+"]");
            }
            System.out.println();
        }
    }
}