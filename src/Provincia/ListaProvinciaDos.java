package Provincia;

import java.util.HashSet;
import java.util.Set;

public class ListaProvinciaDos {
	Set <Provincia> poblacion;

	public Set<Provincia> getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(Set<Provincia> poblacion) {
		this.poblacion = poblacion;
	}

	protected ListaProvinciaDos(Set<Provincia> poblacion) {
		super();
		this.poblacion = new HashSet <Provincia>();
	}
	
}
