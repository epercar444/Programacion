package Modelo;

import java.time.LocalDate;

public class PuertaAutomatica extends DispositivosWIFI{

	public PuertaAutomatica(int id, int mAC, Estado2 estado, LocalDate fecha_actu) {
		super(id, mAC, estado, fecha_actu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void conectarInternet() {
		System.out.println("Se conecta mediante WPA2");		
	}

	@Override
	public boolean pendienteActualizacion() {
		boolean actualiza = false;
		if (1 - getFecha_actu().getMonthValue() <= 0) {
			actualiza = true;
		}
		return actualiza;
	}

}
