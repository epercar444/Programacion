package orentacionAobjetos;

import java.util.Arrays;

public class Partida {
	private String nombre;
	private Jugador [] participantes;
	private String ganador;
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
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Jugador[] getParticipantes() {
		return participantes;
	}
	public void setParticipantes(Jugador[] participantes) {
		this.participantes = participantes;
	}
	public String getGanador() {
		return ganador;
	}
	public void setGanador(String ganador) {
		this.ganador = ganador;
	}
	private float CalculaGanador () {
		float puntuacionganador = 0;
		for (int i = 0; i < participantes.length;i++) {
			Jugador p = participantes[i];
			if (p.getPuntuacion() > puntuacionganador) {
				puntuacionganador = p.getPuntuacion();
			}
			}
			return puntuacionganador;
	}
	void ImprimeGanador () {
		float puntuacionganador = CalculaGanador();
		for (int i = 0; i < participantes.length;i++) {
			Jugador p = participantes[i];
			if (p.getPuntuacion() == puntuacionganador) {
			String cadena = "El ganador es el jugador/a con el nick " + p.getNick() + " de nombre " + p.getNombre() + " con edad " + p.getEdad() + " y de puntuación " + p.getPuntuacion();
			System.out.println(cadena);
	}
			ganador = p.getNombre();
		} 
}}
