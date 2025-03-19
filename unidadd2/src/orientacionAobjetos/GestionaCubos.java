package orientacionAobjetos;

public class GestionaCubos {

	public static void main(String[] args) {
		Cubo cubo1 = new Cubo (4F,50F);
		cubo1.area();
		cubo1.volumen();
		boolean rellenar = cubo1.rellenar(6F);
		System.out.println("¿Podemos rellenar el cubo? " + rellenar);
		boolean vaciar = cubo1.vaciar(4F);
		System.out.println("¿Podemos vaciar el contenido del cubo? " + vaciar);
		vaciar = cubo1.vaciar(3F);
		System.out.println("¿Podemos vaciar el contenido del cubo? " + vaciar);
		rellenar = cubo1.rellenar(16F);
		System.out.println("¿Podemos rellenar el cubo? " + rellenar);
	}

}
