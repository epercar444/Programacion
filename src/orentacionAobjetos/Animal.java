package orentacionAobjetos;

public class Animal {
	String tipo;
	private int edad;
	public String nombre;
	
	public boolean caminar () {
		return true;
	}
	public void darDecomer () {
		if (tipo=="perro") {
			comer();
		}
		else {
			System.out.println("El animal no come");
		}
	}
	private void comer () {
		System.out.println("Estoy comiendo");
	}
	boolean sondelMismoTipo (Animal a1,Animal a2) {
		boolean son = false;
		son = tipo.equals(a1.tipo) && tipo.equals(a2.tipo);
		return son;
	}
	
}

