package Controlador;


import java.time.LocalDate;

import Modelo.Cliente;
import Modelo.CuentaBancaria;


public class GestionaCuentas {

	public static void main(String[] args) {
			Cliente t1 = new Cliente ("Pepe", "García", "12345678A");
			Cliente t2 = new Cliente ("Pepa", "Pérez", "87654321B");
			Cliente t3 = new Cliente ("Juan", "López", "15975368C");
			Cliente a1 = new Cliente ("Juan", "López", "15975368C");
			Cliente a2 = new Cliente ("Pepa", "Pérez", "87654321B");
			
			CuentaBancaria c1 = new CuentaBancaria (200, 15478965, LocalDate.of(2025, 01, 10),t1,a1);
			CuentaBancaria c2 = new CuentaBancaria (400, 47887596, LocalDate.of(2025, 01, 11),t2,a2);
			CuentaBancaria c3 = new CuentaBancaria (600, 78965423, LocalDate.of(2025, 01, 12),t3,null);
			
			System.out.println(c1.toString());
			System.out.println(c2.toString());
			System.out.println(c3.toString());
			

		}


	}


