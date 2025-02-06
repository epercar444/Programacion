package orentacionAobjetos;

public class Jugador {
	String nick;
	String nombre;
	int edad;
	float puntuacion;
	public Jugador(String nick, String nombre, int edad, float puntuacion) {
		super();
		this.nick = nick;
		this.nombre = nombre;
		this.edad = edad;
		this.puntuacion = puntuacion;
	}
	@Override
	public String toString() {
		return "Jugador [nick=" + nick + ", nombre=" + nombre + ", edad=" + edad + ", puntuacion=" + puntuacion + "]";
	}
	
}
