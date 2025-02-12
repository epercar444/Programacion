package herencia;

public class GestionaPersona {

	public static void main(String[] args) {
	Persona p = new Persona ("Pepe","pepe@gmail.com","apellido",25,3000);
	Persona p1 = new Entrenador ("Pepe","pepe@gmail.com","apellido",25,3000);
	System.out.println(p1.toString());
	Entrenador p2 = new Entrenador("Pepe","pepe@gmail.com","apellido",25,3000);
	p2.dirigirPartido();
	Entrenador p3 = (Entrenador) p1;
	p3.dirigirPartido();
	p.concentrarse("partido");
	p.concentrarse();
	}

}
