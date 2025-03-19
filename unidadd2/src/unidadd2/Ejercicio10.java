package unidadd2;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int intento = -1; 
        System.out.println("Intenta adivinar el número");
        while (intento != numeroAleatorio) {
            System.out.print("Introduce tu número: ");
            intento = scanner.nextInt();
            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor. ¡Inténtalo de nuevo!");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es menor. ¡Inténtalo de nuevo!");
            }
        }

        System.out.println(" Has adivinado el número");
    }
}

