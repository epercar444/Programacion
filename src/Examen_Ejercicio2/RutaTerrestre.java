package Examen_Ejercicio2;

public class RutaTerrestre extends RutaBase{
	private boolean siesCarretera;
	private static double costecienKms = 0.65;
	public RutaTerrestre(int id, Ciudad ciudadOrigen, Ciudad ciudadDestino, double distanciaKm,boolean siesCarretera) {
		super(id, ciudadOrigen, ciudadDestino, distanciaKm);
		this.siesCarretera = siesCarretera;
	}

	@Override
	public double getCoste() {
		return getDistanciaKm() * costecienKms;
	}

	@Override
	public String getTipoRuta() {
		String cadena = "";
		if (siesCarretera) {
			cadena = "(RutaTerrestre)-carretera";
		}
		else {
			cadena = "(RutaTerrestre)-tren";
		}
		return cadena;
	}

}
