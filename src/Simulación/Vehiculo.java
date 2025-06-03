package Simulación;

import java.util.Objects;

public class Vehiculo implements Comparable<Vehiculo>{
	private String numbast,numatr,marca,modelo,propietario;
	private int anyo;
	public String getNumbast() {
		return numbast;
	}
	public void setNumbast(String numbast) {
		this.numbast = numbast;
	}
	public String getNumatr() {
		return numatr;
	}
	public void setNumatr(String numatr) {
		this.numatr = numatr;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	public Vehiculo(String numbast, String numatr, String marca, String modelo, String propietario, int anyo) {
		super();
		this.numbast = numbast;
		this.numatr = numatr;
		this.marca = marca;
		this.modelo = modelo;
		this.propietario = propietario;
		this.anyo = anyo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(numbast);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(numbast, other.numbast);
	}
	@Override
	public String toString() {
		return "Vehiculo [numbast=" + numbast + ", numatr=" + numatr + ", marca=" + marca + ", modelo=" + modelo
				+ ", propietario=" + propietario + ", anyo=" + anyo + "]";
	}
	@Override
	public int compareTo(Vehiculo o) {
		return this.numatr.compareTo(o.numatr);
	}
	
	
}
