package Controlador;

import Modelo.*;

public class GestionaAnimal {

	public static void main(String[] args) {
		Animal p1 = new Perro ();
		Animal g1 = new Gato ();
		Animal pe1 = new Pez();
		
		System.out.println(p1.getAlimento());
		System.out.println(p1.getSonidoEmite());
		
		System.out.println(g1.getAlimento());
		System.out.println(g1.getSonidoEmite());
		
		System.out.println(pe1.getAlimento());
		System.out.println(pe1.getSonidoEmite());

	}

}
