package Simulacro2;

import java.time.LocalDate;

public abstract class Deportista implements ICompeticion{
	private String nombre,pais;
	private double peso,altura;
	private int edad;
	private Prueba [] pruebas;
	protected Deportista(String nombre, String pais, double peso, double altura, int edad, Prueba[] pruebas) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
		this.pruebas = pruebas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Prueba[] getPruebas() {
		return pruebas;
	}
	public void setPruebas(Prueba[] pruebas) {
		this.pruebas = pruebas;
	}
	public abstract int getTiempoCalentamiento();
	public abstract int getCaloriasNecesarias();
	public int getHorasEntrenamiento() {
		int horas = 0;
		for (Prueba a: getPruebas()) {
			if (a.getFecha().minusDays(10) != null) {
				horas = 6; 
			}
			else if (a.getFecha().minusDays(4-10) != null) {
				horas = 4;
			}
			22
		}
	}
	public abstract void agregarPrueba();
	public abstract Prueba getProximaPrueba();
	public abstract int contarPruebasporEstado(EstadoPrueba estado);
}
