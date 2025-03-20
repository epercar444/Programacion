package Excepciones;

public class GestionaExcepcion {

	public static void main(String[] args) {
		GestionaExcepcion r= new GestionaExcepcion();
		r.Metodo1(2);
		}
	
		public void Metodo1(int numero) {
			try {
				if (numero%3== 0) {
					throw new EvaExcepcion("Lanzando una excepcion");
				}
				else {
					System.out.println("Numeropar");
				}
			}
			catch (EvaExcepcion e){
				System.out.println(e.getMessage());
			
		}
}}