package Modelo;

import java.util.Arrays;

public abstract class Animaltres {
	private String nombre;
	protected TipoFamilia tipofamilia;
	private String lugarHabita;
	private Animaltres[] animales_come;
	private Animaltres[] animales_comido;
	
	protected Animaltres(String nombre, TipoFamilia tipofamilia, String lugarHabita, Animaltres[] animales_come,
			Animaltres[] animales_comido) {
		super();
		this.nombre = nombre;
		this.tipofamilia = tipofamilia;
		this.lugarHabita = lugarHabita;
		this.animales_come = animales_come;
		this.animales_comido = animales_comido;
	}
	@Override
	public String toString() {
		return "Animaltres [nombre=" + nombre + ", tipofamilia=" + tipofamilia + ", lugarHabita=" + lugarHabita
				+ ", animales_come=" + Arrays.toString(animales_come) + ", animales_comido="
				+ Arrays.toString(animales_comido) + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public TipoFamilia getTipofamilia() {
		return tipofamilia;
	}
	public void setTipofamilia(TipoFamilia tipofamilia) {
		this.tipofamilia = tipofamilia;
	}
	public String getLugarHabita() {
		return lugarHabita;
	}
	public void setLugarHabita(String lugarHabita) {
		this.lugarHabita = lugarHabita;
	}
	public Animaltres[] getAnimales_come() {
		return animales_come;
	}
	public void setAnimales_come(Animaltres[] animales_come) {
		this.animales_come = animales_come;
	}
	public Animaltres[] getAnimales_comido() {
		return animales_comido;
	}
	public void setAnimales_comido(Animaltres[] animales_comido) {
		this.animales_comido = animales_comido;
	}
	public abstract boolean atacar(Animaltres b);
	public abstract boolean huir(Animaltres c);
}
