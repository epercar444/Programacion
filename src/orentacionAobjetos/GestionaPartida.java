package orentacionAobjetos;

public class GestionaPartida {

	public static void main(String[] args) {
		Jugador p1 = new Jugador ("gorriondegerena","Manuel",20,36.7F);
		Jugador p2 = new Jugador ("gerenadapena","JC",75,54.5F);
		Jugador p3 = new Jugador ("eldegerena","Juan Carlos",12,28.5F);
		Jugador p4 = new Jugador ("generense","Jose Carlos",48,26.14F);
		Jugador [] participantes1 = {p1,p2,p3,p4};
		Jugador p5 = new Jugador ("betis","Sonia",26,54.5F);
		Jugador p6 = new Jugador ("sevilla","Marco",35,36.2F);
		Jugador p7 = new Jugador ("almería","Juan",18,63.4F);
		Jugador p8 = new Jugador ("córdoba","Carla",54,24.8F);
		Jugador [] participantes2 = {p5,p6,p7,p8};
		Jugador p9 = new Jugador ("violeta","Violeta",23,78.9F);
		Jugador p10 = new Jugador ("azul","Leo",41,15.6F);
		Jugador p11 = new Jugador ("amarillo","Beatriz",58,31F);
		Jugador p12 = new Jugador ("naranja","Miriam",14,36.25F);
		Jugador [] participantes3 = {p9,p10,p11,p12};
		Partida partida1 = new Partida("Catán", participantes1);
		Partida partida2 = new Partida("Dixit", participantes2);
		Partida partida3 = new Partida("Carcassone", participantes3);
		partida1.ImprimeGanador();
		partida2.ImprimeGanador();
		partida3.ImprimeGanador();
		System.out.println(partida1.getNombre());
		System.out.println(partida1.getGanador());
		System.out.println(partida1.toString());
	}

}
