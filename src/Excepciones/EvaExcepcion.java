package Excepciones;

public class EvaExcepcion extends Exception{

	protected EvaExcepcion(String mensaje) {
		super(mensaje);
	}

	@Override
	public String toString() {
		return "EvaExcepcion []";
	}
	
}
