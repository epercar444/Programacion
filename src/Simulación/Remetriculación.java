package Simulación;

import java.time.LocalDate;
import java.util.Objects;

public class Remetriculación {
	private String numbas,maInicial,maFinal;
	private LocalDate fechaMatriculacion;
	public String getNumbas() {
		return numbas;
	}
	public void setNumbas(String numbas) {
		this.numbas = numbas;
	}
	public String getMaInicial() {
		return maInicial;
	}
	public void setMaInicial(String maInicial) {
		this.maInicial = maInicial;
	}
	public String getMaFinal() {
		return maFinal;
	}
	public void setMaFinal(String maFinal) {
		this.maFinal = maFinal;
	}
	public LocalDate getFechaMatriculacion() {
		return fechaMatriculacion;
	}
	public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(fechaMatriculacion, numbas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Remetriculación other = (Remetriculación) obj;
		return Objects.equals(fechaMatriculacion, other.fechaMatriculacion) && Objects.equals(numbas, other.numbas);
	}
	@Override
	public String toString() {
		return "Remetriculación [numbas=" + numbas + ", maInicial=" + maInicial + ", maFinal=" + maFinal
				+ ", fechaMatriculacion=" + fechaMatriculacion + "]";
	}
	public Remetriculación(String numbas, String maInicial, String maFinal, LocalDate fechaMatriculacion) {
		super();
		this.numbas = numbas;
		this.maInicial = maInicial;
		this.maFinal = maFinal;
		this.fechaMatriculacion = fechaMatriculacion;
	}
	
	
	
}
