package Modelo;

public class Conversor {
	private float euros;
	private final static float dolares = 1.04F;
	public Conversor(float euros) {
		super();
		this.euros = euros;
	}
	public static void convertirEurosADolares(Conversor r) {
		if (r.euros > 0) {
			double conversion = r.euros * dolares;
			System.out.println(r.euros + " pasados a dólares dan una cantidad de: " + conversion);
		}
		else {
			System.out.println("Error.Introduce un número en positivo.");
		}
	}
	
}
