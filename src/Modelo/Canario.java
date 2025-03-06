package Modelo;

public class Canario extends Aves{
	private String color;
	private boolean canta;
	@Override
	public boolean volar() {
		// TODO Auto-generated method stub
		return true;
	}
	

	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		return "Canario [color=" + color + ", canta=" + canta + "]";
	}

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

}