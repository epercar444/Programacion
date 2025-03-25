package Simulacro2;

import java.time.LocalDate;

public class GestionaDeportistas {

	public static void main(String[] args) throws Excepcion {
		Prueba [] pruebas = new Prueba [50];
		Prueba p1 = new Prueba("Samuel","India",LocalDate.now(),EstadoPrueba.PLANIFICADA);
		pruebas [0] = p1;
		Prueba p2 = new Prueba("Pepe","España",LocalDate.now().plusDays(12),EstadoPrueba.PLANIFICADA);
		Prueba p3 = new Prueba("Pepe","España",LocalDate.now().minusDays(12),EstadoPrueba.PLANIFICADA);
		Deportista n1 = new Nadador ("Paula","Marruecos",45,1.51,22);
		try {
			n1.agregarPrueba(p1);
			n1.agregarPrueba(p2);
			n1.agregarPrueba(p3);
		}
		catch (Excepcion e) {
			System.out.println(e.getMessage());
		}
	}

}
