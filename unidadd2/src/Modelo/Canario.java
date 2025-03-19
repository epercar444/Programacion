package Modelo;

public class Canario extends Aves{
	private String color;
	private boolean canta;
	@Override
	public boolean Volar() {
		// TODO Auto-generated method stub
		return true;
	}
	

	@Override
	public String Muestra() {
		// TODO Auto-generated method stub
		return "Canario [color=" + color + ", canta=" + canta + "]";
	}

	@Override
	public boolean Habla() {
		// TODO Auto-generated method stub
		return false;
	}

}
