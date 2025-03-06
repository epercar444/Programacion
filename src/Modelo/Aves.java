package Modelo;

public abstract class Aves extends Mascotas{
	private String pico;
	private boolean vuela;
	public String getPico() {
		return pico;
	}

	public void setPico(String pico) {
		this.pico = pico;
	}

	public boolean isVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}

	public abstract boolean volar();

}
