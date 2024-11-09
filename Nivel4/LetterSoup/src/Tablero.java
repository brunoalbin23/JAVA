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
                arrayPalabrasOcupadas[i][j] = false;
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
                if (arrayPalabrasOcupadas[i][j]){
                    return false;
                }
            }
        }
        return true;
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
            boolean ubicacionLibre = false;

            switch (direccion){
                case 1:
                    coordenadaY = random.nextInt(largo-largoPalabra)+largoPalabra-1;
                    coordenadaX = random.nextInt(ancho);

                    // hacer q este while cheque que no estan ocupadas las casillas, si estan, que cree nuevas cordenadas, repeetir para cada caso
                    while (true){
                        for (int j = 0; j<i.length(); j++){
                            if (arrayPalabrasOcupadas[coordenadaY][coordenadaX] = true){
                                coordenadaY = random.nextInt(largo-largoPalabra)+largoPalabra-1;
                                coordenadaX = random.nextInt(ancho);
                                break;
                            }
                            coordenadaY--;
                        }
                    }

                    for (int j = 0; j<i.length(); j++){
                        array[coordenadaY][coordenadaX] = letras[count];
                        arrayPalabrasOcupadas[coordenadaY][coordenadaX] = true;
                        count++;
                        coordenadaY--;
                    }
                    break;
                case 2:
                    coordenadaY = random.nextInt(largo-largoPalabra);
                    coordenadaX = random.nextInt(ancho);

                    while (true){
                        for (int j = 0; j<i.length(); j++){
                            if (arrayPalabrasOcupadas[coordenadaY][coordenadaX] = true){
                                coordenadaY = random.nextInt(largo-largoPalabra)+largoPalabra-1;
                                coordenadaX = random.nextInt(ancho);
                                nuevasCordenadas = true;
                                break;
                            }
                            coordenadaY++;
                        }
                        if (!nuevasCordenadas){
                            break;
                        }
                    }

                    for (int j = 0; j<i.length(); j++){
                        array[coordenadaY][coordenadaX] = letras[count];
                        arrayPalabrasOcupadas[coordenadaY][coordenadaX] = true;
                        count++;
                        coordenadaY++;
                    }
                    break;
                case 3:
                    coordenadaY = random.nextInt(largo);
                    coordenadaX = random.nextInt(ancho-largoPalabra);

                    while (true){
                        for (int j = 0; j<i.length(); j++){
                            if (arrayPalabrasOcupadas[coordenadaY][coordenadaX] = true){
                                coordenadaY = random.nextInt(largo-largoPalabra)+largoPalabra-1;
                                coordenadaX = random.nextInt(ancho);
                                nuevasCordenadas = true;
                                break;
                            }
                            coordenadaX++;
                        }
                        if (!nuevasCordenadas){
                            break;
                        }
                    }

                    for (int j = 0; j<i.length(); j++){
                        array[coordenadaY][coordenadaX] = letras[count];
                        arrayPalabrasOcupadas[coordenadaY][coordenadaX] = true;
                        count++;
                        coordenadaX++;
                    }
                    break;
                case 4:
                    coordenadaY = random.nextInt(largo);
                    coordenadaX = random.nextInt(ancho-largoPalabra)+largoPalabra-1;

                    while (true){
                        for (int j = 0; j<i.length(); j++){
                            if (arrayPalabrasOcupadas[coordenadaY][coordenadaX] = true){
                                coordenadaY = random.nextInt(largo-largoPalabra)+largoPalabra-1;
                                coordenadaX = random.nextInt(ancho);
                                nuevasCordenadas = true;
                                break;
                            }
                            coordenadaX--;
                        }
                        if (!nuevasCordenadas){
                            break;
                        }
                    }

                    for (int j = 0; j<i.length(); j++){
                        array[coordenadaY][coordenadaX] = letras[count];
                        arrayPalabrasOcupadas[coordenadaY][coordenadaX] = true;
                        count++;
                        coordenadaX--;
                    }
                    break;
                case 5:
                    coordenadaY = random.nextInt(largo-largoPalabra);
                    coordenadaX = random.nextInt(ancho-largoPalabra);

                    while (true){
                        for (int j = 0; j<i.length(); j++){
                            if (arrayPalabrasOcupadas[coordenadaY][coordenadaX] = true){
                                coordenadaY = random.nextInt(largo-largoPalabra)+largoPalabra-1;
                                coordenadaX = random.nextInt(ancho);
                                nuevasCordenadas = true;
                                break;
                            }
                            coordenadaX++;
                            coordenadaY++;
                        }
                        if (!nuevasCordenadas){
                            break;
                        }
                    }

                    for (int j = 0; j<i.length(); j++){
                        array[coordenadaY][coordenadaX] = letras[count];
                        arrayPalabrasOcupadas[coordenadaY][coordenadaX] = true;
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
                        arrayPalabrasOcupadas[coordenadaY][coordenadaX] = true;
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
                        arrayPalabrasOcupadas[coordenadaY][coordenadaX] = true;
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
                        arrayPalabrasOcupadas[coordenadaY][coordenadaX] = true;
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