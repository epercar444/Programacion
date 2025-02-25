package Controlador;

import java.util.Scanner;

import Modelo.Autoincremento;

public class GestionaAutoincremento {

	public static void main(String[] args) {
		String cadena = "";
		Autoincremento p = new Autoincremento (20,"Pepe");
		System.out.println(p.toString());
		Autoincremento p1 = new Autoincremento (30,"Pepa");
		System.out.println(p1.toString());
		System.out.println(p1.validaSiDniValido("24482444W"));
		
		while (!cadena.equals("fin")) {
			System.out.println("Dame una cadena: ");
			Scanner scanner = new Scanner (System.in);
			cadena = scanner.next();
			Autoincremento pp = new Autoincremento (25, "Dani");
			System.out.println(pp.validaSiDniValido(cadena));
		}
	}
	
	void imprimeNoEstatico () {
		System.out.println("No estático");
	}
	static void imprimeEstatico() {
		System.out.println("estático");
	}
}