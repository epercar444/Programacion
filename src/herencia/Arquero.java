package herencia;

public class Arquero extends Personaje {

	public Arquero(String nombre, int nivel, int hp) {
		super(nombre, nivel, hp);
	}
	protected boolean esatacado(Personaje atacante) {
		boolean ataca=true;
			if(atacante instanceof Mago) {
				
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
			else if (atacante instanceof Caballero && distancia >50) {
				ataca= false;
			}
			else {
				ataca=false;
			}
			return ataca;
			
	
		
		
	}
}
