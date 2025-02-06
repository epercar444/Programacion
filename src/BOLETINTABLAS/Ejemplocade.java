package BOLETINTABLAS;

public class Ejemplocade {

	public static void main(String[] args) {
		String cadena = "Hello planet earth, a great planet.";
		String cadena1 = cadena.replace("a", "A");
		String cadena2 = cadena.replaceAll("a", "A");
		System.out.println(cadena1);
		System.out.println(cadena2);
		String cadena3 = "Hello planet earth, a great planet.";
		String cadena4 = cadena.replace("et", "ET");
		Ejemplocade f = new Ejemplocade();
		System.out.println(cadena3);
		System.out.println(cadena4);
		int [] tabla1 = {4,5,6,7};
		int [] tabla2 = {4,5,6,8};
		System.out.println(f.comparaTablas (tabla1,tabla2));
	}
	boolean comparaTablas (int[] tabla1,int []tabla2) {
		boolean soniguales = true;
		if (tabla1.length != tabla2.length) {
			soniguales = false;
		}
		else {
			for (int i = 0; i < tabla1.length;i++) {
				if (tabla1[i] != tabla2[i]) {
					soniguales = false;
				}
			}
		}
		return soniguales;
		
}}