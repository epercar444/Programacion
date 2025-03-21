package Simulacro3;

import java.util.Arrays;
import java.util.Objects;

public abstract class Piloto implements IVuelo{
	private String nombre,nacionalidad;
	private int edad,numlicencia;
	private double totalhorasvuelo;
	private Vuelo[] vuelos;
	@Override
	public int hashCode() {
		return Objects.hash(numlicencia);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piloto other = (Piloto) obj;
		return numlicencia == other.numlicencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNumlicencia() {
		return numlicencia;
	}
	public void setNumlicencia(int numlicencia) {
		this.numlicencia = numlicencia;
	}
	public double getTotalhorasvuelo() {
		return totalhorasvuelo;
	}
	public void setTotalhorasvuelo(double totalhorasvuelo) {
		this.totalhorasvuelo = totalhorasvuelo;
	}
	public Vuelo[] getVuelos() {
		return vuelos;
	}
	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}
	protected Piloto(String nombre, String nacionalidad, int edad, int numlicencia, double totalhorasvuelo,
			Vuelo[] vuelos) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.numlicencia = numlicencia;
		this.totalhorasvuelo = totalhorasvuelo;
		this.vuelos = vuelos;
	}
	@Override
	public String toString() {
		return "Piloto [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", numlicencia="
				+ numlicencia + ", totalhorasvuelo=" + totalhorasvuelo + ", vuelos=" + Arrays.toString(vuelos) + "]";
	}
	
}
