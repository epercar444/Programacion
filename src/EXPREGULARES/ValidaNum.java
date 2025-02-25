package EXPREGULARES;

import java.util.regex.Pattern;

public class ValidaNum {

	public static void main(String[] args) {
		String numero = new String ("1234A");
		String caracter = "perro";
		String ejemplo ="12345";
		
		System.out.println(numero.matches(numero));
		
		System.out.println(numero.matches("//d*"));
		
		 boolean b = Pattern.matches("\\d+", caracter);
		 System.out.println(b);
		 //boolean bc = Pattern.matches("\\d{8}\\z\\", caracter);
		 //System.out.println(bc);
		 boolean ba = Pattern.matches("^[A-Za-z\\s]+$", caracter);
		 System.out.println(ba);



	}

}
