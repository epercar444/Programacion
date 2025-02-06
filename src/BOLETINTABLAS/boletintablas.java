package BOLETINTABLAS;

import java.util.Scanner;

public class boletintablas {

	public static void main(String[] args) {
		//boleano;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame el número que tengo que buscar:");
		int num = scanner.nextInt();
		int lista [] = new int[4];
		lista[0] = 1;
		lista[1]=3;
		lista[2]=4;
		lista [3]= 7;
		int i = 0;
		while (i < lista.length) {
			if (num == lista[i]) {
				System.out.println("Este número está en la posición" + i);
			}
			else if (num == 9) {
				System.out.println("Está en la posición:" + lista.length+1);}
			else if (num==0) {
				System.out.println("Está en la posición -999");
			}
			else {
				if (num < lista[i] && num > lista[i-1]) {
					int pos = i;
					System.out.println("El número está en la posición -"+ pos);}
			i++;
				}}}}


