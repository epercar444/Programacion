package Modelo;

public class Perro extends Mascotas{
	private String raza;
	private boolean pulgas;
	@Override
	public String Muestra() {
		// TODO Auto-generated method stub
		return "Perro [raza=" + raza + ", pulgas=" + pulgas + "]";;
	}
	@Override
	public boolean Habla() {
		// TODO Auto-generated method stub
		return false;
	}

}
