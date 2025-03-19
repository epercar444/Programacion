package Modelo;

public class Furgoneta  extends VehiculoCombustible{
	private int numplazas;
	private float pma;
	

	public int getNumplazas() {
		return numplazas;
	}

	public void setNumplazas(int numplazas) {
		this.numplazas = numplazas;
	}

	public float getPma() {
		return pma;
	}

	public void setPma(float pma) {
		this.pma = pma;
	}

	public Furgoneta(int id, Alquiler[] alquileres, boolean estaDisponible, String matricula, boolean es_diesel,
			String marca, String modelo, int numplazas,float pma) {
		super(id, alquileres, estaDisponible, matricula, es_diesel, marca, modelo);
		this.numplazas = numplazas;
		this.pma = pma;
	}

	@Override
	public boolean estaAlquilado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean estaAlquiladoenFechaDeterminada() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float getPrecioporDia() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getImporteTotalGenerado() {
		// TODO Auto-generated method stub
		return 0;
	}

}
