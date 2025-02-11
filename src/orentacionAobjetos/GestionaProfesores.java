package orentacionAobjetos;

import java.time.LocalDate;

public class GestionaProfesores {

	public static void main(String[] args) {
		ProfesorInterino interino1 = new ProfesorInterino("Pepe","Inglés",LocalDate.now().plusMonths(6));
		Profesor interino2 = new ProfesorInterino("Pepa","Historia",LocalDate.now().plusMonths(4));
		ProfesorTitular titular1 = new ProfesorTitular("Antonio","Filosofía",LocalDate.now().minusMonths(12));
		Profesor titular2 = new ProfesorTitular("Antonia","Lengua",LocalDate.now().minusMonths(6));
		System.out.println(interino1.getFechaFinContrato());
		ProfesorInterino p3 = (ProfesorInterino)interino2;
		System.out.println(p3.getFechaFinContrato());
		System.out.println(titular1.getFechaAdjudicacion());
		ProfesorTitular p4 = (ProfesorTitular) titular2;
		System.out.println(p4.getFechaAdjudicacion());
		Profesor p = (Profesor) interino1;
		System.out.println(p.getSueldo());
		ProfesorTitular p5 = (ProfesorTitular) interino2;
		
		
	}

}
