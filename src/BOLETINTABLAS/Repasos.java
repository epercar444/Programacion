package BOLETINTABLAS;

import java.util.Scanner;

public class Repasos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime cuantos números quieres introducir:");
		int numero = scanner.nextInt();
		Repasos f = new Repasos();
		System.out.println("El resultado es"+ f.pares(numero,scanner));
		
	}
		int pares (int numero,Scanner sc) {
			int resultado = 0;
			for (int i=0; i < numero; i++) {
				System.out.println("Dame un número:");
				int numeros = sc.nextInt();
				if (numeros % 2 == 0) {
					resultado = resultado + numeros;
				}
			}
		return resultado;
		}
		

	

}
