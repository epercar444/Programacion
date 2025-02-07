package orentacionAobjetos;

public class CuentaBanco {
	private double saldo;
	private String numcuenta;
	private Persona2 titular;
	private Persona2 autorizado;
	public CuentaBanco(double saldo, String numcuenta, Persona2 titular) {
		super();
		this.saldo = saldo;
		this.numcuenta = numcuenta;
		this.titular = titular;	}
	public double getSaldo() {
		return saldo;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumcuenta() {
		return numcuenta;
	}
	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}
	public Persona2 getTitular() {
		return titular;
	}
	public void setTitular(Persona2 titular) {
		this.titular = titular;
	}
	public Persona2 getAutorizado() {
		return autorizado;
	}
	public void setAutorizado(Persona2 autorizado) {
		this.autorizado = autorizado;
	}
	private boolean validarImporte (double importe) {
	return importe > 0;
	}
	private boolean validarAutorizado (String dni) {
		return dni != null && dni.equals(autorizado.getDni());
	}
	public void ingresarDinero (Persona2 personaGestion, double ingreso) {
		if (validarAutorizado(personaGestion.getDni()) && validarImporte(ingreso)) {
			setSaldo(getSaldo() + ingreso);
	}
		else {
			System.out.println("ERROR: No es autorizado o ingreso incorrecto");
			}
	}
	public void retirarDinero (Persona2 personaGestion, double reintegro) {
		if (validarAutorizado(personaGestion.getDni()) && validarImporte(reintegro) && getSaldo() >= reintegro) {
			setSaldo(getSaldo() + reintegro);
	}
		else {
			System.out.println("ERROR: No es autorizado o ingreso incorrecto");
		}
	}
	public void eliminarAutorizado (String dni) {
		if (validarAutorizado(dni)) {
			autorizado=null;
		}
		else {
			System.out.println("ERROR: La persona introducida no está autorizado");
		}
	}
}
