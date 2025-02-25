package herencia;

import java.time.LocalDate;

public class GestionaIncidenciasEquipo {

	public static void main(String[] args) {
		Equipo e1 = new Equipo ("PrimeroDAM","55555W","Linux",0);
		Incidencia i1 = new Incidencia (e1,Criticidad.GRAVE,123456789F,"Tres",Estado.ANALIZADA,LocalDate.of(2024, 10, 10),LocalDate.of(2024, 12, 10));
		System.out.println(i1.getFechacerro());
		i1.esUrgente();
	}

}
