package Modelo;

public class Audios extends ElementosMultimedia{


	public Audios(int id, String ubicacion, String genero, String nombre, int duracionMinutos) {
		super(id, ubicacion, genero, nombre);
		this.duracionMinutos = duracionMinutos;
	}

	private int duracionMinutos;
	


	public int getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}

	@Override
	public boolean estaDisponible() {
		return true;
	}

	@Override
	public int getDevuelveDiasPrestamo() {
		return 10;
	}
}
