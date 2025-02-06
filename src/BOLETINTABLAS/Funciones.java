package BOLETINTABLAS;

import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {
		Funciones f = new Funciones();
		int resultado = f.sumaNum (4,7);
		System.out.println(resultado);
		String[] tablanombre = f.generaLista();
		for (String nombre : tablanombre) {
			System.out.println(nombre); }
	}
		int sumaNum (int num1, int num2) {
			return num1 + num2;

		}
		
		String[] generaLista () 
		{
			String [] nombres = new String [5];
			for (int i = 0; i<6;i++) {
				Scanner scanner = new Scanner(System.in);
				String nombre = scanner.next();
				nombres [i] = nombre;
				
			}
			return nombres;
		}
		
}

