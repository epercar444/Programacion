package orentacionAobjetos;

public class Profesor extends Persona3 {
	private String nombredepartamento;
	private double sueldo;
	

	double getSueldo() {
		return sueldo;
	}

	void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	protected String getNombredepartamento() {
		return nombredepartamento;
	}

	protected void setNombredepartamento(String nombredepartamento) {
		this.nombredepartamento = nombredepartamento;
	}

	public Profesor(String nombre, String nombredepartamento) {
		super(nombre);
		this.nombredepartamento = nombredepartamento;
	}

	@Override
	public String toString() {
		return "Profesor [nombredepartamento=" + nombredepartamento + ", getNombredepartamento()="
				+ getNombredepartamento() + "]";
	}
	
	
}
