package EntornoDesarrollo;

import java.util.Scanner;

public class ProgramacionEjercicio1 {
	public static void main(String[] args) {
	String [] abecedario = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","Y","Z"};
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce tu dni sin letra: ");
	String dni = sc.next();
	String letra = " ";
	ProgramacionEjercicio1 r = new ProgramacionEjercicio1();
	r.ValidaDni(dni);
	r.LetraDni(dni);
	for (int i = 0; i<abecedario.length;i++) {
		if (abecedario[i].equals(r.LetraDni(dni))) {
			letra = abecedario [i];
			System.out.println(dni + letra);
		}
	}
	}

	boolean ValidaDni (String dni) {
		boolean valido = true;
		if (dni.length() > 8) {
			valido = true;
		}
		else {
			valido = false;
		}
		return valido;
	}
	
	int LetraDni (String dni) {
		int suma = 0;
		boolean valido = ValidaDni(dni);
		if (valido) {
			int dni1 = Integer.parseInt(dni);
			suma = dni1 % 23;
			}
		return suma;
		}
	
	}

	
