package unidadd2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa el alto del rectángulo: ");
        int alto = scanner.nextInt();
		System.out.print("Ingresa el ancho del rectángulo: ");
		int ancho = scanner.nextInt();
		float area = alto * ancho;
		System.out.print("El área del rectángulo es" + area);
	}

}
