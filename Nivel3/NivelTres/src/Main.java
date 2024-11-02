import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        //adivinarNumero();
        //System.out.println(Fibonacci(9));

        //System.out.println(decimalABinario("851"));
        //System.out.println(decimalAHexadecimal("506"));
        //System.out.println(binarioADecimal("1101010011"));
        //System.out.println(binarioAHexadecimal("100101001010111"));
        //System.out.println(hexadecimalADecimal("1FA"));
        //System.out.println(hexadecimalABinario("4A57"));

        //convertirNumero();

        //String cifrado = cifradoCesar("como anda mi abueee tremennndo askjdjakdja yo nose  qpasa",22);
        //System.out.println(cifrado);
        //String desifrado = cifradoCesar(cifrado,-22);
        //System.out.println(desifrado);

        //System.out.println(generarContra());
    }

    public static void adivinarNumero(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int intentos = 1;
        int numero = random.nextInt(101);
        System.out.println("Ingrese un número entre 0 y 100");
        int prueba = scanner.nextInt();

        while (prueba!=numero){
            if (prueba>numero){
                System.out.println("El NÚMERO ES MAS PEQUEÑO QUE "+prueba);
            } else {
                System.out.println("El NÚMERO ES MAS GRANDE QUE "+prueba);
            }
            prueba = scanner.nextInt();
            intentos++;
        }
        System.out.println("CORRECTO, EL NÚMERO ERA "+numero+", LO ADIVINASTE EN "+intentos+" INTENTOS");
        scanner.close();
    }

    // Aprovecho para ver recursividad un cacho
    public static int Fibonacci(int num){
        if (num==0){
            return 0;
        } else if (num==1) {
            return 1;
        } else{
            return Fibonacci(num-1)+Fibonacci(num-2);
        }
    }

    public static String decimalABinario(String num){
        ArrayList<Integer> array = new ArrayList<Integer>();
        int numInt = Integer.parseInt(num);
        while(numInt>0){
            array.add(numInt%2);
            numInt/=2;
        }
        Collections.reverse(array);
        StringBuilder str = new StringBuilder();
        for (Integer i : array){
            str.append(i);
        }
        return str.toString();
    }

    public static String decimalAHexadecimal(String num){
        ArrayList<String> array = new ArrayList<String>();
        int numInt = Integer.parseInt(num);
        while(numInt>0){
            int valor = numInt%16;
            if (valor<=9){
                array.add(String.valueOf(valor));
            }else{
                switch (valor){
                    case 10:
                        array.add("A");
                        break;
                    case 11:
                        array.add("B");
                        break;
                    case 12:
                        array.add("C");
                        break;
                    case 13:
                        array.add("D");
                        break;
                    case 14:
                        array.add("E");
                        break;
                    case 15:
                        array.add("F");
                        break;
                }
            }
            numInt/=16;
        }
        Collections.reverse(array);
        StringBuilder str = new StringBuilder();
        for (String i : array){
            str.append(i);
        }
        return str.toString();
    }

    public static String binarioADecimal(String num){
        int resultado = 0;
        double multiplicador = num.length()-1;

        for (int i = 0; i<num.length(); i++){
            if (num.charAt(i)=='1'){
                resultado += Math.pow(2,multiplicador);
            }
            multiplicador--;
        }
        return String.valueOf(resultado);
    }

    public static String binarioAHexadecimal(String num){
        String decimal = binarioADecimal(num);
        return decimalAHexadecimal(decimal);
    }

    public static String hexadecimalADecimal(String num){
        int resultado = 0;
        double multiplicador = num.length()-1;

        for (int i = 0; i<num.length(); i++){
            int valor = switch (num.charAt(i)) {
                case 'A' -> 10;
                case 'B' -> 11;
                case 'C' -> 12;
                case 'D' -> 13;
                case 'E' -> 14;
                case 'F' -> 15;
                default -> num.charAt(i) - '0';
            };
            resultado += (int) (Math.pow(16,multiplicador)*valor);
            multiplicador--;
        }
        return String.valueOf(resultado);
    }

    public static String hexadecimalABinario(String num){
        String decimal = hexadecimalADecimal(num);
        return decimalABinario(decimal);
    }

    //Evidentemente no hay restricciones
    public static void convertirNumero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------\n1) Decimal a Binario\n2) Decimal a Hexadecimal\n3) Binario a Decimal\n4) Binario a Hexadecimal\n5) Hexadecimal a Decimal\n6) Hexadecimal a Binario\n-----Ingrese el número de operación que quiere hacer-----");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        switch (opcion){
            case 1:
                System.out.println("Ingrese el número entero decimal");
                String decimal = scanner.nextLine();
                System.out.println("El número decimal "+decimal+" en binario es "+decimalABinario(decimal));
                break;
            case 2:
                System.out.println("Ingrese el número entero decimal");
                String decimal2 = scanner.nextLine();
                System.out.println("El número decimal "+decimal2+" en hexadecimal es "+decimalAHexadecimal(decimal2));
                break;
            case 3:
                System.out.println("Ingrese el número binario");
                String binario = scanner.nextLine();
                System.out.println("El número binario "+binario+" en decimal es "+binarioADecimal(binario));
                break;
            case 4:
                System.out.println("Ingrese el número binario");
                String binario2 = scanner.nextLine();
                System.out.println("El número binario "+binario2+" en hexadecimal es "+binarioAHexadecimal(binario2));
                break;
            case 5:
                System.out.println("Ingrese el número hexadecimal");
                String hexa = scanner.nextLine();
                System.out.println("El número hexadecimal "+hexa+" en decimal es "+hexadecimalADecimal(hexa));
                break;
            case 6:
                System.out.println("Ingrese el número hexadecimal");
                String hexa2 = scanner.nextLine();
                System.out.println("El número hexadecimal "+hexa2+" en binario es "+hexadecimalABinario(hexa2));
                break;
        }
        scanner.close();
    }

    public static String cifradoCesar(String cadena, int mover){
        char[] copia = cadena.toCharArray();
        int contador = 0;
        if (mover>0){
            for (int i = 0; i<cadena.length(); i++){
                if ((i+mover)<cadena.length()){
                    copia[i+mover] = cadena.toCharArray()[i];
                } else {
                    copia[contador] = cadena.toCharArray()[i];
                    contador++;
                }
            }
        } else if (mover<0) {
            int ultimo = cadena.length()-1;
            int prueba = mover;
            for (int i = 0; i<cadena.length(); i++){
                if ((i+mover)<0){
                    copia[cadena.length()+prueba] = cadena.toCharArray()[i];
                    prueba++;
                } else {
                    copia[contador] = cadena.toCharArray()[i];
                    contador++;
                }
            }
        }
        return String.valueOf(copia);
    }

    public static String generarContra(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese la longitud de la contraseña (minimo 8)");
        int largo = scanner.nextInt();
        while (largo<8){
            System.out.print("ERROR, debe ser por lo menos de 8 caracteres, pruebe denuevo: ");
            largo = scanner.nextInt();
        }
        char[] contra = new char[largo];
        for (int i = 0; i<largo; i++){
            int valor = random.nextInt(94)+33;
            char caracter = (char) valor;
            contra[i] = caracter;
        }
        return String.valueOf(contra);
    }
}