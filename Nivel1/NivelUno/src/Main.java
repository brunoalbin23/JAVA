import java.util.Scanner;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // calculadoraMuySimple();
        // System.out.println(contadorPalabras("Nunca es tarde pa jugar un lolsito decia mi abuelo, no cuentan los . y ,"));
        // System.out.println(contadorPalabrasCaracteres("Nunca es tarde pa jugar un lolsito decia mi abuelo, no cuentan los . y ,"));
        // System.out.println(esPar(3));
        // System.out.println(factorial(5));
        // System.out.println(promedioNumeros());
        // tablaMultiplicar(8);
        //System.out.println(gradsCaF());
    }

    // Claculadora de operaciones basicas con scanner, (no tiene validaciones)
    public static void calculadoraMuySimple() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número A: ");
        float numeroA = scanner.nextInt();
        System.out.print("Ingrese el número B: ");
        float numeroB = scanner.nextInt();
        int operacion;
        while (true) {
            System.out.print("1) " + numeroA + " + " + numeroB + "\n2) " + numeroA + " - " + numeroB + "\n3) " + numeroB + " - " + numeroA + "\n4) " + numeroA + " * " + numeroB + "\n5) " + numeroA + " / " + numeroB + "\n6) " + numeroB + " / " + numeroA + "\nIngrese el Num. de operación que quiere hacer: ");
            operacion = scanner.nextInt();
            if (operacion >= 1 && operacion <= 6) {
                break;
            }
            System.out.println("ERROR, PORFAVOR INGRESAR UNA DE LAS OPCIONES DISPONIBLES");
        }

        switch (operacion) {
            case 1:
                System.out.println(numeroA + numeroB);
                break;
            case 2:
                System.out.println(numeroA - numeroB);
                break;
            case 3:
                System.out.println(numeroB - numeroA);
                break;
            case 4:
                System.out.println(numeroA * numeroB);
                break;
            case 5:
                if (numeroB == 0) {
                    System.out.println("ERROR, División con denominador 0");
                } else {
                    System.out.println(numeroA / numeroB);
                    break;
                }
            case 6:
                if (numeroA == 0) {
                    System.out.println("ERROR, División con denominador 0");
                } else {
                    System.out.println(numeroB / numeroA);
                    break;
                }
        }
    }

        // Funcion que cuenta solo palabras
    public static int contadorPalabras(String frase) {
        String[] palabras2 = frase.replaceAll("[.,]", "").split("\\s+");
        return palabras2.length;
    }

    // Funcion que cuenta lo q venga
    public static int contadorPalabrasCaracteres(String frase) {
        int cantidadPalabras = frase.split("\\s").length;
        return  cantidadPalabras;
    }

    // Funcion que retorne true si es par o false si es impar
    public static boolean esPar(int num){
        return (num%2 == 0);
    }

    // Calculo de factorial con recursividad
    public static int factorial(int num){
        if (num == 0){
            return 0;
        }else if (num == 1){
            return 1;
        }else{
            return num * factorial(num-1);
        }
    }

    //Promedio de números
    public static double promedioNumeros(){
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        double contador = 0;

        System.out.println("Ingrese valores para calcular el promedio, ingrese 'fin' para calcular");
        while (true){
            String valor = scanner.nextLine();
            if(valor.equals("fin")){
                if (contador==0){
                    return 0;
                }
                return suma/contador;
            }
            if(!valor.matches("\\d+")){
                System.out.println("¡ERROR! Caracter no identificado");
                return -1;
            }
            suma += (Double.parseDouble(valor));
            contador++;
        }
    }

    public static void tablaMultiplicar(int num){
        for (int i = 0; i<=10; i++){
            System.out.println(i+" * "+num+" = "+(i*num));
        }
    }

    // Convertir grados celsius a far y al revez
    public static double gradsCaF(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de la operación que desea hacer: \n1)Grados Celsius a Fahrenheit \n2)Grados Fahrenheit a Celsius");
        int operacion = scanner.nextInt();
        if (operacion==1){
            System.out.print("Ingrese los grados Celsius: ");
            double celsius = scanner.nextDouble();
            return (celsius*((double) 9 /5)+32);
        } else if (operacion==2) {
            System.out.print("Ingrese los grados Fahrenheit: ");
            double faren = scanner.nextDouble();
            return (faren-32)*((double) 5 /9);
        }else {
            System.out.println("ERROR, CARACTER NO VALIDO");
            return -1;
        }
    }
}