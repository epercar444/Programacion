package Agenda;

import java.util.Set;
import java.util.TreeSet;

public class Agenda {
	private Set<Contacto> contactos;

	public Set<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(Set<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Agenda(Set<Contacto> contactos) {
		super();
		this.contactos = new TreeSet<Contacto>();
	}

	@Override
	public String toString() {
		return "Agenda [contactos=" + contactos + "]";
	}
	
}
