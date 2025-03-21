package Simulacro2;

public class Nadador extends Deportista{

	protected Nadador(String nombre, String pais, double peso, double altura, int edad, Prueba[] pruebas) {
		super(nombre, pais, peso, altura, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void competir() {
		System.out.println("El nadador nada");
		System.out.println("Su modalidad es nadar");
		
	}

	@Override
	public int getTiempoPrueba() {
		return 2;
	}

	@Override
	public int getTiempoCalentamiento() {
		return 2;
	}

	@Override
	public int getCaloriasNecesarias() {
		int suma = 0;
		for (int i = 0; i == (int) getPeso(); i++) {
			suma = i*100;
		}
		return suma;
	}

}
