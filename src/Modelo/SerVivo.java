package Modelo;

public abstract class SerVivo {
	private int edad;
	protected SerVivo(int edad) {
		super();
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public abstract boolean estaVivo();
	public abstract boolean seDesplaza();
}
