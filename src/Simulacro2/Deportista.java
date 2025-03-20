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
	
	/* Punto1 excepcion for (Prueba a: pruebas) {
		if (a.equals(a)) {
			throw new Excepcion
		}
		else {
			for (int i =0; i < pruebas.length; i++) {
				if (pruebas[i] == null) {
					pruebas[i] = a;
				}
			}
		}
	}
	/*Punto2 Excepcion if (EstadoPrueba.Planificada && fecha.after.LocalDate.now()) {
	 * throw new Excepcion()
	 * Punto3 Excepcion for(int i = 0; i < pruebas.length(); i++) {
	 * if (EstadoPrueba.Planificada y la fecha mas cercana????
	 * Punto4 Excepcion nombreFuncion () {
	 * int contador = 0;
	 * for (int i =0; i < pruebas.length; i++) {
	 * if (EstadoPrueba.PLANIFICADA) {
	 * contador +=1;
	 * así con los otros dos
	 */
	 */
	public abstract int getTiempoCalentamiento();
	public abstract int getCaloriasNecesarias();
	/*public int getHorasEntrenamiento() {
		int horas = 0;
		for (Prueba a: getPruebas()) {
			int dias = a.getFecha().before(LocalDate now());
				horas = 6; 
			}
			else if (a.getFecha().minusDays(4-10) != null) {
				horas = 4;
			}
			22
		}
	}*/
	//public void agregarPrueba();
	//public Prueba getProximaPrueba();
	//public int contarPruebasporEstado(EstadoPrueba estado);
}
