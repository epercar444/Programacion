package orentacionAobjetos;

public class GestionaCoches {

	public static void main(String[] args) {
		Coches coche1 = new Coches ("BWM","Serie 3",2018,"Gasolina",120,50,60);
		Coches coche2 = new Coches ("Range Rover","Evoque 4x4",2021,"Diésel",100,80,50);
		System.out.println(coche1.toString());
		System.out.println(coche2.toString());
		float consumo1 = coche1.calculoConsumo(100);
		System.out.println("El consumo medio del coche 1 es de " + consumo1);
		float consumo2 = coche2.calculoConsumo(100);
		System.out.println("El consumo medio del coche 2 es de " + consumo2);
		boolean reposta = coche1.respostar();
		System.out.println("¿Tenemos que respostar este coche? " + reposta);
		boolean repostaje = coche2.respostar();
		System.out.println("¿Tenemos que respostar este coche? " + repostaje);
		
	}

}
