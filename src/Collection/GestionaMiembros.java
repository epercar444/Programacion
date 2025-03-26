package Collection;

import Examen_Ejercicio1.GuzmanitosExcepcion;
import Examen_Ejercicio1.MiembroBase;
import Examen_Ejercicio1.MiembroEstandar;
import Examen_Ejercicio1.MiembroPremium;
import Examen_Ejercicio1.TipoPremium;

public class GestionaMiembros {

	public static void main(String[] args) {
		MiembroBase [] amigose= new MiembroBase[2];
		MiembroBase [] amigosp= new MiembroBase[3];
		MiembroBase e1 = new MiembroEstandar("Pepe","pepe@gmail.com");
		MiembroBase e2 = new MiembroEstandar("Pepa","pepa@gmail.com");
		MiembroBase e3 = new MiembroEstandar("Pepo","pepo@gmail.com");
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		MiembroBase p1 = new MiembroPremium ("Pepito","pepito@gmail.com",TipoPremium.PREMIUM);
		MiembroBase p2 = new MiembroPremium ("Pepita","pepita@gmail.com",TipoPremium.PREMIUM_VIP);
		MiembroBase p3 = new MiembroPremium ("Pepote","pepote@gmail.com",TipoPremium.PREMIUM_VIP);
		MiembroBase p4 = new MiembroPremium ("Pepete","pepete@gmail.com",TipoPremium.PREMIUM_VIP);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		e1.setAmigos(amigose);
		amigose[0] = e2;
		p1.setAmigos(amigosp);
		amigosp[0] = p2;
		amigosp[1] = p3;
		System.out.println(p1.isAmigo(p3));
		System.out.println(p1.isAmigo(p4));
		amigosp[2] = p2;
		try {
			e1.addAmigo(e2);
		} catch (GuzmanitosExcepcion e) {
			e.getMessage();
		}
		
	}

	}


