package herencia;

import java.util.Objects;

public class Entrenador extends Persona{
	private String idfed;
	public String getIdfed() {
		return idfed;
	}
	public void setIdfed(String idfed) {
		this.idfed = idfed;
	}
	public Entrenador(String nombre, String email, String apellidos, int edad, float salario) {
		super(nombre, email, apellidos, edad, salario);
		this.idfed = "ESP";
	}
	
	public Entrenador(String nombre, String email, String apellidos, int edad, float salario, String idfed) {
		super(nombre, email, apellidos, edad, salario);
		this.idfed = idfed;
	}
	protected void dirigirPartido() {
		System.out.println("Dirigir partido Entrenador");
	}

	
}
