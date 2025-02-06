package orentacionAobjetos;

public class Alumno {
	String nombre;
	String dni;
	float nota;

	String pasarAcadena () {
		String cadena = "Alumno/a:" + nombre + " con dni:" + dni + " y con nota:" + nota;
		return cadena;
	}
	boolean estaAprobado () {
		boolean aprobado = true;
		if (nota > 5)  {
			aprobado = true;
		}
		else {
			aprobado = false;
		}
		System.out.println("El alumno/a está aprobado?:"+aprobado);
		return aprobado;
	}}