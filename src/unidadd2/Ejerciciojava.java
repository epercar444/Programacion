package unidadd2;

import java. util.Scanner;

public class Ejerciciojava {

public static void main (String[] args) {
Ejerciciojava f = new Ejerciciojava ();
String [] tabla = f.cargaTabla () ;
f. ImprimeTabla (tabla);
}
String[] cargaTabla () {

Scanner sc = new Scanner (System.in) ;
System.out.println ("Dame una frase:");
String cadena = sc.nextLine () ;
String[] tabla = cadena.split (" ");
return tabla;
}
void ImprimeTabla (String [] tabla) {
for (int i = 0; i<tabla. length; i++) {
System.out.println (tabla[i]);

}
}

String [] cargaNumeros (String [] tabla) {
String [] numeros = new String[tabla. length];
for (int i = 0; i<tabla. length; i++) {


}
}
}
