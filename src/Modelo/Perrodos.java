package Modelo;

public class Perrodos extends Mascotas{
	private String raza;
	private boolean pulgas;
	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		return "Perro [raza=" + raza + ", pulgas=" + pulgas + "]";
	}
	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

}

