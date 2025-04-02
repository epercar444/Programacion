package Collection;

import java.util.ArrayList;
import java.util.List;

import Examen_Ejercicio1.GuzmanitosExcepcion;
import Examen_Ejercicio1.MiembroEstandar;

public class GestionaListas {
	public static void main(String[] args) throws GuzmanitosExcepcion {
		List <MiembroBase2> amigos = new ArrayList <MiembroBase2> ();
		MiembroBase2 e1 = new MiembroEstandar("Pepe","pepe@gmail.com");
		MiembroBase2 e2 = new MiembroEstandar("Pepa","pepa@gmail.com");
		MiembroBase2 e3 = new MiembroEstandar("Pepo","pepo@gmail.com");
		try {
			e1.addAmigo(e2);
			e1.addAmigo(e3);
			e1.addAmigo(e2);
		} catch (GuzmanitosExcepcion e) {
			System.out.println(e.getMessage());
			//throw new GuzmanitosExcepcion ("Excepción de Eva");
		}
		for (MiembroBase2 m: e1.getAmigos()) {
			System.out.println(m);
		}  
	}
	

}
