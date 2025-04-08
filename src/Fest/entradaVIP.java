package Fest;

import java.time.LocalDate;

public class entradaVIP {
	
	private int codentrada;
	private TipoEntrada tipo;
	private LocalDate fecha;
	private EstadoEntrada estado;
	public int getCodentrada() {
		return codentrada;
	}
	public void setCodentrada(int codentrada) {
		this.codentrada = codentrada;
	}
	public TipoEntrada getTipo() {
		return tipo;
	}
	public void setTipo(TipoEntrada tipo) {
		this.tipo = tipo;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public EstadoEntrada getEstado() {
		return estado;
	}
	public void setEstado(EstadoEntrada estado) {
		this.estado = estado.ENVIADA;
	}
	public entradaVIP(int codentrada, TipoEntrada tipo, LocalDate fecha, EstadoEntrada estado) {
		super();
		this.codentrada = codentrada;
		this.tipo = tipo;
		this.fecha = fecha;
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "entradaVIP [codentrada=" + codentrada + ", tipo=" + tipo + ", fecha=" + fecha + ", estado=" + estado
				+ "]";
	}
	
	
	
}
