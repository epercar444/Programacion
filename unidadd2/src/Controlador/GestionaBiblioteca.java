package Controlador;

import Modelo.*;

public class GestionaBiblioteca {

	public static void main(String[] args) {
			Libros l1 = new Libros(0,"ubi","pepe","pepito","grillo");
			Peliculas p1 = new Peliculas (0,"ubi","pepe","pepito",110);
			Audios a1 = new Audios (0,"ubi","pepe","pepito",140);
			Juegos j1 = new Juegos (0,"ubi","pepe","pepito",4);
			System.out.println(l1.toString());
			System.out.println(p1.toString());
			System.out.println(a1.toString());
			System.out.println(j1.toString());
			System.out.println(p1.estaDisponible());
			System.out.println(p1.getDevuelveDiasPrestamo());
			System.out.println(p1.getDuracionMinutos());
			System.out.println(j1.getNumFases());
		}


	}


