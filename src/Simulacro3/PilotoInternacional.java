package Simulacro3;

public class PilotoInternacional extends Piloto{

	public PilotoInternacional(String nombre, String nacionalidad, int edad, int numlicencia, double totalhorasvuelo) {
		super(nombre, nacionalidad, edad, numlicencia, totalhorasvuelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String operarVuelo() {
		return "Opero como piloto internacional";
	}

	@Override
	public int getDuracionVuelo() {
		return this.getDuracionVuelo() + 3;
	}

}
