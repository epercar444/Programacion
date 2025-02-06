//Prmero preguntamos por teclado las cosas que nos han dicho, en este caso el texto. ç
//Con la función separaTexto separamos el texto indicado mediante comas.
//Con la funcion buscaPalabras comprobamos una a una que las palabras de la lista contiene o no vocales. Inicializamos un contador que nos indicará cuantas vocales tiene dicha palabra.
//En el Apartado2 pedimos el número y llamamos a las función buscaPalabras para no tener que repetir el mismo proceso.
//El array haría falta para imprimir por pantalla el contenido de la tabla de cadenas separadas.


package BOLETINTABLAS;

import java.util.Scanner;

public class Examen_Ejercicio1_EvaPerez {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Examen_Ejercicio1_EvaPerez r = new Examen_Ejercicio1_EvaPerez();
		String texto = "";
		int numveces = 0;
		String [] separadas = r.separaTexto(texto, sc);//array
		for (int i = 0; i < separadas.length;i++) {
			System.out.println(separadas[i]);
		}
	}
	String [] separaTexto (String texto, Scanner f ) {
		System.out.println("Pásame un texto:");
		texto = f.next().toLowerCase();
		String[] separadas = texto.split(",");
		return separadas;
	}
	void buscaPalabras (String [] separadas, String texto, Scanner sc) {
		int contador = 0;
		Examen_Ejercicio1_EvaPerez f = new Examen_Ejercicio1_EvaPerez();
		separadas = f.separaTexto(texto, sc);
		for (int i = 0; i < separadas.length; i++) {
			if (separadas[i].contains("a")) {
				contador = contador + 1;
				}
			else {
				contador = contador;
			}
			if (separadas[i].contains("e")) {
				contador = contador + 1;
			}
			else {
				contador = contador;
			}
			if (separadas[i].contains("i")) {
				contador = contador + 1;
			}
			else {
				contador = contador;
			}
			if (separadas[i].contains("o")) {
				contador = contador + 1;
			}
			else {
				contador = contador;
			}
			if (separadas[i].contains("u")) {
				contador = contador + 1;
			}
			else {
				contador = contador;
			}
		if (contador == 3) {
			System.out.println("La palabra" + separadas[i] + "tiene tres vocales");
		}
		}
		
		//Apartado2
		void vecesBuscar (int numveces, Scanner sc, String [] separadas,String texto) {
			int contador = 0;
			System.out.println("¿Cuántas vocales quieres que busque?");
			numveces = sc.nextInt();
			Examen_Ejercicio1_EvaPerez f = new Examen_Ejercicio1_EvaPerez();
			separadas = f.separaTexto(texto, sc);
			while (numveces != contador) {
				System.out.println("No existe ninguna palabra con dicho número de vocales.");
			}
			if (numveces == contador) {
				f.buscaPalabras(separadas, texto, sc);
			}
		}
	}


	


