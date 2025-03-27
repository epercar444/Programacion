package Modelo;

import java.time.LocalDate;

public class Patinete extends VehiculoGeneral{
	private int tiempo_autonomia;
	private String marca,modelo;
	private float fianza;
	private boolean fianza_abonada;
	public Patinete(int id, Alquiler[] alquileres, boolean estaDisponible,float fianza,boolean fianza_abonada,String marca,String modelo,int tiempo_autonomia) {
		super(id, alquileres, estaDisponible);
		this.fianza = fianza;
		this.fianza_abonada = fianza_abonada;
		this.marca = marca;
		this.modelo = modelo;
		this.tiempo_autonomia = tiempo_autonomia;
	}

	@Override
	public boolean estaAlquilado() {
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

	@Override
	public boolean estaAlquiladoenFechaDeterminada() {
		if ()
		return false;
	}

}
