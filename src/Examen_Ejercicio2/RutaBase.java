package Examen_Ejercicio2;

import java.util.Objects;

public abstract class RutaBase implements IRuta{
	private int id;
	private Ciudad ciudadOrigen,ciudadDestino;
	private double distanciaKm;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Ciudad getCiudadOrigen() {
		return ciudadOrigen;
	}
	public void setCiudadOrigen(Ciudad ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}
	public Ciudad getCiudadDestino() {
		return ciudadDestino;
	}
	public void setCiudadDestino(Ciudad ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}
	public double getDistanciaKm() {
		return distanciaKm;
	}
	public void setDistanciaKm(double distanciaKm) {
		this.distanciaKm = distanciaKm;
	}
	public RutaBase(int id, Ciudad ciudadOrigen, Ciudad ciudadDestino, double distanciaKm) {
		super();
		this.id = id;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.distanciaKm = distanciaKm;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RutaBase other = (RutaBase) obj;
		return id == other.id;
	}
	
}
