package herencia;

import java.util.Objects;

public class Administrativoo extends Empleadoo {
	float extra;

	public Administrativoo(String nombre, String dni, float salarioBase, float extra) {
		super(nombre, dni, salarioBase);
		this.extra = extra;
	}

	public float getExtra() {
		return extra;
	}

	public void setExtra(float extra) {
		this.extra = extra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(extra);
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
		Administrativoo other = (Administrativoo) obj;
		return Float.floatToIntBits(extra) == Float.floatToIntBits(other.extra);
	}
	
	public float calculaSalario () {
		float SalarioReal = getSalarioBase() + extra;
		return SalarioReal;
	}
	
}

