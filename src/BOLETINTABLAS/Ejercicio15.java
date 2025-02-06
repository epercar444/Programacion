//Escribe un programa utilizando programación estructurada, tablas (si así lo consideras) y funciones. 



//Este programa debe recibir dos números enteros. 

//El segundo número debe ser menor que el número de cifras del primero. Si no, el programa volverá a pedir la pareja de números. 

//El programa debe sumar tantos dígitos del primer número como indique el segundo número. 



import java.util.Scanner;



public class Ejercicio1 {

	public static void main(String[] args) {

		Ejercicio1 r = new Ejercicio1();

		System.out.println(r.numeromenor());

		

	}



	int numeromenor() {

		int resultado = 0;

		System.out.println("Introduce un número: ");

		Scanner sc = new Scanner(System.in);

		String num1 = sc.next();

		System.out.println("Introduce otro número: ");

		int num2 = sc.nextInt();

		if (datosValidos(num1, num2))



		{



			for (int i = 0; i < num2; i++) {

				String cadena = Character.toString(num1.charAt(i));

				int entero = Integer.parseInt(cadena);

				resultado = resultado + entero;



			}

		}

		return resultado;



	}



	boolean datosValidos(String num1, int num2) {

		boolean valido = false;

		if (num2 < num1.length()) {

			valido = true;



		}

		return valido;



	}

}     