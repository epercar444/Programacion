package Modelo;

public class Peliculas extends ElementosMultimedia{
	private int duracionMinutos;
	public Peliculas(int id, String ubicacion, String genero, String nombre, int duracionMinutos) {
		super(id, ubicacion, genero, nombre);
		this.duracionMinutos = duracionMinutos;
	}


	public int getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}
	@Override
	public boolean estaDisponible() {
		return false;
	}

	@Override
	public int getDevuelveDiasPrestamo() {
		return 10;
	}

}
