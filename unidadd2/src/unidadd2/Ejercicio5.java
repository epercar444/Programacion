package unidadd2;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Tienes membresía premium? : ");
        String premium = scanner.nextLine();
        System.out.print("Dime tu edad: ");
        int edad = scanner.nextInt();
        System.out.print("¿Cuánto dinero has gastado? ");
        int gasto = scanner.nextInt();
        boolean membresiaPremium = premium.equalsIgnoreCase("sí");
        if ((membresiaPremium && gasto > 50) || edad > 65) {
            System.out.println("¡Eres elegible para un descuento!");
        } else {
            System.out.println("No eres elegible para un descuento.");
        }
    }
}
