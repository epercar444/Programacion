package unidadd2;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número impar: ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("El número debe ser impar. Inténtalo de nuevo.");
        } else {
            for (int i = 1; i <= n; i += 2) {
                for (int j = 0; j < (n - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 0; i < (n - 1) / 2; i++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }
    }
}
