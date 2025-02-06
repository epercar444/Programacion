package BOLETINTABLAS;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime el número que quieres buscar:");
		int numero = scanner.nextInt();
		int [] tabla = {4,3,2,1,5,6,9,8};
		Ejercicio2 f = new Ejercicio2();
		System.out.println(f.buscaElemento(tabla,numero));
	}
	
		boolean buscaElemento (int [] tabla,int numero) {
			boolean encontrado = false;
			int i = 0;
			while (! encontrado && i<tabla.length) {
				if (tabla[i] == numero) {
					encontrado = true;
				}
				i = i + 1;
			}
			return encontrado; 
		
	}}


