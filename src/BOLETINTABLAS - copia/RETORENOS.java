package BOLETINTABLAS;

import java.util.Scanner;

public class RETORENOS {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Cuántos renos van a participar?");
		int numrenos = scanner.nextInt();
		System.out.println("¿Cuál es la longitud de la pista?");
		int longitud = scanner.nextInt();
		int i = 0;
		int j = 1;
		int renos [] = new int [numrenos];
		while (i < numrenos) {
			System.out.println("¿En qué posición va este reno?");
			int pos = scanner.nextInt();
			renos[i]=pos;
			i ++;
			if (pos>longitud) {
				System.out.println("No puede ser la posición más grande que la longitud de la pista");
			}
			else {
	
				for (int x = 0; x < renos.length;x++) {
					String cad= "@";
					for (int p=0; p < renos[x]-1;p++) {
						cad= cad+"#";}
					if (pos != 0) {
						cad= cad+"R";
						for (int f= 0; f < longitud-renos[x];f++) {
						cad = cad + "#";
						}
						int suma = x + 1;
						cad = cad +"@ "+"/" + suma;
			
						System.out.println(cad);}
						else {
							for (int f= 0; f < longitud-renos[x];f++) {
								cad = cad + "#";
								}
								int suma = x + 1;
								cad = cad +"@ "+"/" + suma;
					
								System.out.println(cad);}

					}}}}}
