package orentacionAobjetos;

public class GestionaEquipo {

	public static void main(String[] args) {
		Persona p1 = new Persona ("Andrea","Perea","12345678c",25);
		Persona p2 = new Persona ("Carlos","Torres","89123456p",32);
		Persona p3 = new Persona ("María","Álvarez","67891234r",35);
		Persona p4 = new Persona ("Sebastián","López","34567891f",28);
		Persona [] personas1 = {p1,p2};
		Persona [] personas2 = {p3,p4};
		int [] puntuaciones1 = {7,14,2,6,8};
		int [] puntuaciones2 = {8,6,12,5,8};
		Equipo e1 = new Equipo("equipo1", puntuaciones1, personas1);
		Equipo e2 = new Equipo("equipo2", puntuaciones2, personas2);
		System.out.println(e1);
		Persona [] tablaPersonas = e1.personas;
		for (int i = 0; i < tablaPersonas.length;i++) {
			Persona p = tablaPersonas[i];
			System.out.println(p.dni);
		}
		System.out.println(e1.CalculaMediaEdad());
	}

}
