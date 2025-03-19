package Modelo;

public class Loro extends Aves{
	private String origen;
	private boolean habla;
	@Override
	public boolean Volar() {
		// TODO Auto-generated method stub
		return false;
	}
	

	@Override
	public String Muestra() {
		// TODO Auto-generated method stub
		return "Loro [origen=" + origen + ", habla=" + habla + "]";
	}

	@Override
	public boolean Habla() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean Saluda () {
		boolean saluda = false;
		if (habla) {
			saluda = true;
		}
		return saluda;
	}

}
