package herencia;

public class Villano extends Personaje {

	public Villano(String nombre, int nivel, int hp) {
		super(nombre, nivel, hp);
		// TODO Auto-generated constructor stub
	}
	
	protected boolean esatacado(Personaje atacante) {
		return true;
	}
}
