package Modelo;

public class Gato  extends Mascotas{
	private String color;
	private boolean peloLargo;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPeloLargo() {
		return peloLargo;
	}

	public void setPeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}

	@Override
	public String Muestra() {
		// TODO Auto-generated method stub
		return "Gato [color=" + color + ", peloLargo=" + peloLargo + "]";;
	}
	
	@Override
	public boolean Habla() {
		// TODO Auto-generated method stub
		return false;
	}
}
