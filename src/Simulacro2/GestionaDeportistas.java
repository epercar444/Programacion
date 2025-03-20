package Simulacro2;

import java.time.LocalDate;

public class GestionaDeportistas {

	public static void main(String[] args) {
		Prueba [] pruebas = new Prueba [20];
		Prueba p1 = new Prueba("Carla","India",LocalDate.now(),EstadoPrueba.CERRADA);
		pruebas [0] = p1;
		Nadador n1 = new Nadador ("Ángel","Marruecos",45,1.51,22, pruebas);
		System.out.println(n1.getTiempoPrueba());

	}

}
