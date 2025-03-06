package Controlador;

import Modelo.*;

public class GestionaFigura {

	public static void main(String[] args) {
		Figura c1 = new Circulodos ("rojo");
		Figura t1 = new Triangulo ("verde");
		
		System.out.println(c1.calcularArea());
		System.out.println(c1.getColor());
		
		System.out.println(t1.calcularArea());
		System.out.println(t1.getColor() );

	}

}
