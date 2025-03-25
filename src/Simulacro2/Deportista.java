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
	public abstract int getTiempoCalentamiento();
	public abstract int getCaloriasNecesarias();
	public int getHorasEntrenamiento() {
		int horas = 0;
		int numdias = getProximaPrueba().getFecha().compareTo(LocalDate.now());
		if (numdias > 10) {
			horas = 6;
		}
		else if(numdias>=4 && numdias<=10) {
			horas = 4;
		}
		else {
			horas = 3;
		}
		return horas;
	}
	public void agregarPrueba(Prueba a) throws Excepcion {
		for (int i = 0; i < pruebas.length; i++) {
			if (pruebas[i] != a){
				if (a.getEstado().equals(EstadoPrueba.PLANIFICADA) && a.getFecha().isBefore(LocalDate.now())) {
					throw new Excepcion("No se puede agregar una prueba planificada en fecha pasada");
			}
				else {				
					pruebas[i] = a;
				}
				}
			else {
				throw new Excepcion("Prueba ya agregada anteriormente, intente con otra");
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

	public int contarPruebasporEstado(Prueba p) {
		int contadorcerrada = 0;
		int contadorplaneada = 0;
		int contadorencurso = 0;
		if (p.getEstado().equals(EstadoPrueba.CERRADA)) {
			contadorcerrada += 1;
			return contadorcerrada;
		}
		if (p.getEstado().equals(EstadoPrueba.PLANIFICADA)) {
			contadorplaneada += 1;
			return contadorplaneada;
	}
		else {
			contadorencurso += 1;
			return contadorencurso;
	}
	}
	}
