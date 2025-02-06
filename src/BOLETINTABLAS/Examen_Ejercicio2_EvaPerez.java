package BOLETINTABLAS;

import java.util.Random;
import java.util.Scanner;

public class Examen_Ejercicio2_EvaPerez {

	public static void main(String[] args) {
        String[] capturados = new String[15];
        String[] niveles = new String[15];
        Examen_Ejercicio2_EvaPerez r = new Examen_Ejercicio2_EvaPerez();
        r.imprimeMenú();
        int posicion = 0;
        int posicion3 = 0;
        int numbatallas = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opción válida");
        int opcion = sc.nextInt();
        while (opcion < 4) {
            switch (opcion) {
                case 1:
                	r.capturaPokemonNombre(capturados, sc);
                	r.capturaPokemonNivel(niveles, sc);
                    System.out.println("¿Quieres seguir jugando? (S/N)");
                    String validacion = sc.next().toUpperCase();
                    if (validacion.equals("S")) {
                        r.imprimeMenú();
                        opcion = sc.nextInt();
                    } else {
                        opcion = 4; 
                    }
                    break;
                case 2:
                	numbatallas = numbatallas + 1;
                	int posicion1 = r.posicionPokemon1(posicion, sc);
                	int posicion2 = r.posicionPokemon2(posicion3, sc, posicion);
                    System.out.println("¿Quieres seguir jugando? (S/N)");
                    validacion = sc.next().toUpperCase();
                	r.realizarBatalla(capturados, niveles, posicion1, sc, posicion2);
                    if (validacion.equals("S")) {
                        r.imprimeMenú();
                        opcion = sc.nextInt();
                    } else {
                        opcion = 4; }
                    break;
                case 3:
                	r.mostrarPokédex(capturados, niveles, sc);
                    System.out.println("¿Quieres seguir jugando? (S/N)");
                    validacion = sc.next().toUpperCase();
                    if (validacion.equals("S")) {
                        r.imprimeMenú();
                        opcion = sc.nextInt();
                    } else {
                        opcion = 4; }
                    break;
                default:
                    System.out.println("Elige una opción válida");
                    r.imprimeMenú();
                    opcion = sc.nextInt();
            }}
        if (opcion == 4) {
        	int numero = r.numeroPokemons(capturados, opcion);
        	int media = r.mediaPokemon(niveles, numero, capturados);
        	String cadenas = "Tu equipo tiene" + numero + "pokemons. Su nivel medio es" + media + ".Han realizado" + numbatallas + "batallas hasta ahora.";
        	System.out.println("Saliendo del programa");
        }

	}
    void imprimeMenú() {
        System.out.println("Las diferentes opciones son:");
        System.out.println("1. Capturar Pokémon");
        System.out.println("2. Realizar Batalla");
        System.out.println("3. Mostrar Pokédex");
        System.out.println("4.Finalizar");
    }
    String[] capturaPokemonNombre (String [] capturados,Scanner sc) {
    	System.out.println("Dame el nombre del Pokémon capturado:");
    	String nombre = sc.next();
    	for (int i = 0; i < capturados.length; i++) {
    		capturados [i] = nombre;
    	}
    	return capturados;
    }
    String[] capturaPokemonNivel (String [] niveles,Scanner sc) {
    	System.out.println("Dame el nivel del Pokémon capturado:");
    	String nombre = sc.next();
    	for (int i = 0; i < niveles.length; i++) {
    		niveles [i] = nombre;
    	}	
    	return niveles;
}
    String realizarBatalla(String[] capturados,String[] niveles,int posicion, Scanner sc,int posicion1) {
        Examen_Ejercicio2_EvaPerez r = new Examen_Ejercicio2_EvaPerez();
        String resultado = "";
        capturados = r.capturaPokemonNombre(capturados, sc);
        niveles = r.capturaPokemonNivel(niveles, sc);
        posicion = r.posicionPokemon1(posicion, sc);
        posicion1 = r.posicionPokemon2(posicion1, sc, posicion);
        int pokemon1 = Integer.parseInt(niveles[posicion]);
        int pokemon2 = Integer.parseInt(niveles[posicion1]);
        if (pokemon1 > pokemon2)
        {
        	niveles [posicion] = niveles [posicion] + 1;
        	resultado = "Tú Pokémon" + capturados[posicion] + "(" + niveles[posicion] + ")" + "luchó contra" + capturados [posicion1] + "de nivel" + niveles [posicion1] + "Resultado:Victoria";
        }
        else if (niveles[posicion] == niveles[posicion1]) {
        	resultado = "Tú Pokémon" + capturados[posicion] + "(" + niveles[posicion] + ")" + "luchó contra" + capturados [posicion1] + "de nivel" + niveles [posicion1] + "Resultado:Empate";
        }
        else {
        	posicion1 = posicion1 + 1;
        	resultado = "Tú Pokémon" + capturados[posicion] + "(" + niveles[posicion] + ")" + "luchó contra" + capturados [posicion1] + "de nivel" + niveles [posicion1] + "Resultado:Derrota";
        }
        return resultado;
        }
    int posicionPokemon1 (int posicion, Scanner sc) {
        System.out.println("Dime la posición del Pokémon que quieres llevar a batalla:");
        posicion = sc.nextInt();
        return posicion;
    }
    int posicionPokemon2 (int posicion1,Scanner sc,int posicion) {
        Examen_Ejercicio2_EvaPerez r = new Examen_Ejercicio2_EvaPerez();
        Random aleatorioR = new Random();
        posicion1  = aleatorioR.nextInt(15) + 1;
        posicion = r.posicionPokemon1(posicion, sc);
        while (posicion == posicion1) {
            posicion1  = aleatorioR.nextInt(15) + 1;
        }
        return posicion1;
        }
    String mostrarPokédex (String[] capturados, String[] niveles, Scanner sc) {
    	String cadena = "";
        Examen_Ejercicio2_EvaPerez r = new Examen_Ejercicio2_EvaPerez();
        capturados = r.capturaPokemonNombre(capturados, sc);
        niveles = r.capturaPokemonNivel(niveles, sc);
    	for (int i=0; i < capturados.length;i++) {
    		cadena = i + "." + capturados[i] + "- Nivel" + niveles[i];
    	}
		return cadena;
    }
    int numeroPokemons (String [] capturados, int numero) {
    	numero = 0;
    	for (int i = 0; i < capturados.length;i++) {
    		if (capturados[i] == " ") {
    			numero = numero;
    		}
    		else {
    			numero = numero + 1;  
    		}
    	}
    	return numero;
    }
    int mediaPokemon (String [] niveles, int numero, String [] capturados) {
    	String suma = "";
    	int SumaI = 0;
        Examen_Ejercicio2_EvaPerez r = new Examen_Ejercicio2_EvaPerez();
    	numero = r.numeroPokemons(capturados, numero);
    	for (int i=0; i < niveles.length;i++) {
    		suma = niveles [i] + niveles [i+1];
    		SumaI = Integer.parseInt(suma);
    	}
    	int resultado = SumaI / numero; 
    	return resultado;
    }
    }


