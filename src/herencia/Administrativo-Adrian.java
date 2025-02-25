package herencia;

import java.util.Objects;

public class Administrativo-Adrian extends Empleado-Adrian{

	private int extraproductividad;

	public Administrativo(String nombre, String dni, int salariobase, int extraproductividad) {
		super(nombre, dni, salariobase);
		this.extraproductividad = extraproductividad;
	}

	protected int getExtraproductividad() {
		return extraproductividad+getSalariobase();
	}

	protected void setExtraproductividad(int extraproductividad) {
		this.extraproductividad = extraproductividad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(extraproductividad);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Administrativo other = (Administrativo) obj;
		return extraproductividad == other.extraproductividad;
	}


	int calculasalario () {
		return getExtraproductividad();
	}

	@Override
	public String toString() {
		return "Administrativo [calculasalario()=" + calculasalario() + ", getNombre()=" + getNombre() + ", getDni()="
				+ getDni() + "]";
	}
	
	
}
