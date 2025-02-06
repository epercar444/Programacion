package orentacionAobjetos;

public class Pokemon {
	String nombre;
	int nivel;
	String tipo;
	String convierteenCadena() {
	String cadena ="Pokemon 1:"+nombre+" y su nivel es:"+nivel+" y es de tipo:"+tipo;
	return cadena;}
	
	boolean batallar (Pokemon p2) {
		boolean gana = true;
		if (nivel > p2.nivel) {
			gana = true;
			nivel = nivel + 1;
		}
		else {
			gana = false;
			p2.nivel = p2.nivel + 1;
		}
 		return gana;
	}
}
