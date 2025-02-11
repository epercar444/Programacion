package orentacionAobjetos;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor{
	private LocalDate fechaAdjudicacion;

	protected LocalDate getFechaAdjudicacion() {
		return fechaAdjudicacion;
	}

	protected void setFechaAdjudicacion(LocalDate fechaAdjudicacion) {
		this.fechaAdjudicacion = fechaAdjudicacion;
	}

	public ProfesorTitular(String nombre, String nombredepartamento, LocalDate fechaAdjudicacion) {
		super(nombre, nombredepartamento);
		this.fechaAdjudicacion = fechaAdjudicacion;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [fechaAdjudicacion=" + fechaAdjudicacion + ", getFechaAdjudicacion()="
				+ getFechaAdjudicacion() + ", getNombredepartamento()=" + getNombredepartamento() + ", getNombre()="
				+ getNombre() + "]";
	}
	
}
