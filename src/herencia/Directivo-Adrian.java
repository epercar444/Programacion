package herencia;

import java.util.Objects;

public final class Directivo-Adrian extends Empleado-Adrian{

	private int bonificacion;

	public Directivo(String nombre, String dni, int salariobase, int bonificacion) {
		super(nombre, dni, salariobase);
		this.bonificacion = bonificacion;
	}

	protected int getBonificacion() {
		return (bonificacion*getSalariobase())/100 + getSalariobase();
	}

	protected void setBonificacion(int bonificacion) {
		this.bonificacion = bonificacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(bonificacion);
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
		Directivo other = (Directivo) obj;
		return bonificacion == other.bonificacion;
	}


	int calculasalario () {
		return getBonificacion();
	}

	@Override
	public String toString() {
		return "Directivo [calculasalario()=" + calculasalario() + ", getNombre()=" + getNombre() + ", getDni()="
				+ getDni() + "]";
	}
	
}
