package Modelo;

public class Ensamblador extends Robot{

	public Ensamblador(int identificador, String modelo, double bateria, Estado estado, String combustible,
			String descripion) {
		super(identificador, modelo, bateria, estado, combustible, descripion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ejecutarTarea() {
		// TODO Auto-generated method stub
		return "Ensamblo las piezas";
	}

	@Override
	public boolean recargar() {
		boolean recargar = false;
		if (estado.equals(estado.APAGADO) && getCombustible().equals("Gasolina")) {
			recargar = true;
		}
		// TODO Auto-generated method stub
		return recargar;
	}
	public void recargarDos () {
		if (recargar()) {
			System.out.println("Recargando por gasolina");
		}
		else {
			System.out.println("Estoy encendido y no puedo recargar");
		}
}}

