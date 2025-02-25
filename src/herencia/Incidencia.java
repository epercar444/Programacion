package herencia;

import java.time.LocalDate;
import java.util.Objects;

public class Incidencia {
	private Equipo equipo;
	private Criticidad criticidad;
	private float identificaciornum;
	private String nombre;
	private Estado estado;
	private LocalDate fecharegistro;
	private LocalDate fechacerro;
	public Incidencia(Equipo equipo, Criticidad criticidad, float identificaciornum, String nombre, Estado estado,
			LocalDate fecharegistro, LocalDate fechacerro) {
		super();
		this.equipo = equipo;
		this.criticidad = criticidad;
		this.identificaciornum = identificaciornum;
		this.nombre = nombre;
		setEstado(estado);
		this.estado = estado;
		this.fecharegistro = fecharegistro;
		setFechacerro(fechacerro);
		this.fechacerro = fechacerro;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	public Criticidad getCriticidad() {
		return criticidad;
	}
	public void setCriticidad(Criticidad criticidad) {
		this.criticidad = criticidad;
	}
	public float getIdentificaciornum() {
		return identificaciornum;
	}
	public void setIdentificaciornum(float identificaciornum) {
		this.identificaciornum = identificaciornum;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		if (estado.equals(estado.CERRADA)) {
			LocalDate fechacerro = LocalDate.now();
		}
		this.estado = estado;
	}
	public LocalDate getFecharegistro() {
		return fecharegistro;
	}
	public void setFecharegistro(LocalDate fecharegistro) {
		this.fecharegistro = fecharegistro;
	}
	public LocalDate getFechacerro() {
		return fechacerro;
	}
	public void setFechacerro(LocalDate fechacerro) {
		if (estado != estado.CERRADA) {
			fechacerro = null;
		}
		else {
			this.fechacerro = fechacerro;
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(criticidad, equipo, estado, fechacerro, fecharegistro, identificaciornum, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incidencia other = (Incidencia) obj;
		return criticidad == other.criticidad && Objects.equals(equipo, other.equipo) && estado == other.estado
				&& Objects.equals(fechacerro, other.fechacerro) && Objects.equals(fecharegistro, other.fecharegistro)
				&& Float.floatToIntBits(identificaciornum) == Float.floatToIntBits(other.identificaciornum)
				&& Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Incidencia [equipo=" + equipo.getNombreEquipo() + ", criticidad=" + criticidad + ", nombre=" + nombre + ", estado=" + estado + ", fecharegistro=" + fecharegistro
				+ ", fechacerro=" + fechacerro + "]";
	}
	private boolean pasarTiempo ()  {
		boolean grave = false;
		if (LocalDate.now().equals(fecharegistro.plusDays(7))) {
			grave = true;
		}
		else if (LocalDate.now().equals(fecharegistro.plusMonths(1))) {
			grave = true;
		}
		return grave;
	}
	
	public void esUrgente() {
		if (criticidad.equals(criticidad.CRITICA)) {
			System.out.println("La incidencia es critica");
		}
		else if (criticidad.equals(criticidad.GRAVE) && LocalDate.now() > fecharegistro.plusDays(7) ) {
			System.out.println("La incidencia es grave y han pasado 7 días o más desde su registro");
		}
		else if (criticidad.equals(criticidad.MEDIA) && pasarTiempo()) {
			System.out.println("La incidencia es media y ha pasado un mes o más desde su registro");
		}
	}
	
}
