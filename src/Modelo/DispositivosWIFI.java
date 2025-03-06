package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class DispositivosWIFI {
	private int id;
	private static int contador = 0;
	private int MAC;
	protected Estado2 estado;
	private LocalDate fecha_actu;
	
	public DispositivosWIFI(int id, int mAC, Estado2 estado, LocalDate fecha_actu) {
		super();
		this.id = contador +1;
		contador += 1;
		MAC = mAC;
		this.estado = estado;
		this.fecha_actu = fecha_actu;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		DispositivosWIFI.contador = contador;
	}
	public int getMAC() {
		return MAC;
	}
	public void setMAC(int mAC) {
		MAC = mAC;
	}
	public Estado2 getEstado() {
		return estado;
	}
	public void setEstado(Estado2 estado) {
		this.estado = estado;
	}
	public LocalDate getFecha_actu() {
		return fecha_actu;
	}
	public void setFecha_actu(LocalDate fecha_actu) {
		this.fecha_actu = fecha_actu;
	}
	@Override
	public int hashCode() {
		return Objects.hash(MAC);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DispositivosWIFI other = (DispositivosWIFI) obj;
		return MAC == other.MAC;
	}
	public abstract void conectarInternet();
	public abstract boolean pendienteActualizacion();
	public void apagar() {
		this.estado = estado.OFF;
	}
	@Override
	public String toString() {
		return "DispositivosWIFI [id=" + id + ", MAC=" + MAC + ", estado=" + estado + ", fecha_actu=" + fecha_actu
				+ "]";
	}
	
	
	
}
