package Controlador;

import java.util.Arrays;

import Modelo.*;

public class GestionaTiendadeAnimales {

	public static void main(String[] args) {
		int contador = 0;
		Gatodos g1 = new Gatodos();
		System.out.println(g1.equals(g1));
		
		Mascotas [] animales = new Mascotas [10];
		animales[contador] = g1;
		contador += 1;
		System.out.println(Arrays.toString(animales));
	}

}
