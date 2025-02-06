package orentacionAobjetos;

import java.util.Scanner;

public class Producto {
	String nombre;
	int unidades;
	float precioventa;
	boolean hayQuePedirStock () {
		boolean pedir = false;
		if (unidades <= 3) {
			pedir = true;
		}
		else {
			pedir = false;
		}
		System.out.println("¿Hay que pedir más stock del producto?:" + pedir);
		return pedir;
}
	int aumentaUnidades (int aumentos, Scanner sc) {
			System.out.println("¿Cuánto quieres aumentar?:");
			aumentos = sc.nextInt();
			unidades = unidades + aumentos;
			System.out.println("Las unidades actuales de dicho producto son: " + unidades);
		return unidades;
		
}
	String pasaAcadena () {
		String cadena = "Las unidades actuales del producto es de" + unidades;
		return cadena;
	}
	}

