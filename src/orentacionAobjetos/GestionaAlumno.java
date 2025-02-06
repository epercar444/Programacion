package orentacionAobjetos;

public class GestionaAlumno {

	public static void main(String[] args) {
		Alumno Sara = new Alumno();
		Sara.nombre = "Sara";
		Sara.dni = "54875968W";
		Sara.nota = (float) 8;
		Alumno Marco = new Alumno();
		Marco.nombre = "Marco";
		Marco.dni = "25874136P";
		Marco.nota = 7;
		String cadenaAlumno1 = Sara.pasarAcadena();
		System.out.println(cadenaAlumno1);
		Sara.estaAprobado();
		String cadenaAlumno2 = Marco.pasarAcadena();
		System.out.println(cadenaAlumno2);
		Marco.estaAprobado();
	}

}
