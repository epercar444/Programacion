package unidadd2;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        System.out.print("Introduce el Número 1: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduce el Número 2: ");
        int numero2 = scanner.nextInt();
        while (numero1 != 0 || numero2 != 0) {
            int suma = numero1 + numero2;
            System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
            System.out.print("Introduce el Número 1: ");
            numero1 = scanner.nextInt();
            System.out.print("Introduce el Número 2: ");
            numero2 = scanner.nextInt();
        if (numero1 == 0 || numero2 == 0) {
        	System.out.print("Saliendo del programa");
        }
        }
}

    }

