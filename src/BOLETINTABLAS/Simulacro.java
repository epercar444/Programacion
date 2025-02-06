package BOLETINTABLAS;

import java.util.Scanner;
import java.util.Random;

public class Simulacro {

    public static void main(String[] args) {
        Simulacro r = new Simulacro();
        r.imprimeMenú();
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opción válida");
        int opcion = sc.nextInt();
        int resultadoDados;
        int apuestas;
        int apostado;
        int jugadas = 0;
        String[] historico = new String[200];
        
        while (opcion < 3) {
            switch (opcion) {
                case 1:
                    resultadoDados = r.tirarDados();
                    apuestas = r.apuesta(sc);
                    apostado = r.cantidadApostada(sc);
                    jugadas = jugadas + 1;
                    int resultado = r.apostar(resultadoDados, apuestas, apostado, sc);
                    r.registraHistorico(historico, apuestas, resultadoDados, apostado, jugadas); // Registramos el historial después de la apuesta
                    System.out.println("¿Quieres seguir jugando?");
                    String validacion = sc.next().toUpperCase();
                    if (validacion.equals("S")) {
                        System.out.println("Elige una opción válida");
                        r.imprimeMenú();
                        opcion = sc.nextInt();
                    }
                    break;
                case 2:
                    if (jugadas == 0) {
                        System.out.println("No hay jugadas registradas.");
                        System.out.println("Elige una opción válida");
                        r.imprimeMenú();
                        opcion = sc.nextInt();
                    } else {
                        r.mostrarHistorial(historico, jugadas);
                    }
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
        String resultado = ""; 
        if (apuestas == resultadoDados) {
        	System.out.println("ganando " + (apostado * 2) + "€");  
        }
        else {
        	System.out.println("perdiendo " + apostado + "€");
        }

        String jugada = "En la " + obtenerPosicion(jugadas) + " jugada apostó al valor " + apuestas + " y sumó " + resultadoDados +
                ", " + resultado;

        historico[jugadas - 1] = jugada;
        System.out.println(jugada);
    }

    // Método para obtener la posición ordinal (1º, 2º, 3º...)
    String obtenerPosicion(int numero) {
            return numero + "ª";
        }

    // Método para mostrar el historial de jugadas
    void mostrarHistorial(String[] historico, int jugadas) {
        for (int i = 0; i < jugadas; i++) {
            System.out.println(historico[i]);
        }
    }

    // Método para mostrar el menú
    void imprimeMenú() {
        System.out.println("Las diferentes opciones son:");
        System.out.println("1. Apostar");
        System.out.println("2. Mostrar historial");
        System.out.println("3. Retirarse");
    }

    // Método para tirar los dados
    int tirarDados() {
        Random aleatorioR = new Random();
        int dado1 = aleatorioR.nextInt(6) + 1;
        int dado2 = aleatorioR.nextInt(6) + 1;
        return dado1 + dado2;  // Retorna la suma de los dos dados
    }

    // Método para solicitar la apuesta
    int apuesta(Scanner apuestas) {
        System.out.println("Dame el número sobre el que apuestas");
        return apuestas.nextInt();  // Retorna el número sobre el que el jugador apuesta
    }

    // Método para solicitar la cantidad apostada
    int cantidadApostada(Scanner f) {
        System.out.println("Dime la cantidad que vas a apostar");
        return f.nextInt();  // Retorna la cantidad que el jugador va a apostar
    }

    // Método para realizar la apuesta y calcular si se gana o se pierde
    int apostar(int suma, int apuesta, int cantidad, Scanner r) {
        int resultado = 0;
        if (apuesta == suma) {
            resultado = cantidad * 2;
            System.out.println("Has ganado " + resultado + "€");
        } else {
            resultado = -cantidad;
            System.out.println("Has perdido " + resultado + "€");
        }
        return resultado;  // Retorna el resultado (positivo o negativo)
    }
}

