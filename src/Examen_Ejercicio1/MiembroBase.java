package Examen_Ejercicio1;

import java.util.Objects;

public abstract class MiembroBase {
	private int contadorAmigo,id;
	private static int contadorIdentificador = 0;
	private String email,nombre;
	protected MiembroBase[] amigos;
	public int getContadorAmigo() {
		return contadorAmigo;
	}
	public void setContadorAmigo(int contadorAmigo) {
		this.contadorAmigo = contadorAmigo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static int getContadorIdentificador() {
		return contadorIdentificador;
	}
	public static void setContadorIdentificador(int contadorIdentificador) {
		MiembroBase.contadorIdentificador = contadorIdentificador;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public MiembroBase[] getAmigos() {
		return amigos;
	}
	public void setAmigos(MiembroBase[] amigos) {
		this.amigos = amigos;
	}
	public MiembroBase(String email, String nombre) {
		super();
		this.contadorAmigo = 0;
		this.id = id + contadorIdentificador;
		this.contadorIdentificador += 1;
		this.email = email;
		this.nombre = nombre;
		this.amigos = new MiembroBase[50];
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MiembroBase other = (MiembroBase) obj;
		return Objects.equals(email, other.email) && id == other.id;
	}
	public abstract String getTipoUsuario();
	@Override
	public String toString() {
		return "MiembroBase [id=" + id + ", email=" + email + ", nombre=" + nombre + "]";
	}
	public boolean isAmigo (MiembroBase miembro) {
		boolean esta = false;
		for (int i=0; i < amigos.length; i++) {
			if (amigos[i].equals(miembro)) {
				esta = true;
			}
		}
		return esta;
	}
	public void addAmigo (MiembroBase miembro) throws GuzmanitosExcepcion {
		for (int i=0; i < amigos.length; i++) {
			if (isAmigo(miembro)) {
				throw new GuzmanitosExcepcion ("El miembro " + miembro.email + " ya está en la ista de amigos del miembro " + email);
			}
			else {
				amigos[i] = miembro;
		}
	}
}
}
