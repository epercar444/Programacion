package orentacionAobjetos;

public class GestionaGatito {

	public static void main(String[] args) {
		Gato gato1 = new Gato ();
		gato1.color = "naranja";
		gato1.edad = 3;
		gato1.peso = (float) 5.2;
		gato1.raza = "exótico";
		gato1.sexo = "hembra";
		Gato gato2 = new Gato ();
		gato2.color = "negro";
		gato2.edad = 5;
		gato2.peso = (float) 3.5;
		gato2.raza = "siamés";
		gato2.sexo = "hembra";
		Gato gato3 = new Gato ();
		gato3.color = "blanco";
		gato3.edad = 1;
		gato3.peso = (float) 3;
		gato3.raza = "burmés";
		gato3.sexo = "macho";
		gato1.maullar();
		gato1.comer("pienso");
		gato2.ronronear();
		gato2.comer("pescado");
		gato1.pelear(gato2);
		gato2.pelear(gato3);
		String cadena = gato1.pasaAcadena();
		System.out.println(cadena);

	}

}
