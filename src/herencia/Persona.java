package herencia;

import java.util.Objects;

public class Persona {
	private String nombre;
	private String email;
	private String apellidos;
	private int edad;
	private float salario;
	
	protected void concentrarse() {
		System.out.println("Concentrarse padre ");
	}
	protected void concentrarse  (String lugar) {
		System.out.println("método concentrarse del padre con String " + lugar);
	}
	 
	public Persona(String nombre, String email,String apellidos,int edad,float salario) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.apellidos = apellidos;
		this.edad = edad;
		this.salario = salario;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", email=" + email + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", salario=" + salario + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, edad, email, nombre, salario);
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
		return Objects.equals(apellidos, other.apellidos) && edad == other.edad && Objects.equals(email, other.email)
				&& Objects.equals(nombre, other.nombre)
				&& Float.floatToIntBits(salario) == Float.floatToIntBits(other.salario);
	}

	
}
