package Examen_Ejercicio2;

public class RutaAerea extends RutaBase{
	private TipoVuelo tipovuelo;
	public RutaAerea(int id, Ciudad ciudadOrigen, Ciudad ciudadDestino, double distanciaKm, TipoVuelo tipovuelo) {
		super(id, ciudadOrigen, ciudadDestino, distanciaKm);
		this.tipovuelo = tipovuelo;
	}

	@Override
	public double getCoste() {
		double coste = 0;
		if (tipovuelo.equals(tipovuelo.LOW_COST)) {
			coste = getDistanciaKm() * 0.75;
		}
		else if (tipovuelo.equals(tipovuelo.NORMAL)) {
			coste = getDistanciaKm() * 1.1;
		}
		else {
			coste = getDistanciaKm() * 1.5;
		}
		return coste;
	}

	@Override
	public String getTipoRuta() {
		return "RutaAerea " + tipovuelo;
	}

}
