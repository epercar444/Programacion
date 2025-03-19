package Modelo;

public abstract class VehiculoGeneral implements IAlquilable{
	private int id;
	private Alquiler[] alquileres;
	private boolean estaDisponible;
	public VehiculoGeneral(int id, Alquiler[] alquileres, boolean estaDisponible) {
		super();
		this.id = id;
		this.alquileres = alquileres;
		this.estaDisponible = estaDisponible;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Alquiler[] getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(Alquiler[] alquileres) {
		this.alquileres = alquileres;
	}

	public boolean isEstaDisponible() {
		return estaDisponible;
	}

	public void setEstaDisponible(boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}

	public abstract float getImporteTotalGenerado();
}
