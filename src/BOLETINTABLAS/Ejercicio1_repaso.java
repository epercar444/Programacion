package BOLETINTABLAS;

import java.util.Scanner;

public class Ejercicio1_repaso {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numAlumnosA = 25, numAlumnosB = 28, numAlumnosC = 31, numAlumnosD = 29;
		int numAlumnos = 0;
		String grupoSeleccionado;
		System.out.println("Introduce el grupo (A, B, C, D): ");
		grupoSeleccionado = scanner.next().toUpperCase();
		if (grupoSeleccionado == ("A")) {
			numAlumnos = numAlumnosA;
		} else if (grupoSeleccionado == ("B")) {
			numAlumnos = numAlumnosB;
		} else if (grupoSeleccionado == ("C")) {
			numAlumnos = numAlumnosC;
		} else if (grupoSeleccionado == ("D")) {
			numAlumnos = numAlumnosD;
		} else {
			System.out.println("Grupo no válido. Saliendo...");
		        }
		int mayorMedia = -1, mediaAlumno;	
		String alumnoMayorMedia = "";
		int alumnosSuspensos = 0;
		boolean existenSobresalientes = false;
		for (int i = 1; i <= numAlumnos; i++) {
			System.out.println("Introduce el nombre del alumno " + i + ": ");
			String nombreAlumno = scanner.next();
			System.out.println("Introduce la nota del primer parcial para " + nombreAlumno + ": ");
			int nota1 = scanner.nextInt();
			System.out.println("Introduce la nota del segundo parcial para " + nombreAlumno + ": ");
			int nota2 = scanner.nextInt();
			System.out.println("Introduce la nota del tercer parcial para " + nombreAlumno + ": ");
			int nota3 = scanner.nextInt();
			mediaAlumno = (nota1 + nota2 + nota3) / 3;
			if (mediaAlumno > mayorMedia) {
				mayorMedia = mediaAlumno;
				alumnoMayorMedia = nombreAlumno;
		            }
			if (mediaAlumno < 5) {
				alumnosSuspensos++;
		            }
			if (nota1 >= 9 || nota2 >= 9 || nota3 >= 9) {
				existenSobresalientes = true;
		            }
		        }
		System.out.println("El alumno con mayor media es: " + alumnoMayorMedia + " con una media de " + mayorMedia);
		System.out.println("Número de alumnos con nota media suspensa: " + alumnosSuspensos);
		        
		if (existenSobresalientes) {
			System.out.println("Existen sobresalientes.");
		        }
		    }
		}



