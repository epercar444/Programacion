package orentacionAobjetos;

public class Gato {
	String color;
	String raza;
	String sexo;
	int edad;
	float peso;
	
	public void maullar() {
		System.out.println("Miauuuuuuu"); 
	}
	public void comer   (String comida) {
		if (comida.equals("pescado")) {
			System.out.println("Yummy yummy");
		}
		else {
			System.out.println("Buahhh, mejor no");
		}
	}
	public void ronronear () {
		System.out.println("rrrrrr");
	}
	public void pelear (Gato a1) {
		boolean  pelean = sexo.equals(a1.sexo);
		if (pelean) {
			System.out.println("Ven aquí que te vas a enterar");
		}
		else {
			System.out.println("La violencia nunca es la solución"); 
		}
	}
	String pasaAcadena() {
		String cadena = "El gato de color" + color + "tiene un peso de" + peso + "tiene" + edad + "años, su raza es" + raza + "y es" + sexo;
		return cadena;
 	}
}
