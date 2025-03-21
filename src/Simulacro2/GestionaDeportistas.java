package Simulacro2;

import java.time.LocalDate;

public class GestionaDeportistas {

	public static void main(String[] args) {
		Prueba [] pruebas = new Prueba [50];
		Prueba p1 = new Prueba("Samuel","India",LocalDate.now(),EstadoPrueba.PLANIFICADA);
		pruebas [0] = p1;
		Prueba p2 = new Prueba("Pepe","España",LocalDate.now().plusDays(12),EstadoPrueba.PLANIFICADA);
		pruebas [1] = p2;
		Deportista n1 = new Nadador ("Paula","Marruecos",45,1.51,22, pruebas);
		System.out.println(n1.getProximaPrueba());
	}

}
