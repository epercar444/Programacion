package herencia;

import java.util.Objects;

public class Equipo {
	private String nombreEquipo;
	private String direccionMac;
	private String sistema;
	private int numincidentes;
	public Equipo(String nombreEquipo, String direccionMac, String sistema, int numincidentes) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.direccionMac = direccionMac;
		this.sistema = sistema;
		this.numincidentes = 0;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public String getDireccionMac() {
		return direccionMac;
	}
	public void setDireccionMac(String direccionMac) {
		this.direccionMac = direccionMac;
	}
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	public int getNumincidentes() {
		return numincidentes;
	}
	public void setNumincidentes(int numincidentes) {
		this.numincidentes = numincidentes;
	}
	@Override
	public int hashCode() {
		return Objects.hash(direccionMac, nombreEquipo, numincidentes, sistema);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(direccionMac, other.direccionMac);
	}
	@Override
	public String toString() {
		return  nombreEquipo + "-" + direccionMac + ", sistema=" + sistema
				+ ", numincidentes=" + numincidentes + "]";
	}
	
	
}
