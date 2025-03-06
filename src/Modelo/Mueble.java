package Modelo;

public class Mueble implements Interfaz,Transportable{

	@Override
	public
	void comoColorear() {
		System.out.println("Imprimo Rojo:" + this.ROJO);
		
	}

	@Override
	public boolean esTransportable() {
		// TODO Auto-generated method stub
		return false;
	}

}
// Así se hace el apartado último del boletín 9. Dos clases interfaces en vez de una clase abstracta. 