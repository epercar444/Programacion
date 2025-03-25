package Examen_Ejercicio2;

public class GestionaRutas {

	public static void main(String[] args) {
		Ciudad c1 = new Ciudad ("La Algaba", 16000);
		Ciudad c2 = new Ciudad ("Burguillos", 10000);
		Ciudad c3 = new Ciudad ("La Rinconada", 25000);
		Ciudad c4 = new Ciudad ("Alcalá de Río", 18000);
		Ciudad c5 = new Ciudad ("Gerena", 12000);
		Ciudad c6 = new Ciudad ("Guillena", 14000);
		
		
		RutaBase r1 = new RutaTerrestre(0, c1, c2, 20, true);
		RutaBase r2 = new RutaAerea(1, c2, c3, 10, TipoVuelo.LOW_COST);
		RutaBase r3 = new RutaAerea(1, c3, c4, 200, TipoVuelo.NORMAL);
		RutaBase r4 = new RutaAerea(1, c4, c5, 100, TipoVuelo.EXPRESS);
		
		System.out.println(r1.getCoste());
		System.out.println(r1.getTipoRuta());
		System.out.println(r2.getCoste());
		System.out.println(r2.getTipoRuta());
		System.out.println(r3.getCoste());
		System.out.println(r3.getTipoRuta());
		System.out.println(r4.getCoste());
		System.out.println(r4.getTipoRuta());

		RutaBase[] rutasEmpresa = new RutaBase[50];
		rutasEmpresa[0] = r1;
		rutasEmpresa[1] = r2;
		rutasEmpresa[2] = r3;
		rutasEmpresa[3] = r4;
		for (int i = 0; i < rutasEmpresa.length; i++) {
			if (rutasEmpresa[i] != null) {
				System.out.println(i);
			}
		}
		GestionaRutas f = new GestionaRutas();
		System.out.println(f.estanConectadas(rutasEmpresa, "La Algaba", "Burguillos"));
	}
		public boolean estanConectadas (RutaBase[] rutasEmpresa, String ciudadOrigen, String ciudadDestino) {
			boolean conectadas = false;
			for (int i = 0; i < rutasEmpresa.length; i++) {
				if (rutasEmpresa[i] != null && rutasEmpresa[i].getCiudadOrigen().equals(ciudadOrigen) && rutasEmpresa[i].getCiudadDestino().equals(ciudadDestino)) {
					conectadas = true;
				}
			}
			return conectadas;
	}

}
