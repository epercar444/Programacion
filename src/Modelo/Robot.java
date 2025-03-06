package Modelo;

import java.util.Objects;

public abstract class Robot {
	private int identificador;
	private static int contador = 0;
	private String modelo;
	private double bateria;
	protected Estado estado;
	private String combustible;
	private String descripion;
	
	
	public Robot(int identificador,String modelo, double bateria, Estado estado, String combustible,
			String descripion) {
		super();
		this.identificador = contador + 1;
		contador += 1;
		this.modelo = modelo;
		this.bateria = bateria;
		this.estado = estado;
		this.combustible = combustible;
		this.descripion = descripion;
	}


	public int getIdentificador() {
		return identificador;
	}


	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}


	public int getContador() {
		return contador;
	}


	public void setContador(int contador) {
		this.contador = contador;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getBateria() {
		return bateria;
	}


	public void setBateria(double bateria) {
		this.bateria = bateria;
	}


	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}


	public String getCombustible() {
		return combustible;
	}


	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}


	public String getDescripion() {
		return descripion;
	}


	public void setDescripion(String descripion) {
		this.descripion = descripion;
	}


	public boolean bateriaSuficiente () {
		boolean suficiente = false;
		if (bateria > 10) {
			suficiente = true;
		}
		return suficiente;
	}


	@Override
	public int hashCode() {
		return Objects.hash(identificador);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Robot other = (Robot) obj;
		return identificador == other.identificador;
	}


	@Override
	public String toString() {
		return "Robot [identificador=" + identificador + ", modelo=" + modelo + ", bateria=" + bateria + ", estado="
				+ estado + "]";
	}
	public abstract String ejecutarTarea();
	public abstract boolean recargar ();
	
}
