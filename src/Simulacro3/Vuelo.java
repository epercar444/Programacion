package Simulacro3;

import java.time.LocalDate;
import java.util.Objects;

public class Vuelo {
	private int id;
	private String aerolinea, destino;
	private LocalDate fechavuelo;
	private double duracion;
	private EstadoVuelo estado;
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
		Vuelo other = (Vuelo) obj;
		return id == other.id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public LocalDate getFechavuelo() {
		return fechavuelo;
	}
	public void setFechavuelo(LocalDate fechavuelo) {
		this.fechavuelo = fechavuelo;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public EstadoVuelo getEstado() {
		return estado;
	}
	public void setEstado(EstadoVuelo estado) {
			this.estado = estado;
		}
	protected Vuelo(int id, String aerolinea, String destino, LocalDate fechavuelo, double duracion,
			EstadoVuelo estado) {
		super();
		this.id = id;
		this.aerolinea = aerolinea;
		this.destino = destino;
		this.fechavuelo = fechavuelo;
		this.duracion = duracion;
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Vuelo [id=" + id + ", aerolinea=" + aerolinea + ", destino=" + destino + ", fechavuelo=" + fechavuelo
				+ ", duracion=" + duracion + ", estado=" + estado + "]";
	}
	
}
