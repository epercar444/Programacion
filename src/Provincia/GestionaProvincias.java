package Provincia;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GestionaProvincias {

	public static void main(String[] args) {
		List <Provincia> poblacion = new ArrayList <Provincia>();
		Provincia p1 = new Provincia(12000,"Sevilla");
		Provincia p2 = new Provincia(16000,"Granada");
		ListaProvincia provincias = new ListaProvincia(poblacion);
		try {
			provincias.addProvincia(p1);
			provincias.addProvincia(p2);
			provincias.addProvincia(p1);
		}
		catch (ProvinciaExcepcion e) {
			System.out.println(e.getMessage());
		}
		Set <Provincia> poblacion1 = new HashSet <Provincia>();
		System.out.println(poblacion1.add(p1));
		System.out.println(poblacion1.add(p2));
		System.out.println(poblacion1.add(p2));
		
		for (Provincia cadena:poblacion1) {
			System.out.println(cadena);
		}
	}
	

}
