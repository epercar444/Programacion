package Modelo;

import java.time.LocalDate;

public class Sensores extends DispositivosWIFI{
	private float tempratura;
	

	public Sensores(int id, int mAC, Estado2 estado, LocalDate fecha_actu, float tempratura) {
		super(id, mAC, estado, fecha_actu);
		this.tempratura = tempratura;
	}

	public float getTempratura() {
		return tempratura;
	}

	public void setTempratura(float tempratura) {
		this.tempratura = tempratura;
	}

	@Override
	public void conectarInternet() {
		System.out.println("Se conecta mediante WPA");
		
	}

	@Override
	public boolean pendienteActualizacion() {
		boolean actualiza = false;
		if (3 - getFecha_actu().getMonthValue() <= 0) {
			actualiza = true;
		}
		return actualiza;
	}

}