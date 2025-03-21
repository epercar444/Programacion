package Simulacro2;

import java.time.LocalDate;
import java.util.Arrays;

public abstract class Deportista implements ICompeticion{
	private String nombre,pais;
	private double peso,altura;
	private int edad;
	private Prueba [] pruebas;
	protected Deportista(String nombre, String pais, double peso, double altura, int edad) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
		this.pruebas = new Prueba[50];
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
	public abstract int getTiempoCalentamiento();
	public abstract int getCaloriasNecesarias();
	//public int getHorasEntrenamiento() {
		//int numdias = 0;
		//numdias = 
			
	//}
	public void agregarPrueba(Prueba a) {
		for (int i = 0; i < pruebas.length; i++) {
			if (pruebas[i] != a) {
				pruebas[i] = a;
				System.out.println("Prueba agregada");
			}
			else {
				System.out.println("Prueba ya agregada anteriormente, intente con otra");
			}
		}
	}
	public Prueba getProximaPrueba() {
		Prueba p = pruebas[0];
		for (int i =0; i < pruebas.length; i++) {
			if (pruebas[i].equals(EstadoPrueba.PLANIFICADA) && p != null) {
				int diasMininmo = p.getFecha().compareTo(LocalDate.now());
				Prueba itero = pruebas[i];
				int diasItero = itero.getFecha().compareTo(LocalDate.now());
				if (diasMininmo > diasItero) {
					p = itero;
			}
		}
			}
		return p;
		}
	@Override
	public String toString() {
		return "Deportista [nombre=" + nombre + ", pais=" + pais + ", peso=" + peso + ", altura=" + altura + ", edad="
				+ edad + ", pruebas=" + Arrays.toString(pruebas) + "]";
	}
	}

	//public int contarPruebasporEstado(EstadoPrueba estado);

