package orentacionAobjetos;

import java.util.Arrays;

public class Equipo {
	String nombreEquipo;
	int [] puntuaciones;
	Persona [] personas;
	public Equipo(String nombreEquipo, int[] puntuaciones, Persona[] personas) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.puntuaciones = puntuaciones;
		this.personas = personas;
	}
	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", puntuaciones=" + Arrays.toString(puntuaciones)
				+ ", personas=" + Arrays.toString(personas) + "]";
	}
	float CalculaMediaEdad () {
		float media = 0;
		for (int i = 0; i < personas.length;i++) {
			Persona p = personas[i];
			media = media + p.edad;
			}
			media = media/personas.length;
			return media;
	}
}
