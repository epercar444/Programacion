package Fest;

import java.util.Collection;
import java.util.Objects;

public class Influencer{
	private String nombre,nick,plataforma;
	private int numSeguidores;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public int getNumSeguidores() {
		return numSeguidores;
	}
	public void setNumSeguidores(int numSeguidores) {
		this.numSeguidores = numSeguidores;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nick, plataforma);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Influencer other = (Influencer) obj;
		return Objects.equals(nick, other.nick) && Objects.equals(plataforma, other.plataforma);
	}
	public Influencer(String nombre, String nick, String plataforma, int numSeguidores) {
		super();
		this.nombre = nombre;
		this.nick = nick;
		this.plataforma = plataforma;
		this.numSeguidores = numSeguidores;
	}
	@Override
	public String toString() {
		return "Influencer [nombre=" + nombre + ", nick=" + nick + ", plataforma=" + plataforma + ", numSeguidores="
				+ numSeguidores + "]";
	}
	
}
