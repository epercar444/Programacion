package Modelo;

import java.time.LocalDate;

public abstract class Mascotas {
	private String nombre;
	private int edad;
	private String estado;
	private LocalDate fechaNacimiento;
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
	public abstract String Muestra();
	public abstract boolean Habla();
	public boolean Morir () {
		boolean muerto = false;
		if (2025 - fechaNacimiento.getYear() > 20) {
			muerto = true;
		}
		return muerto;
	}
	
}
