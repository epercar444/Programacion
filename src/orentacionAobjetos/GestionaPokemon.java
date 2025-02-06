package orentacionAobjetos;

public class GestionaPokemon {

	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon();
		pikachu.nombre = "Pikachu";
		pikachu.nivel = 12;
		pikachu.tipo = "Eléctrico";
		Pokemon mew2 = new Pokemon();
		mew2.nombre = "Mewto";
		mew2.nivel = 20;
		mew2.tipo = "Psiquico";
		String cadenaPikachu = pikachu.convierteenCadena();
		System.out.println(cadenaPikachu);
		String cadenaMew = mew2.convierteenCadena();
		System.out.println(cadenaMew);
		boolean gana =pikachu.batallar(mew2);
		System.out.println("Pikachu gana a Mewto?:"+gana);
		cadenaMew = mew2.convierteenCadena();
		System.out.println(cadenaMew);
}}
