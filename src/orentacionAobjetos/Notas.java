package orentacionAobjetos;

public class Notas {
	String nombre;
	int primertrimestre;
	int segundotrimestre;
	int tercertrimestre;
	
	public Notas(String nombre, int primertrimestre, int segundotrimestre, int tercertrimestre) {
		super();
		this.nombre = nombre;
		this.primertrimestre = primertrimestre;
		this.segundotrimestre = segundotrimestre;
		this.tercertrimestre = tercertrimestre;
	}
	public float calculaMedia () {
		float media = primertrimestre + segundotrimestre + tercertrimestre;
		media = media / 3;
		return media;
	}
	int trimestresAprobados() {
		int contador = 0;
		if (primertrimestre > 5) {
			contador += 1;
		}
		else if (segundotrimestre > 5) {
			contador += 1;
		}
		else if (tercertrimestre > 5) {
			contador += 1;
		}
		return contador;
	}
	public String toString() {
		return "Notas [nombre=" + nombre + ", primertrimestre=" + primertrimestre + ", segundotrimestre="
				+ segundotrimestre + ", tercertrimestre=" + tercertrimestre + "]";
	}
	
}
