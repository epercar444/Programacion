package Modelo;

import java.util.regex.Pattern;

public class Autoincremento {
	private static final double PI = 3.1416;
	private int identificador,edad;
	private static int contador;
	private String nombre;
	public Autoincremento(int edad, String nombre) {
		super();
		this.identificador = contador+1;
		this.edad = edad;
		this.nombre = nombre;
		contador = contador+1;
		
	}
	@Override
	public String toString() {
		return "Autoincremento [contador=" + contador + ", identificador=" + identificador + ", edad=" + edad
				+ ", nombre=" + nombre + "]";
	}
	public static boolean validaSiDniValido (String dni) {
		boolean valido = Pattern.matches("\\d{8}[A-Za-z]{1}", dni);
		return valido;
	}
	
}
