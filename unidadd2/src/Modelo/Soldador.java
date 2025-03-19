package Modelo;

public class Soldador extends Robot{
	private int temperatura;
	private String espec_seguridad;
	

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public String getEspec_seguridad() {
		return espec_seguridad;
	}

	public void setEspec_seguridad(String espec_seguridad) {
		this.espec_seguridad = espec_seguridad;
	}

	public Soldador(int identificador, String modelo, double bateria, Estado estado, String combustible,
			String descripion, int temperatura, String espec_seguridad) {
		super(identificador, modelo, bateria, estado, combustible, descripion);
		// TODO Auto-generated constructor stub
		this.temperatura = temperatura;
		this.espec_seguridad = espec_seguridad;
	}

	@Override
	public String ejecutarTarea() {
		// TODO Auto-generated method stub
		String cadena ="Su tarea es realizar soldaduras precisas en la carrocería del automóvil";
		return cadena;
	}

	@Override
	public boolean recargar() {
		boolean recargar = false;
		if (estado.equals(estado.APAGADO) && getCombustible().equals("Electricidad")) {
			recargar = true;
		}
		// TODO Auto-generated method stub
		return recargar;
	}
	public void recargarDos () {
		if (recargar()) {
			System.out.println("Recargando por electricidad");
		}
		else {
			System.out.println("Estoy encendido y no puedo recargar");
		}
	}

}
