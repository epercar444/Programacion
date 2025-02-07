package orentacionAobjetos;

import java.time.LocalDate;

public class GestionaBanco {

	public static void main(String[] args) {
		Persona2 titular = new Persona2 ("12345678Q","María","Vázquez Romero",LocalDate.of(2020, 12, 25));
		Persona2 autorizado = new Persona2 ("12345678Q","María","Vázquez Romero",LocalDate.of(2020, 12, 25));
		CuentaBanco cuenta1 = new CuentaBanco (0.0,"1234123412341234123412341234",titular);
		cuenta1.setAutorizado(autorizado);
		cuenta1.ingresarDinero(autorizado, 150);
		System.out.println(cuenta1.getSaldo());

	}

}
