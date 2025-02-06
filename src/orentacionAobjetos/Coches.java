package orentacionAobjetos;

public class Coches {
	String marca;
	String modelo;
	int fabricacion;
	String tipocombustible;
	float capacidadtanque;
	float capacidadactual;
	float consumomedio;
	public Coches(String marca, String modelo, int fabricacion, String tipocombustible, int capacidadtanque,int capacidadactual,float consumomedio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.fabricacion = fabricacion;
		this.tipocombustible = tipocombustible;
		this.capacidadtanque = capacidadtanque;
		this.capacidadactual = capacidadactual;
		this.consumomedio = consumomedio;
	}
	@Override
	public String toString() {
		return "Coches [marca=" + marca + ", modelo=" + modelo + ", fabricacion=" + fabricacion + ", tipocombustible="
				+ tipocombustible + ", capacidadtanque=" + capacidadtanque + "]";
	}
	public float calculoConsumo (int numkm) {
		float resultado = (consumomedio * numkm) / 100;
		return resultado;
	}
	public boolean respostar () {
		boolean reposta = false;
		float veintepor = (capacidadtanque * 20) / 100;
		if (capacidadactual < veintepor) {
			reposta = true;
		}
		else {
			reposta = false;
		}
		return reposta;
	}
}
