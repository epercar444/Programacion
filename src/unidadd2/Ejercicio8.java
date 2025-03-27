package unidadd2;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();
        System.out.println("Números desde 1 hasta " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}

