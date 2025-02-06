package orentacionAobjetos;

public class Alumno2 {
	String nombre;
	String apellidos;
	String email;
	Notas notaprogramacion;
	Notas notabasededatos;
	public Alumno2(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Alumno2 [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", notaprogramacion="
				+ notaprogramacion + ", notabasededatos=" + notabasededatos + "]";
	}


	void imprimeSiHaAprobado (String nombreA) {
		Notas notasigantura;
		if (nombreA.equals("programacion")) {
			 notasigantura = this.notaprogramacion;			
		}
		else
		{
			notasigantura  = this.notabasededatos;
		}
		
		if (notasigantura.calculaMedia() >= 5 ) {
			System.out.println("El alumno " + nombre + " ha aprobado la asignatura " + nombreA);
		}
		else {
			System.out.println("El alumno " + nombre + " no ha aprobado la asignatura " + nombreA);
		}
	}
	
	
}
