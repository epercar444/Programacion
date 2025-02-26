package Controlador;

import Modelo.ConversionInversa;
import Modelo.Conversor;

public class GestionaCambios {

	public static void main(String[] args) {
		Conversor e1 = new Conversor (12F);
		Conversor e2 = new Conversor (50F);
		
		ConversionInversa d1 = new ConversionInversa (12F);
		ConversionInversa d2 = new ConversionInversa (50F);
		
		e1.convertirEurosADolares(e1);
		e2.convertirEurosADolares(e2);
		d1.convertirEurosADolares(d1);
		d2.convertirEurosADolares(d2);

	}

}
