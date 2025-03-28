package Provincia;

import java.util.ArrayList;
import java.util.List;

public class ListaProvincia {
	List <Provincia> poblacion;

	public ListaProvincia(List<Provincia> poblacion) {
		super();
		this.poblacion = new ArrayList <Provincia>();
	}
	public List<Provincia> getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(List<Provincia> poblacion) {
		this.poblacion = poblacion;
	}

	public void addProvincia (Provincia p) throws ProvinciaExcepcion {
		if (poblacion.contains(p)) {
			throw new ProvinciaExcepcion ("La provincia " + p.getNombre() + " ya ha sido añadida anteriormente a esta lista");
		}
		else {
			poblacion.add(p);
			System.out.println("Provincia añadida correctamente");
		}
		
	}
	
}
