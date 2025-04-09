package Ejemplo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GestionaNotas {
	public static void main(String[] args) {
		GestionaNotas f = new GestionaNotas();
		Map <Persona,Nota> notas = new HashMap<Persona,Nota>();
		Persona carla = new Persona("Carla");
		Persona sofia = new Persona("Sofía");
		Persona pedro = new Persona("Pedro");
		Nota n1 = new Nota(8);
		Nota n2 = new Nota(5);
		notas.put(carla, n2);
		notas.put(pedro, n1);
		notas.put(sofia, n1);
		System.out.println(f.calculaNotaMedia(notas));
		List<Persona> getAlumnoEncimaMedia = f.getAlumnosPorEncimaNota(f.calculaNotaMedia(notas), notas);
		System.out.println(getAlumnoEncimaMedia);
	}
	public float calculaNotaMedia(Map<Persona,Nota> notas) {
		float media = 0;
		Collection<Nota> nota = notas.values();
		for (Nota f : nota) {
			media = (float) (media + f.getNota());
		}
		media = media / notas.size();
		return media;
	}
	
	List<Persona> getAlumnosPorEncimaNota (float nota,Map <Persona,Nota> notas) {
		Set<Map.Entry <Persona, Nota>> alumnos = notas.entrySet();
		List<Persona> alumnos1 = new ArrayList<Persona>();
		Entry <Persona, Nota> elemento;
        Iterator<Entry<Persona, Nota>> it = alumnos.iterator();
		while(it.hasNext())
		{
			elemento = (Entry<Persona, Nota>) it.next();
			if (elemento.getValue().getNota() > nota) {
				alumnos1.add(elemento.getKey());
			}
	}
		return alumnos1;

}}
