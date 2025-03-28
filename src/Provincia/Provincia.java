package Provincia;

import java.util.Objects;

public class Provincia {
	private int numhab;
	private String nombre;
	public int getNumhab() {
		return numhab;
	}
	public void setNumhab(int numhab) {
		this.numhab = numhab;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected Provincia(int numhab, String nombre) {
		super();
		this.numhab = numhab;
		this.nombre = nombre;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre, numhab);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provincia other = (Provincia) obj;
		return Objects.equals(nombre, other.nombre) && numhab == other.numhab;
	}
	
	}
