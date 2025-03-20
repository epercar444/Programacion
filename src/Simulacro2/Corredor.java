package Simulacro2;

public class Corredor extends Deportista{

	protected Corredor(String nombre, String pais, double peso, double altura, int edad, Prueba[] pruebas) {
		super(nombre, pais, peso, altura, edad, pruebas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void competir() {
		System.out.println("El corredor corre");
		System.out.println("Su modalidad es correr");
		
	}

	@Override
	public int getTiempoPrueba() {
		return 10;
	}

	@Override
	public int getTiempoCalentamiento() {
		return 30/60;
	}

	@Override
	public int getCaloriasNecesarias() {
		// TODO Auto-generated method stub
		return 0;
	}

}
