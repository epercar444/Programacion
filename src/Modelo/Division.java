package Modelo;

import java.util.Arrays;
import java.util.Random;

public class Division {

	public static void main(String[] args) {
		Random r1 = new Random();
		Float [] numeros = new Float [20];
		try {
		for (int i = 0; i < numeros.length; i++) {
		int numero1 = r1.nextInt(10)+1; 
		int numero2 = r1.nextInt(10)+1;
		float suma = numero1 / numero2;
		numeros[i] = suma;
		numeros[19] = null;

	}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Excepción (fuera de rango) encontrada:" + e.getMessage());
		}
		catch (ArithmeticException p) {
			System.out.println("Excepción (división por 0) encontrada:" + p.getMessage());
		}
		finally {
			try {
				System.out.println(Arrays.toString(numeros));
			}
			catch (NullPointerException a) {
				System.out.println("Excepción (posición nula) encontrada:" + a.getMessage());
			}
			System.out.println("Divisiones finalizadas");
		}

}}
