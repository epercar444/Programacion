package Examen_Ejercicio2;

import java.util.Objects;

public class Ciudad {
	private String nombre;
	private int Numhab;
	public Ciudad(String nombre, int numhab) {
		super();
		this.nombre = nombre;
		Numhab = numhab;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumhab() {
		return Numhab;
	}
	public void setNumhab(int numhab) {
		Numhab = numhab;
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
		Ciudad other = (Ciudad) obj;
		return Objects.equals(nombre.toLowerCase(), other.nombre.toLowerCase());
	}
	
}
