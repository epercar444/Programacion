package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Mascotas {
	private String nombre;
	private int edad;
	private String estado;
	private LocalDate fechaNacimiento;
	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println(this.getClass().getName());
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mascotas other = (Mascotas) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@Override
	public String toString() {
		return this.muestra();
	}
	public abstract String muestra();
	public abstract boolean habla();
	public boolean morir () {
		boolean muerto = false;
		if (2025 - fechaNacimiento.getYear() > 20) {
			muerto = true;
		}
		return muerto;
	}
	
}
