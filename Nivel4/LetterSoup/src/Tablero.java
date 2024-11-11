import java.util.*;

public class Tablero {

    private int ancho;
    private int largo;
    Character[][] array;
    Boolean[][] arrayPalabrasOcupadas;
    String[] palabras;
    HashMap <String, ArrayList<Integer[]>> coordenadasPalabras;
    ArrayList<String> encontradas = new ArrayList<>();

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

    public void pintarTablero(String pista) {
        if (encontradas.isEmpty()) {
            // Si no hay palabras encontradas, imprimir el tablero completo con paréntesis rectos
            for (int i = 0; i < largo; i++) {
                for (int j = 0; j < ancho; j++) {
                    System.out.print("[" + array[i][j] + "]");
                }
                System.out.println();
            }
            System.out.println("\nPista: " + pista);
            return;  // Terminar la ejecución
        }

        // Crear una lista para almacenar todas las coordenadas de letras de palabras encontradas
        ArrayList<Integer[]> coordenadasEncontradas = new ArrayList<>();

        // Recopilar todas las coordenadas de las letras de cada palabra encontrada
        for (String palabra : encontradas) {
            coordenadasEncontradas.addAll(coordenadasPalabras.get(palabra));
        }

        // Imprimir el tablero completo una sola vez
        for (int x = 0; x < largo; x++) {
            for (int w = 0; w < ancho; w++) {
                boolean esLetraEncontrada = false;

                // Verificar si la posición actual (x, w) está en las coordenadas de letras encontradas
                for (Integer[] coordenada : coordenadasEncontradas) {
                    if (coordenada[0] == x && coordenada[1] == w) {
                        System.out.print("(" + array[x][w] + ")");
                        esLetraEncontrada = true;
                        break;
                    }
                }

                // Si no es una letra encontrada, imprimir con paréntesis rectos
                if (!esLetraEncontrada) {
                    System.out.print("[" + array[x][w] + "]");
                }
            }
            System.out.println();
        }
        System.out.println("\nPista: " + pista);
    }


    public void jugar(String pista){

        int aciertos = 0;
        int palabrasRestantes = palabras.length;
        Scanner scanner = new Scanner(System.in);
        String intento;

        while(aciertos!=palabras.length){
            pintarTablero(pista);
            System.out.println("------ Palabras restantes : "+palabrasRestantes+" -------\nIngrese su palabra: ");
            intento = scanner.nextLine().toUpperCase();
            for (String i : palabras){
                if (i.equals(intento) && !encontradas.contains(intento)) {
                    encontradas.add(intento);
                    aciertos++;
                    palabrasRestantes--;
                }
            }
        }
        pintarTablero(" ");
        System.out.println("--------------ENCONTRASTE TODAS LAS PALABRAS--------------");
    }

