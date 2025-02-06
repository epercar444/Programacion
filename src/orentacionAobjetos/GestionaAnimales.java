package orentacionAobjetos;

public class GestionaAnimales {

	public static void main(String[] args) {
		Animal perro = new Animal();
		perro.tipo = "perro"; 
		perro.nombre = "Lulú";
		boolean camina = perro.caminar();
		System.out.println("¿Nuestro animal camina?:" + camina);
		perro.darDecomer();
		Animal gato = new Animal ();
		gato.tipo = "gato";
		boolean sonDelmismo = perro.sondelMismoTipo(perro, gato);
		System.out.println(sonDelmismo);
		}

}
