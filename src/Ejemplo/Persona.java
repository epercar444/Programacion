package Ejemplo;

import java.util.Objects;

public class Persona implements Comparable<Persona>{
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Persona o) {
		return this.getNombre().compareTo(o.getNombre());
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
	

	
}
