package herencia;

import java.util.Objects;

public class Directivoo extends Empleadoo {
	float bonificacion;

	public Directivoo(String nombre, String dni, float salarioBase, float bonificacion) {
		super(nombre, dni, salarioBase);
		this.bonificacion = bonificacion;
	}

	public float getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(float bonificacion) {
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
		Directivoo other = (Directivoo) obj;
		return Float.floatToIntBits(bonificacion) == Float.floatToIntBits(other.bonificacion);
	}
	public float calculaSalario () {
		float bonificacion1 = bonificacion / 100;
		float bonificacion2 = bonificacion1 * getSalarioBase();
		float salarioReal = getSalarioBase() + bonificacion2;
		return salarioReal;
	}
	}


