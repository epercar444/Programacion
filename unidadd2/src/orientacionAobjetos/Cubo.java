package orientacionAobjetos;

public class Cubo {
	float lado;
	float litroscontiene;
	public Cubo(float lado, float litros) {
		super();
		this.lado = lado;
		this.litroscontiene = litros;
	}
	public void area () {
		float suma = lado * lado;
		suma = 6 * suma;
		System.out.println("El área de dicho cubo es " + suma);
	}
	public void volumen () {
		float resultado = lado * lado * lado;
		System.out.println("El volumen del cubo es de " + resultado);
	} 
	public boolean rellenar (float litrosrellenar) {
		boolean entra = true;
		float litrostotal = litroscontiene + litrosrellenar;
		float volumen = lado * lado * lado;
		if (litrostotal < volumen ) {
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
}}
