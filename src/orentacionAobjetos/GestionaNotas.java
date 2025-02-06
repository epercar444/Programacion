package orentacionAobjetos;

public class GestionaNotas {

	public static void main(String[] args) {
		Notas notaproglucia = new Notas ("programacion",6,7,8);
		Notas notaBBDDlucia = new Notas ("BBDD",9,4,7);
		Alumno2 lucia = new Alumno2 ("Lucía","lucia@gmail.com");
		lucia.notaprogramacion = notaproglucia;
		lucia.notabasededatos = notaBBDDlucia;  
		Notas notaprogVicente = new Notas ("programacion",8,5,9);
		Notas notaBBDDVicente = new Notas ("BBDD", 2,4,5);
		Alumno2 vicente = new Alumno2 ("Vicente","vicente@gmail.com");
		vicente.notabasededatos = notaBBDDVicente;
		vicente.notaprogramacion = notaprogVicente;
		lucia.imprimeSiHaAprobado("programacion");
		vicente.imprimeSiHaAprobado("BBDD");
	}

}
