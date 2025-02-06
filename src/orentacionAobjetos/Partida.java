package orentacionAobjetos;

import java.util.Arrays;

public class Partida {
	String nombre;
	Jugador [] participantes;
	String ganador;
	public Partida(String nombre, Jugador[] participantes) {
		super();
		this.nombre = nombre;
		this.participantes = participantes;
	}
	@Override
	public String toString() {
		return "Partida [nombre=" + nombre + ", participantes=" + Arrays.toString(participantes) + ", ganador="
				+ ganador + "]";
	}
	private float CalculaGanador () {
		float puntuacionganador = 0;
		for (int i = 0; i < participantes.length;i++) {
			Jugador p = participantes[i];
			if (p.puntuacion > puntuacionganador) {
				puntuacionganador = p.puntuacion;
			}
			}
			return puntuacionganador;
	}
	void ImprimeGanador () {
		float puntuacionganador = CalculaGanador();
		for (int i = 0; i < participantes.length;i++) {
			Jugador p = participantes[i];
			if (p.puntuacion == puntuacionganador) {
			String cadena = "El ganador es el jugador/a con el nick " + p.nick + " de nombre " + p.nombre + " con edad " + p.edad + " y de puntuación " + p.puntuacion;
			System.out.println(cadena);
	}
			ganador = p.nombre;
		} 
}}
