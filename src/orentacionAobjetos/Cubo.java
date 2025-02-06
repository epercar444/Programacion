package orentacionAobjetos;

public class Cubo {
	float lado;
	float litroscontiene;
	public Cubo(float lado, float litros) {
		super();
		this.lado = lado;
		this.litroscontiene = litros;
	}
	public float area () {
		float suma = 6 * (lado * lado);
		return suma;
	}
	public float volumen () {
		float resultado = lado * lado * lado;
		return resultado;
	} 
	public boolean rellenar (float litrosrellenar) {
		boolean entra = true;
		float capacidadmaxima = volumen();
		float litrostotal = litroscontiene + litrosrellenar;
		if (litrostotal < capacidadmaxima ) {
			entra = true;
			litroscontiene = litrostotal;
		}
		else {
			entra = false;
		}
		return entra;
	}
	public boolean vaciar (float litrosvaciar) {
		boolean sale = true;
		float litrostotales = litroscontiene - litrosvaciar;
		if (litrostotales < 0) {
			sale = false;
	}
		else {
			sale = true;
			litroscontiene = litrostotales;
		}
		return sale;
	}
	@Override
	public String toString() {
		return "Cubo [lado=" + lado + ", litroscontiene=" + litroscontiene + ", capacidadmaxima=" + volumen()
				+ "]";
	}
	
}
