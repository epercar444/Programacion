package BOLETINTABLAS;

import java.util.Scanner;
import java.util.Random;

public class Simulacro1 {

    public static void main(String[] args) {
        Simulacro1 r = new Simulacro1();
        r.imprimeMenú();
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opción válida");
        int opcion = sc.nextInt();
        int resultadoDados;
        int apuestas;
        int apostado = 0;
        int jugadas = 0;
        String[] historico = new String[200];
        
        while (opcion < 3) {
            switch (opcion) {
                case 1:
                    resultadoDados = r.tirarDados();
                    apuestas = r.apuesta(sc);
                    apostado = apostado + r.cantidadApostada(sc);
                    jugadas++;
                    int resultado = r.apostar(resultadoDados, apuestas, apostado);
                    r.registraHistorico(historico, apuestas, resultadoDados, apostado, jugadas);
                    System.out.println("¿Quieres seguir jugando? (S/N)");
                    String validacion = sc.next().toUpperCase();
                    if (validacion.equals("S")) {
                        r.imprimeMenú();
                        opcion = sc.nextInt();
                    } else {
                        opcion = 3; 
                    }
                    break;
                case 2:
                    if (jugadas == 0) {
                        System.out.println("No hay jugadas registradas.");
                    } else {
                        r.mostrarHistorial(historico, jugadas);
                    }
                    r.imprimeMenú();
                    opcion = sc.nextInt();
                    break;
                default:
                    System.out.println("Elige una opción válida");
                    r.imprimeMenú();
                    opcion = sc.nextInt();
            }
        }

        if (opcion == 3) {
            System.out.println("Saliendo del programa");
        }
    }

    void registraHistorico(String[] historico, int apuestas, int resultadoDados, int apostado, int jugadas) {
    	String resultado;
    	if (apuestas == resultadoDados) {
    	    resultado = "ganando " + (apostado * 2) + "€";
    	} else {
    	    resultado = "perdiendo " + apostado + "€";
    	}
        String jugada = "En la " + obtenerPosicion(jugadas) + " jugada apostó al valor " + apuestas + 
                        " y sumó " + resultadoDados + ", " + resultado;
        historico[jugadas - 1] = jugada;
    }

    String obtenerPosicion(int numero) {
        return numero + "ª";
    }

    void mostrarHistorial(String[] historico, int jugadas) {
        for (int i = 0; i < jugadas; i++) {
            System.out.println(historico[i]);
        }
    }

    void imprimeMenú() {
        System.out.println("Las diferentes opciones son:");
        System.out.println("1. Apostar");
        System.out.println("2. Mostrar historial");
        System.out.println("3. Retirarse");
    }

    int tirarDados() {
        Random aleatorioR = new Random();
        int dado1 = aleatorioR.nextInt(6) + 1;
        int dado2 = aleatorioR.nextInt(6) + 1;
        return dado1 + dado2;
    }

    int apuesta(Scanner apuestas) {
        System.out.println("Dame el número sobre el que apuestas");
        int apostado = apuestas.nextInt();
        while (apostado < 2 || apostado > 12) {
            System.out.println("El número de la apuesta debe estar entre 2 y 12.");
            System.out.println("Dame el número sobre el que apuestas");
            apostado = apuestas.nextInt();
        }
        return apostado;}

    int cantidadApostada(Scanner f) {
        System.out.println("Dime la cantidad que vas a apostar");
        int cantidad = f.nextInt();
        return cantidad;
    }

    int apostar(int suma, int apuesta, int cantidad) {
        int resultado;
        if (apuesta == suma) {
            resultado = cantidad * 2;
            System.out.println("Has ganado " + resultado + "€");
        } else {
            resultado = -cantidad;
            System.out.println("Has perdido " + cantidad + "€");
        }
        return resultado;
    }
}
