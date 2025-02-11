package orentacionAobjetos;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {
	private LocalDate fechaFinContrato;

	protected LocalDate getFechaFinContrato() {
		return fechaFinContrato;
	}

	protected void setFechaFinContrato(LocalDate fechaFinContrato) {
		this.fechaFinContrato = fechaFinContrato;
	}

	public ProfesorInterino(String nombre, String nombredepartamento, LocalDate fechaFinContrato) {
		super(nombre, nombredepartamento);
		this.fechaFinContrato = fechaFinContrato;
	}

	@Override
	public String toString() {
		return "ProfesorInterino [fechaFinContrato=" + fechaFinContrato + ", getFechaFinContrato()="
				+ getFechaFinContrato() + ", getNombredepartamento()=" + getNombredepartamento() + ", getNombre()="
				+ getNombre() + "]";
	}
	
}
