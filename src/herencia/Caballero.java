package herencia;

public class Caballero extends Personaje{

	public Caballero(String nombre, int nivel, int hp) {
		super(nombre, nivel, hp);
		// TODO Auto-generated constructor stub
	}

protected boolean esatacado(Personaje atacante) {
	boolean ataca=true;
		if(atacante instanceof Mago || atacante instanceof Arquero) {
			
		}
		else {
			ataca=false;
		}
		return ataca;
		

	
	
}
protected boolean esatacado(Personaje atacante, int distancia) {
	boolean ataca=true;
		if(atacante instanceof Mago) {
			
		}
		else if (atacante instanceof Arquero && distancia >100) {
			ataca= false;
		}
		else {
			ataca=false;
		}
		return ataca;
		

	
	
}
}
