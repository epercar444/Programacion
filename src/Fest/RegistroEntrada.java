package Fest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;


public class RegistroEntrada {
	Set <Influencer> influencers = new TreeSet <Influencer>();
	List<entradaVIP> entradas1 = new ArrayList<entradaVIP>();//?
	Map <Influencer, entradaVIP> entradas = new HashMap<>();
	public void añadirEntrada(entradaVIP e,Influencer f) {
		entradas.put(f, e);
		System.out.println("Entrada  añadida");
		entradas1.add(e);
		influencers.add(f);
	}
	public String buscarEn (Influencer f) {
		if (entradas.containsValue(f.getNick()) && entradas.containsValue(f.getPlataforma())) {
			return f.toString();
		}
		else {
			return null;
		}
	}
	public void confirmar (Influencer f, entradaVIP e) {
		if (entradas.containsValue(f.getNick()) && entradas.containsValue(f.getPlataforma())) {
			e.setEstado(EstadoEntrada.CONFIRMADA);
			System.out.println("Entrada confirmada: " + e.getEstado());
		}
	}
	public void cancelar (Influencer f, entradaVIP e) {
		if (entradas.containsValue(f.getNick()) && entradas.containsValue(f.getPlataforma())) {
			e.setEstado(EstadoEntrada.CANCELADA);
			System.out.println("Entrada cancelada: " + e.getEstado());
		}
	}
	public void listaConfirmados () {
		List<entradaVIP> entradas1 = new ArrayList<entradaVIP>();//?
		/*Set<Entry<Influencer, entradaVIP>> entra = entradas.entrySet();
		Entry <String, Double> elemento;
		Iterator it = entra.iterator();
		while(it.hasNext()) {
			// elemento = (Entry<String, Double>) it.next();
			if (entradas.)*/
		for (entradaVIP f: entradas1) {
			if (f.getEstado().equals(EstadoEntrada.CONFIRMADA)) {
				entradas1.add(f);
			}
		if (entradas.containsValue(entradas1)) {
			entradas.keySet();
		}
		}
		}
	}

