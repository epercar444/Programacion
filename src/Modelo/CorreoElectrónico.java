package Modelo;

public class CorreoElectrónico {
	 
	static boolean validaCorreo(String correo) {
		boolean valida = true;
		correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$\r\n" + "");
		return valida;
	}
	public CorreoElectronico (String correoCompleto) {
		super();
		String [] partes = correoCompleto.split("@");
		this.
	}
}
