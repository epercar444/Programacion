package Controlador;

import java.io.File;
import java.io.IOException;

public class gestionaExcepcion {

	public static void main(String[] args) {
		m1();
        //Declaro objeto fichero
        File fichero = new File("salida.txt");
        //Lo creo si no existe
        try {
			boolean creado = fichero.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
        public static boolean m1() throws NullPointerException {
        	throw new NullPointerException ("Genero NullPointer");
        }

}
