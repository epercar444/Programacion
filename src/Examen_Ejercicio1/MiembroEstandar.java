package Examen_Ejercicio1;

import Collection.MiembroBase2;

public class MiembroEstandar extends MiembroBase2{
	private static int maximoAmigos = 2;

	public MiembroEstandar(String email, String nombre) {
		super(email, nombre);
		// amigos = new MiembroBase[2];
	}

	@Override
	public String getTipoUsuario() {
		return "Estándar";
	}

	@Override
	public String toString() {
		return "MiembroEstandar [getTipoUsuario()=" + getTipoUsuario() + ", getId()=" + getId() + ", getEmail()="
				+ getEmail() + ", getNombre()=" + getNombre() + "]";
	}


	
}
