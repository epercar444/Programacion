package Modelo;

public class Circulo {
	private double radio;
	private int id;
	private static int contador;
	private final static double PI = 3.1416;
	public Circulo(double radio) {
		super();
		this.radio = radio;
		this.id = contador +1;
		contador = contador +1;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double calculaArea() {
		return PI*radio*radio;
	}
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", id=" + id + "]";
	}
	
}

