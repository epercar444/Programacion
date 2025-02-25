package herencia;

public class Gestionaempleados {

	public static void main(String[] args) {
		Directivoo juan = new Directivoo ("Juan","87654321B",2800,15);
		Administrativoo carlos = new Administrativoo ("Carlos","12345678A",1200,40);
		Empleadoo juana = new Empleadoo ("Juana","159753852C",1200);
		Empleadoo juana1 = new Empleadoo ("Juana","159753852C",-1200);
		Empleadoo pepe = new Empleadoo ("Pepe","7514268951D",1400);
		System.out.println("¿Son iguales estos empleados?: " + juana.sonIguales(juana1));
		System.out.println("¿Son iguales estos empleados?: " + juana.sonIguales(pepe));
		System.out.println(carlos.toString());
		System.out.println(juan.toString());
	}

}