    public void agregarPalabrasAlTablero(String[] palabras){

        this.coordenadasPalabras = new HashMap<>();
        this.palabras = palabras;
        Random random = new Random();

        for (String i : palabras){
            char[] letras = i.toCharArray();
            int direccion = random.nextInt(8)+1;
            int largoPalabra = i.length();
            int coordenadaY;
            int coordenadaX;
            int copiaY;
            int copiaX;
            int count = 0;
            boolean denuevo = true;

            ArrayList<Integer[]> coordenadasPalabra = new ArrayList<Integer[]>();

            switch (direccion){
                case 1:
                    coordenadaY = random.nextInt(largo-largoPalabra)+largoPalabra-1;
                    coordenadaX = random.nextInt(ancho);
                    copiaY = coordenadaY;
                    copiaX = coordenadaX;

                    while (denuevo){
                        for (int j = 0; j<i.length(); j++){
                            if (arrayPalabrasOcupadas[coordenadaY][coordenadaX]){
                                coordenadaY = random.nextInt(largo-largoPalabra)+largoPalabra-1;
                                coordenadaX = random.nextInt(ancho);
                                copiaY = coordenadaY;
                                copiaX = coordenadaX;
                                denuevo = true;
                                break;
                            }else {
                                denuevo = false;
                                coordenadaY--;
                            }
                        }
                        if (!denuevo){
                            break;
                        }
                    }

                    for (int j = 0; j<i.length(); j++){
                        array[copiaY][copiaX] = letras[count];
                        arrayPalabrasOcupadas[copiaY][copiaX] = true;
                        Integer[] coordenadasCaracter = new Integer[2];
                        coordenadasCaracter[0] = copiaY;
                        coordenadasCaracter[1] = copiaX;
                        coordenadasPalabra.add(coordenadasCaracter);
                        count++;
                        copiaY--;
                    }
                    break;
                case 2:
                    coordenadaY = random.nextInt(largo-largoPalabra);
                    coordenadaX = random.nextInt(ancho);
                    copiaY = coordenadaY;
                    copiaX = coordenadaX;

                    while (denuevo){
                        for (int j = 0; j<i.length(); j++){
                            if (arrayPalabrasOcupadas[coordenadaY][coordenadaX]){
                                coordenadaY = random.nextInt(largo-largoPalabra);
                                coordenadaX = random.nextInt(ancho);
                                copiaY = coordenadaY;
                                copiaX = coordenadaX;
                                denuevo = true;
                                break;
                            }else {
                                denuevo = false;
                                coordenadaY++;
                            }
                        }
                        if (!denuevo){
                            break;
                        }
                    }

                    for (int j = 0; j<i.length(); j++){
                        array[copiaY][copiaX] = letras[count];
                        arrayPalabrasOcupadas[copiaY][copiaX] = true;
                        Integer[] coordenadasCaracter = new Integer[2];
                        coordenadasCaracter[0] = copiaY;
                        coordenadasCaracter[1] = copiaX;
                        coordenadasPalabra.add(coordenadasCaracter);
                        count++;
                        copiaY++;
                    }
                    break;
                case 3:
                    coordenadaY = random.nextInt(largo);
                    coordenadaX = random.nextInt(ancho-largoPalabra);
                    copiaY = coordenadaY;
                    copiaX = coordenadaX;

                    while (denuevo){
                        for (int j = 0; j<i.length(); j++){
                            if (arrayPalabrasOcupadas[coordenadaY][coordenadaX]){
                                coordenadaY = random.nextInt(largo);
                                coordenadaX = random.nextInt(ancho-largoPalabra);
                                copiaY = coordenadaY;
                                copiaX = coordenadaX;
                                denuevo = true;
                                break;
                            }else {
                                denuevo = false;
                                coordenadaX++;
                            }
                        }
                        if (!denuevo){
                            break;
                        }
                    }

                    for (int j = 0; j<i.length(); j++){
                        array[copiaY][copiaX] = letras[count];
                        arrayPalabrasOcupadas[copiaY][copiaX] = true;
                        Integer[] coordenadasCaracter = new Integer[2];
                        coordenadasCaracter[0] = copiaY;
                        coordenadasCaracter[1] = copiaX;
                        coordenadasPalabra.add(coordenadasCaracter);
                        count++;
                        copiaX++;
                    }
                    break;
                case 4:
                    coordenadaY = random.nextInt(largo);
                    coordenadaX = random.nextInt(ancho-largoPalabra)+largoPalabra-1;
                    copiaY = coordenadaY;
                    copiaX = coordenadaX;

                    while (denuevo){
                        for (int j = 0; j<i.length(); j++){
                            if (arrayPalabrasOcupadas[coordenadaY][coordenadaX]){
                                coordenadaY = random.nextInt(largo);
                                coordenadaX = random.nextInt(ancho-largoPalabra)+largoPalabra-1;
                                copiaY = coordenadaY;
                                copiaX = coordenadaX;
                                denuevo = true;
                                break;
                            }else {
                                denuevo = false;
                                coordenadaX--;
                            }
                        }
                        if (!denuevo){
                            break;
                        }
                    }

                    for (int j = 0; j<i.length(); j++){
                        array[copiaY][copiaX] = letras[count];
                        arrayPalabrasOcupadas[copiaY][copiaX] = true;
                        Integer[] coordenadasCaracter = new Integer[2];
                        coordenadasCaracter[0] = copiaY;
                        coordenadasCaracter[1] = copiaX;
                        coordenadasPalabra.add(coordenadasCaracter);
                        count++;
                        copiaX--;
                    }
                    break;
                case 5:
                    coordenadaY = random.nextInt(largo-largoPalabra);
                    coordenadaX = random.nextInt(ancho-largoPalabra);
                    copiaY = coordenadaY;
                    copiaX = coordenadaX;

                    while (denuevo){
                        for (int j = 0; j<i.length(); j++){
                            if (arrayPalabrasOcupadas[coordenadaY][coordenadaX]){
                                coordenadaY = random.nextInt(largo-largoPalabra);
                                coordenadaX = random.nextInt(ancho-largoPalabra);
                                copiaY = coordenadaY;
                                copiaX = coordenadaX;
                                denuevo = true;
                                break;
                            }else {
                                denuevo = false;
                                coordenadaX++;
                                coordenadaY++;
                            }
                        }
                        if (!denuevo){
                            break;
                        }
                    }

                    for (int j = 0; j<i.length(); j++){
                        array[copiaY][copiaX] = letras[count];
                        arrayPalabrasOcupadas[copiaY][copiaX] = true;
                        Integer[] coordenadasCaracter = new Integer[2];
                        coordenadasCaracter[0] = copiaY;
                        coordenadasCaracter[1] = copiaX;
                        coordenadasPalabra.add(coordenadasCaracter);
                        count++;
                        copiaX++;
                        copiaY++;
                    }
                    break;
                case 6:
                    coordenadaX = random.nextInt(ancho-largoPalabra);
                    coordenadaY = random.nextInt(largo-largoPalabra)+largoPalabra-1;
                    copiaY = coordenadaY;
                    copiaX = coordenadaX;

                    while (denuevo){
                        for (int j = 0; j<i.length(); j++){
                            if (arrayPalabrasOcupadas[coordenadaY][coordenadaX]){
                                coordenadaX = random.nextInt(ancho-largoPalabra);
                                coordenadaY = random.nextInt(largo-largoPalabra)+largoPalabra-1;
                                copiaY = coordenadaY;
                                copiaX = coordenadaX;
                                denuevo = true;
                                break;
                            }else {
                                denuevo = false;
                                coordenadaX++;
                                coordenadaY--;
                            }
                        }
                        if (!denuevo){
                            break;
                        }
                    }

                    for (int j = 0; j<i.length(); j++){
                        array[copiaY][copiaX] = letras[count];
                        arrayPalabrasOcupadas[copiaY][copiaX] = true;
                        Integer[] coordenadasCaracter = new Integer[2];
                        coordenadasCaracter[0] = copiaY;
                        coordenadasCaracter[1] = copiaX;
                        coordenadasPalabra.add(coordenadasCaracter);
                        count++;
                        copiaX++;
                        copiaY--;
                    }
                    break;
                case 7:
                    coordenadaY = random.nextInt(largo-largoPalabra)+largoPalabra;
                    coordenadaX = random.nextInt(ancho-largoPalabra)+largoPalabra;
                    copiaY = coordenadaY;
                    copiaX = coordenadaX;

                    while (denuevo){
                        for (int j = 0; j<i.length(); j++){
                            if (arrayPalabrasOcupadas[coordenadaY][coordenadaX]){
                                coordenadaY = random.nextInt(largo-largoPalabra)+largoPalabra;
                                coordenadaX = random.nextInt(ancho-largoPalabra)+largoPalabra;
                                copiaY = coordenadaY;
                                copiaX = coordenadaX;
                                denuevo = true;
                                break;
                            }else {
                                denuevo = false;
                                coordenadaX--;
                                coordenadaY--;
                            }
                        }
                        if (!denuevo){
                            break;
                        }
                    }

                    for (int j = 0; j<i.length(); j++){
                        array[copiaY][copiaX] = letras[count];
                        arrayPalabrasOcupadas[copiaY][copiaX] = true;
                        Integer[] coordenadasCaracter = new Integer[2];
                        coordenadasCaracter[0] = copiaY;
                        coordenadasCaracter[1] = copiaX;
                        coordenadasPalabra.add(coordenadasCaracter);
                        count++;
                        copiaX--;
                        copiaY--;
                    }
                    break;
                case 8:
                    coordenadaY = random.nextInt(largo-largoPalabra);
                    coordenadaX = random.nextInt(ancho-largoPalabra)+largoPalabra-1;
                    copiaY = coordenadaY;
                    copiaX = coordenadaX;

                    while (denuevo){
                        for (int j = 0; j<i.length(); j++){
                            if (arrayPalabrasOcupadas[coordenadaY][coordenadaX]){
                                coordenadaY = random.nextInt(largo-largoPalabra);
                                coordenadaX = random.nextInt(ancho-largoPalabra)+largoPalabra-1;
                                copiaY = coordenadaY;
                                copiaX = coordenadaX;
                                denuevo = true;
                                break;
                            }else {
                                denuevo = false;
                                coordenadaX--;
                                coordenadaY++;
                            }
                        }
                        if (!denuevo){
                            break;
                        }
                    }

                    for (int j = 0; j<i.length(); j++){
                        array[copiaY][copiaX] = letras[count];
                        arrayPalabrasOcupadas[copiaY][copiaX] = true;
                        Integer[] coordenadasCaracter = new Integer[2];
                        coordenadasCaracter[0] = copiaY;
                        coordenadasCaracter[1] = copiaX;
                        coordenadasPalabra.add(coordenadasCaracter);
                        count++;
                        copiaX--;
                        copiaY++;
                    }
                    break;
                default:
                    break;
            }
            coordenadasPalabras.put(i,coordenadasPalabra);
        }
    }
}