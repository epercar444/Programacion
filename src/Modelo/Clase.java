package Modelo;

import java.util.Scanner; 

public class Clase {
	public static void main(String[] args) { 
	Scanner scanner = new Scanner(System.in); 
	System.out.print("Ingresa un número entero: "); 
	int numero = scanner.nextInt(); 
	System.out.print("Ingresa otro número para dividir: "); 
	int divisor = scanner.nextInt(); 
	int resultado = numero / divisor; 
	System.out.println("El resultado de la división es" + resultado); 
	scanner.close(); 
	} 
	}

