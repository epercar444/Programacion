package Biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

	public static void main(String[] args) {
		Biblioteca f = new Biblioteca();
		List <Libro> libros = new ArrayList <Libro>();
		Libro l1 = new Libro ("Harry Potter y la piedra filosofal", "J.K Rowling", "Fantasía", 1977, EstadoLibro.PRESTADO);
		Libro l2 = new Libro ("Harry Potter y la cámara secreta", "J.K Rowling", "Fantasía", 1978, EstadoLibro.LIBRE);
		int opcion = f.imprimeMenu();	
		switch (opcion) {
		
		case 1: {
			f.addLibro(libros, l1);
			f.addLibro(libros, l2);
			break; }
		case 2:{
			try {
				f.prestarLibro(libros, l1);
				f.prestarLibro(libros, l2);
			}
			catch (BibliotecaExcepcion e) {
				System.out.println(e.getMessage());
			}
			break; }
		case 3: {
			try {
				f.devolverLibro(libros, l1);
				f.devolverLibro(libros, l2);
			}
			catch (BibliotecaExcepcion e) {
				System.out.println(e.getMessage());
			} 
			break;
		}
		case 4: {
			f.mostrarInventario(libros);
			break;
		}
		case 5: {
			f.imprimeInformacion(l1);
			break;
		}
		case 6:  {
			System.out.println("¿Está esta información en el libro seleccionado?" + f.estaEnLibro("Harry Potter y la piedra filosofal", "Eva", l1, libros));
			break;
		}
		case 7: {
			System.out.println("Saliendo del programa");
			break;
		}
		default : 
			System.out.println("Ingresa una opción correcta");
		}
		while (opcion !=7) {
			System.out.println(f.imprimeMenu());
		}
	}
	public int imprimeMenu() {
		System.out.println("1.Agregar un nuevo libro");
		System.out.println("2.Prestar un ejemplar de un libro");
		System.out.println("3.Devolver un ejemplar prestado");
		System.out.println("4.Mostrar la lista de todos los libros en el inventario");
		System.out.println("5.Mostrar información detallada de un libro");
		System.out.println("6.Buscar libros por título o autor");
		System.out.println("7.Salir del programa");
		System.out.println("Elige una opción: ");
		Scanner sc =new Scanner(System.in);
		int opcion = sc.nextInt();
		return opcion;
	}
	public void addLibro(List <Libro> libros,Libro e) {
		libros.add(e);
		System.out.println("Libro "+e.getTitulo() + " añadido");
	}
	public void prestarLibro(List <Libro> libros,Libro e) throws BibliotecaExcepcion {
			if (libros.contains(e) && e.getEstadolibro().equals(EstadoLibro.LIBRE)) {
				e.setEstadolibro(EstadoLibro.PRESTADO); 
				System.out.println("Libro" + e.getTitulo() + "prestado");
			}
			else {
				throw new BibliotecaExcepcion("El libro no se encuentra en el inventario o ya ha sido prestado");
 			}
		}
	public void devolverLibro(List <Libro> libros,Libro e) throws BibliotecaExcepcion {
		if (libros.contains(e) && e.getEstadolibro().equals(EstadoLibro.PRESTADO)) {
			e.setEstadolibro(EstadoLibro.LIBRE); 
			System.out.println("Libro" + e.getTitulo() + "prestado");
		}
		else {
			throw new BibliotecaExcepcion("El libro no se encuentra en el inventario o su estado es libre");
			}
	}
	public void mostrarInventario (List <Libro> libros) {
		for (int i = 0; i<libros.size(); i++) {
			System.out.println(libros.get(i));
		}
		}
	public void imprimeInformacion (Libro e) {
		System.out.println(e.toString());
	}
	public boolean estaEnLibro (String titulo, String autor,Libro e,List <Libro> libros) {
		boolean esta = false;
		for (int i = 0; i<libros.size(); i++) {
			if (e.getTitulo().equals(titulo) || e.getAutor().equals(autor)) {
				esta = true;
			}
		}
		return esta;
	}
	}
	


