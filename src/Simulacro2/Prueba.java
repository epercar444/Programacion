package Simulacro2;

import java.time.LocalDate;
import java.util.Objects;

public class Prueba {
	private String identificador,lugar;
	private LocalDate fecha;
	private EstadoPrueba estado;
	@Override
	public int hashCode() {
		return Objects.hash(identificador);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prueba other = (Prueba) obj;
		return Objects.equals(identificador, other.identificador);
	}
	protected Prueba(String identificador, String lugar, LocalDate fecha, EstadoPrueba estado) {
		super();
		this.identificador = identificador;
		this.lugar = lugar;
		this.fecha = fecha;
		this.estado = estado;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public EstadoPrueba getEstado() {
		return estado;
	}
	public void setEstado(EstadoPrueba estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Prueba [identificador=" + identificador + ", lugar=" + lugar + ", fecha=" + fecha + ", estado=" + estado
				+ "]";
	}
	
	
}
