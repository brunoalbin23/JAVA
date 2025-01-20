import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // System.out.println(esPrimo(2));
        // System.out.println(invertirCadena("La raiz cuadrada de 25 es 5"));
        // System.out.println(esPalindromo("naran"));
        // System.out.println(sumaDigitos(123));
        // calcularArea();
        // convertirSegundos(3153000);
        // asignarNotas();
        // contarVocalesConsonantes("hola   22");
        // numPorUnidades(123);
        // System.out.println(convertirARomano(3999));
    }

    // Saber si un número es primo
    public static boolean esPrimo(int num){
        boolean primo = true;
        for (int i = 1; i<=num; i++){
            if(i!=1 && i!=num){
                if (num % i == 0){
                    primo = false;
                }
            }
        }
        return primo;
    }

    // Invertir las palabras de una cadena
    public static String invertirCadena(String cadena){
        String cadenaInvertida = "";
        String[] cadenaArray = cadena.split("\\s");
        for (int i = cadenaArray.length-1; i>=0; i--){
            cadenaInvertida+=cadenaArray[i]+" ";
        }
        return cadenaInvertida.trim();
    }

    public static boolean esPalindromo(String palabra){
        boolean siEs = true;
        int cuentaAtras = palabra.length();
        for (int i = 0; i<palabra.length(); i++){
            if (palabra.charAt(i)!=palabra.charAt(cuentaAtras-1)){
                siEs = false;
            }
            cuentaAtras--;
        }
        return siEs;
    }

    public static int sumaDigitos(int num){
        int suma  = 0;
        String valor = String.valueOf(num);
        for (int i = 0; i<valor.length(); i++){
            suma += valor.charAt(i) - '0';
        }
        return suma;
    }

    public static void calcularArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1) Circulo\n2) Cuadrado\n3) Triangulo\n4) Rectangulo \nIngrese el número de la figura que desea calcular el área: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el radio: ");
                float radio = scanner.nextFloat();
                System.out.println("Area Circulo: " + (Math.PI * radio * radio));
                break;
            case 2:
                System.out.print("Ingrese un lado: ");
                float lado = scanner.nextFloat();
                System.out.println("Area Cuadrado: " + lado * lado);
                break;
            case 3:
                System.out.print("Ingrese la base: ");
                float base = scanner.nextFloat();
                System.out.print("Ingrese la altura: ");
                float altura = scanner.nextFloat();
                System.out.println("Area Triangulo: " + (base * altura) / 2);
                break;
            case 4:
                System.out.print("Ingrese el largo: ");
                float largo = scanner.nextFloat();
                System.out.print("Ingrese el ancho: ");
                float ancho = scanner.nextFloat();
                System.out.println("Area Rectángulo: " + largo * ancho);
                break;
        }
        scanner.close();
    }
        
    public static void convertirSegundos(long segundos) {
        if (segundos <= 60) {
            System.out.println(segundos + " segundos");
        } else if (segundos <= 3600) {
            long minutos = segundos / 60;
            long segs = segundos % 60;
            System.out.println(segundos + " segundos son: " + minutos + " minutos y " + segs + " segundos");
        } else if (segundos <= 86400) {
            long horas = segundos / 3600;
            long segsSobrantes = segundos % 3600;
            long minutos = segsSobrantes / 60;
            long segs = segsSobrantes % 60;
            System.out.println(segundos + " segundos son: " + horas + " horas " + minutos + " minutos y " + segs + " segundos");
        } else if (segundos <= 31536000) {
            long dias = segundos / 86400;
            long segsSobrantes2 = segundos % 86400;
            long horas = segsSobrantes2 / 3600;
            long segsSobrantes = segundos % 3600;
            long minutos = segsSobrantes / 60;
            long segs = segsSobrantes % 60;
            System.out.println(segundos + " segundos son: " + dias + " dias " + horas + " horas " + minutos + " minutos y " + segs + " segundos");
        } else {
            System.out.println("Na es mucho no jodas");
        }
    }

    public static void asignarNotas(){
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> notas = new HashMap<String, Integer>();

        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();
        System.out.println("A continuación ingrese las materias con las notas, escriba 'listo' para terminar");
        while (true) {
            System.out.println("Materia: ");
            String materia = scanner.nextLine();
            if (materia.equals("listo")){
                break;
            }
            System.out.println("Nota: ");
            int nota = scanner.nextInt();
            scanner.nextLine();
            notas.put(materia,nota);
        }
        System.out.println("-----------Alumno: "+nombre+"-----------");
        System.out.println("Materias:");
        String mayor = "";
        String menor = "";
        int numMayor = Integer.MIN_VALUE;
        int numMin = Integer.MAX_VALUE;
        double materias = 0;
        double sumaNotas = 0;

        for (String i : notas.keySet()) {
            materias++;
            sumaNotas+=notas.get(i);
            System.out.println(i + " - Nota: " + notas.get(i));
            if (notas.get(i)>numMayor){
                numMayor = notas.get(i);
                mayor = i;
            }
            if (notas.get(i)<numMin){
                numMin = notas.get(i);
                menor = i;
            }
        }
        System.out.println("");
        System.out.println("Promedio: "+(sumaNotas/materias));
        System.out.println("Mejor nota: "+mayor+" - "+numMayor);
        System.out.println("Peor nota: "+menor+" - "+numMin);
        System.out.println("--------------------------------------");
        scanner.close();
    }

    public static void contarVocalesConsonantes(String cadena){
        int vocales = 0;
        int consonantes = 0;
        int numeros = 0;
        int espacios = 0;

        cadena = cadena.toLowerCase();

        for (int i = 0; i<cadena.length(); i++){
            Character a = cadena.charAt(i);
            if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
                vocales++;
            } else if (Character.isLetter(a)) {
                consonantes++;
            } else if (Character.isDigit(a)) {
                numeros++;
            } else if (Character.isSpaceChar(a)) {
                espacios++;
            }
        }
        System.out.println("Vocales: "+vocales);
        System.out.println("Consonantes: "+consonantes);
        System.out.println("Numeros: "+numeros);
        System.out.println("Espacios: "+espacios);
    }

    public static ArrayList<Integer> numPorUnidades(int num){
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        String numStr = String.valueOf(num);
        int unidad = 1;
        for (int i = numStr.length()-1; i>=0; i--){
            int valor = (numStr.charAt(i) -'0') * unidad;
            numeros.add(valor);
            unidad*=10;
        }
        return numeros;
    }

    //valores entre 1 y 3999, este lo hice con ayuda xq no entendia la logica de los nums romanos
    public static String convertirARomano(int num) {
        StringBuilder romano = new StringBuilder();

        // Definimos los valores y símbolos romanos
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < valores.length; i++) {
            while (num >= valores[i]) {
                romano.append(simbolos[i]); // Agregar el símbolo romano correspondiente
                num -= valores[i]; // Restar el valor
            }
        }
        return romano.toString();
    }
}