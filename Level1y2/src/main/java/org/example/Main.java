package org.example;
import java.lang.Math;
import java.util.concurrent.TransferQueue;

public class Main {
    public static void main(String[] args) {

        System.out.println(areaCirculo(3));
        System.out.println(perimteroCirculo(3));
        System.out.println(esPrimo(47));
        Fibonacci(5);

    }

    public static double areaCirculo(int radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double perimteroCirculo(int radio) {
        return 2 * Math.PI * radio;
    }

    public static boolean esPrimo(int number) {
        if (number == 2) {
            return true;
        } else {
            boolean esPrimo = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    esPrimo = false;
                }
            }
            return esPrimo;
        }
    }

    public static void Fibonacci(int number){

        String numeros = "";
        int numero1 = 0;
        int numero2 = 1;

        for (int i = 0; i<number; i++){
            numeros += (String.valueOf(numero1));
            numero1 += numero2;
            numero2 += numero1;
        }
        System.out.println(numeros);
    }
}
