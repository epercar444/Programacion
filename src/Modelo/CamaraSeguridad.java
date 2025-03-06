package Modelo;

import java.time.LocalDate;

public class CamaraSeguridad extends DispositivosWIFI{

	public CamaraSeguridad(int id, int mAC, Estado2 estado, LocalDate fecha_actu) {
		super(id, mAC, estado, fecha_actu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void conectarInternet() {
		System.out.println("Se conecta mediante WPA3");		
	}

	@Override
	public boolean pendienteActualizacion() {
		boolean actualiza = false;
		if (14 - getFecha_actu().getDayOfMonth() <= 0) {
			actualiza = true;
		}
		return actualiza;
	}

}