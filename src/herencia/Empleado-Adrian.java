package herencia;

import java.util.Objects;

public class Empleado-Adrian {
	
	private String nombre;
	private String dni;
	private int salariobase;
	
	public Empleado(String nombre, String dni, int salariobase) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salariobase = salariobase;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected int getSalariobase() {
		if (salariobase <0) {
			System.out.println("Error, ese no puede ser el salario, se asignará el SMI por defecto");
			salariobase = 1134;
		}
		return salariobase;
	}

	protected void setSalariobase(int salariobase) {
		this.salariobase = salariobase;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre, salariobase);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre)
				&& salariobase == other.salariobase;
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", dni=" + dni + "]";
	}

	int calculasalario (int salariobase) {
		return getSalariobase();
	}

}
