package unidadd2;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número para construir el triángulo: ");
        int numero = scanner.nextInt();
        System.out.println("Triángulo generado:");
        for (int i = 1; i <= numero; i++) {
            for (int n = 1; n <= i; n++) {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
    }
}

