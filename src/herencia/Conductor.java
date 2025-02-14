package herencia;

import java.util.Objects;

public class Conductor {
	private String nombre;
	private int anyo;
	public Conductor(String nombre, int anyo) {
		super();
		this.nombre = nombre;
		setAnyo(anyo);
		this.anyo = getAnyo();
	}
	@Override
	public String toString() {
		return "Conductor [nombre=" + nombre + ", anyo=" + anyo + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAnyo(int anyo) {
	if (anyo > 0){
		this.anyo = anyo; 
	}
	else {
		this.anyo = 0;
	}
	}
	public int getAnyo() {
		return anyo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anyo, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conductor other = (Conductor) obj;
		return anyo == other.anyo && Objects.equals(nombre, other.nombre);
	}
	public void Conducir () {
		System.out.println(nombre + " conduciendo");
	}
}
