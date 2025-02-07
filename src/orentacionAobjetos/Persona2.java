package orentacionAobjetos;

import java.time.LocalDate;

public class Persona2 {
	private String dni, nombre, apellidos;
	private LocalDate fechanacimiento;
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		if (dni.length()==9) {
			this.dni = dni;
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public Persona2(String dni, String nombre, String apellidos, LocalDate fechanacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechanacimiento = fechanacimiento;
	}
	@Override
	public String toString() {
		return "Persona2 [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechanacimiento="
				+ fechanacimiento + "]";
	}
	
}
