package BOLETINTABLAS;

import java.util.Scanner;

public class Cargatabla {

	public static void main(String[] args) {
		Cargatabla f = new Cargatabla();
		String [] tabla = f.cargaTabla();
		f.ImprimeTabla(tabla);
		String [] nums = f.cargaNumeros(tabla);
		f.ImprimeTabla(nums);
		String [] minusculas = f.cargaMinusculas(tabla);
		f.ImprimeTabla(minusculas);
		String [] mayusculas = f.cargaMinusculas(tabla);
		f.ImprimeTabla(mayusculas);
 		System.out.println(f.isCadenaEsNumero("1234"));
		System.out.println(f.isCadenaEsNumero("1A34"));
		}
		String[] cargaTabla () 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Dame una frase:");
			String cadena = sc.nextLine();
			String[] tabla = cadena.split(" ");
			return tabla;
	}
		void ImprimeTabla (String [] tabla) {
		for (int i = 0; i<tabla.length;i++) {
			System.out.println(tabla[i]);
		}
}
		String [] cargaNumeros (String [] tabla) {
			String [] numeros = new String[tabla.length];
			for (int i = 0; i<tabla.length; i++) {
				if (isCadenaEsNumero(tabla[i])) {
					numeros [i] = tabla [i];
			
					
			}}
			return numeros;
		}
		boolean isCadenaEsNumero (String palabra) {
			boolean es = true;
			for (int i = 0; i<palabra.length(); i++) {
				Character c = palabra.charAt(i);
				es = es && Character.isDigit(c);
				}
			
		return es;
		}
		boolean primerMinuscula (String palabra) {
			int i = 0;
			boolean esMin = true;
			Character f = palabra.charAt(i);
			esMin = esMin && Character.isLowerCase(f);
		return esMin;
		}
		String [] cargaMinusculas (String [] tabla) {
			String [] minusculas = new String[tabla.length];
			for (int i = 0; i<tabla.length; i++) {
				if (isCadenaEsNumero(tabla[i])) {
					minusculas [i] = tabla [i];
			
					
			}}
			return minusculas;
}	
		boolean primerMayuscula (String palabra) {
			int i = 0;
			boolean esMay = true;
			Character f = palabra.charAt(i);
			esMay = esMay && Character.isUpperCase(f);
		return esMay;
		}
		String [] cargaMayusculas (String [] tabla) {
			String [] mayusculas = new String[tabla.length];
			for (int i = 0; i<tabla.length; i++) {
				if (isCadenaEsNumero(tabla[i])) {
					mayusculas [i] = tabla [i];
			
					
			}}
			return mayusculas;
}
		String realizaConversion (String palabra) {
			Character f = palabra.charAt(0);
			Character.isUpperCase(f);
			Character u = palabra.charAt(palabra.length()-1);
			Character.isLowerCase(u);
			for (int i = 0; i<palabra.length();i++) {
				Character p = palabra.charAt(i);	
				if (palabra.charAt(i) = "O") {
			
			
			
			
			
			
			
			
			
			return palabra;
			
			
			
			
			
			
		}}}}