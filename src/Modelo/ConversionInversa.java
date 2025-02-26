package Modelo;

public class ConversionInversa {
	private float dolares;
	private final static float euros = 0.95F;
	public ConversionInversa(float dolares) {
		super();
		this.dolares = dolares;
	}
	public static void convertirEurosADolares(ConversionInversa r) {
		if (r.dolares > 0) {
			double conversion = r.dolares * euros;
			System.out.println(r.dolares + " pasados a euros dan una cantidad de: " + conversion);
		}
		else {
			System.out.println("Error.Introduce un número en positivo.");
		}
	}
	
}
