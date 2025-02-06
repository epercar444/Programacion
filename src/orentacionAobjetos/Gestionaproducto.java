package orentacionAobjetos;

import java.util.Scanner;

public class Gestionaproducto {

	public static void main(String[] args) {
		int aumentos = 0;
		Producto tomate = new Producto();
		tomate.nombre = "Tomate frito";
		tomate.unidades = 3;
		tomate.precioventa = (float) 1.11;
		Producto galletas = new Producto();
		galletas.nombre = "Galletas Oreo";
		galletas.unidades = 5;
		galletas.precioventa = (float) 2;
		Producto aguacate = new Producto();
		aguacate.nombre = "Aguacate";
		aguacate.unidades = 1;
		aguacate.precioventa = (float) 1.60;
		boolean stocktomate = tomate.hayQuePedirStock();
		boolean stockgalletas =galletas.hayQuePedirStock();
		boolean stockaguacate =aguacate.hayQuePedirStock();
		Scanner sc = new Scanner(System.in);
		if (stocktomate) {
			tomate.aumentaUnidades(aumentos, sc);
			tomate.pasaAcadena();
		}
		else if (stockgalletas) {
			galletas.aumentaUnidades(aumentos, sc);
			galletas.pasaAcadena();
		}
		else if (stockaguacate) {
			aguacate.aumentaUnidades(aumentos, sc); 
			aguacate.pasaAcadena();
		}
}}

