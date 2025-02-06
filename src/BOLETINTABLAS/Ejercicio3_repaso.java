package BOLETINTABLAS;

import java.util.Scanner;

public class Ejercicio3_repaso {
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.print("Introduce el número de la región (1, 2, 3 o 4): ");
	        int region = scanner.nextInt();
	        int totalVotosA = 0, totalVotosB = 0, totalAbstenciones = 0;
	        int totalVotosTotales = 0;
	        int provinciasRegion = 0;
	        String provinciaMaxA = "", provinciaMaxB = "";
	        int maxVotosA = -1, maxVotosB = -1;
	        switch (region) {
	            case 1:
	                provinciasRegion = 10;
	                break;
	            case 2:
	                provinciasRegion = 4;
	                break;
	            case 3:
	                provinciasRegion = 6;
	                break;
	            case 4:
	                provinciasRegion = 1;
	                break;
	            default:
	                System.out.println("Región no válida.");
	        }
	        for (int i = 1; i <= provinciasRegion; i++) {
	            System.out.println("Introduce los datos para la provincia " + i + ":");
	            System.out.print("Nombre de la provincia: ");
	            String nombreProvincia = scanner.next();
	            System.out.print("Votos para el partido A: ");
	            int votosA = scanner.nextInt();
	            System.out.print("Votos para el partido B: ");
	            int votosB = scanner.nextInt();
	            System.out.print("Abstenciones: ");
	            int abstenciones = scanner.nextInt();
	            totalVotosA += votosA;
	            totalVotosB += votosB;
	            totalAbstenciones += abstenciones;
	            totalVotosTotales += (votosA + votosB + abstenciones);
	            if (votosA > maxVotosA) {
	                maxVotosA = votosA;
	                provinciaMaxA = nombreProvincia;
	            }
	            if (votosB > maxVotosB) {
	                maxVotosB = votosB;
	                provinciaMaxB = nombreProvincia;
	            }
	            if (abstenciones > 100000) {
	                System.out.println("Alta abstención");
	            }
	        }
	        int porcentajeVotos = ((int)(totalVotosA + totalVotosB) / totalVotosTotales) * 100;
	        int porcentajeAbstencion = ((int) totalAbstenciones / totalVotosTotales) * 100;
	        System.out.println("Resultados finales de la región " + region + ":");
	        System.out.println("Porcentaje de votos totales: " + porcentajeVotos + "%");
	        System.out.println("Porcentaje de abstenciones: " + porcentajeAbstencion + "%");
	        System.out.println("Provincia con más votos para el partido A: " + provinciaMaxA);
	        System.out.println("Provincia con más votos para el partido B: " + provinciaMaxB);
	    }
	}



