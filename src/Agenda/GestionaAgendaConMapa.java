package Agenda;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GestionaAgendaConMapa {
	public static void main(String[] args) {
	Contacto c1 = new Contacto("Pepe","Arez","12345678");
	Contacto c2 = new Contacto("Pepa","Berez","88345678");
	Contacto c3 = new Contacto("Pepo","Cerez","72345678");
	AgendaMapa a = new AgendaMapa();
	//Map<String,Contacto>() agenda = a.getAgenda();
	
	a.getAgenda().put("12345678", c1);
	a.getAgenda().put("88345678", c2);
	a.getAgenda().put("72345678", c3);
	a.getAgenda().put("72345678", c1);
	a.getAgenda().put("88345678", c2);
	System.out.println(a.getAgenda().size());
	System.out.println(a.getAgenda().keySet());
	System.out.println(a.getAgenda().toString());
	System.out.println(a.getAgenda().values());
	
	Set<Map.Entry <String,Contacto>> entradas = a.getAgenda().entrySet();
	Iterator it = entradas.iterator();
	Entry <String,Contacto> elemento;
	
	while (it.hasNext()) {
		elemento = (Entry<String, Contacto>) it.next();
		System.out.println(elemento.getKey());
		System.out.println(elemento.getValue());
	}

}
}
