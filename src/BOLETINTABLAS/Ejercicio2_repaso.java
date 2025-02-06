package BOLETINTABLAS;

import java.util.Scanner;

public class Ejercicio2_repaso {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el número de árboles: ");
		int numArboles = scanner.nextInt();
		int totalAltura = 0, totalEdad = 0, cantidadTipoB = 0;
		int maxAltura = 0, minAltura = 0;
		int maxDiametro = 0, minDiametro = 0;
		boolean existenArboles30m = false;
		for (int i = 1; i <= numArboles; i++) {
			System.out.println("Introduce los datos del árbol " + i + ":");
			System.out.print("Tipo del árbol (A o B): ");
			String tipo = scanner.next().toUpperCase();
			System.out.print("Introduce el diámetro del tronco (en metros): ");
			int diametro = scanner.nextInt();
			System.out.print("Introduce la altura del árbol (en metros): ");
			int altura = scanner.nextInt();
			int edad = 0;
			if (tipo == "B") { 
				System.out.print("Introduce la edad del árbol en años: ");
				edad = scanner.nextInt();
				cantidadTipoB++;
				totalEdad += edad;
		            }
			if (i == 1) {
				maxAltura = altura;
				minAltura = altura;
				maxDiametro = diametro;
				minDiametro = diametro;
		            }
			totalAltura += altura;
			if (altura > maxAltura) {
				maxAltura = altura;
		            }
			if (altura < minAltura) {
				minAltura = altura;
		            }
			if (diametro > maxDiametro) {
				maxDiametro = diametro;
		            }
			if (diametro < minDiametro) {
				minDiametro = diametro;
		            }
			if (altura > 30) {
				existenArboles30m = true;
		            }
		        }
		int mediaAltura = (int) totalAltura / numArboles;
		System.out.println("\nMedia de las alturas de los árboles: " + mediaAltura);
		System.out.println("Altura máxima de los árboles: " + maxAltura);	
		System.out.println("Altura mínima de los árboles: " + minAltura);
		System.out.println("Diámetro máximo de los árboles: " + maxDiametro);
		System.out.println("Diámetro mínimo de los árboles: " + minDiametro);
		if (cantidadTipoB > 0) {
			int mediaEdadTipoB = (int) totalEdad / cantidadTipoB;
			System.out.println("Media de las edades de los árboles de tipo B: " + mediaEdadTipoB);
		        }
		if (existenArboles30m) {
			System.out.println("Existen árboles de más de 30 m.");
		        }
		    }
		}