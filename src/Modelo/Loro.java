package Modelo;

public class Loro extends Aves{
	private String origen;
	private boolean habla;
	
	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public boolean isHabla() {
		return habla;
	}


	public void setHabla(boolean habla) {
		this.habla = habla;
	}


	@Override
	public boolean volar() {
		// TODO Auto-generated method stub
		return false;
	}
	

	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		return "Loro [origen=" + origen + ", habla=" + habla + "]";
	}

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean saluda () {
		boolean saluda = false;
		if (habla) {
			saluda = true;
		}
		return saluda;
	}

}
