package Modelo;

public class Animal2 extends SerVivo{

	protected Animal2(int edad) {
		super(edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean estaVivo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean seDesplaza() {
		// TODO Auto-generated method stub
		return false;
	}
	public String come() {
		return "El animal está comiendo";
	}
	public String respira() {
		return "El animal está respirando";
	}
}
