package Modelo;

public class Coche extends VehiculoCombustible{

	public Coche(int id, Alquiler[] alquileres, boolean estaDisponible, String matricula, boolean es_diesel,
			String marca, String modelo) {
		super(id, alquileres, estaDisponible, matricula, es_diesel, marca, modelo);
		// TODO Auto-generated constructor stub
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
