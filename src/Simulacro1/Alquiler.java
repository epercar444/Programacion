package Simulacro1;

import java.time.LocalDate;

public class Alquiler {
	private int id,num_dias,permiso_cund;
	private LocalDate fecha_registro, fecha_entrega;
	private VehiculoGeneral datos_vehiculo;
	private EstadoCoche estado; 
	
	public Alquiler(int id, int num_dias, int permiso_cund, LocalDate fecha_registro, VehiculoGeneral datos_vehiculo,
			EstadoCoche estado,LocalDate fecha_entrega) {
		super();
		this.id = id;
		this.num_dias = num_dias;
		this.permiso_cund = permiso_cund;
		this.fecha_registro = fecha_registro;
		this.datos_vehiculo = datos_vehiculo;
		this.estado = estado;
		this.fecha_entrega = fecha_entrega;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNum_dias() {
		return num_dias;
	}

	public void setNum_dias(int num_dias) {
		this.num_dias = num_dias;
	}

	public int getPermiso_cund() {
		return permiso_cund;
	}

	public void setPermiso_cund(int permiso_cund) {
		this.permiso_cund = permiso_cund;
	}

	public LocalDate getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(LocalDate fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public VehiculoGeneral getDatos_vehiculo() {
		return datos_vehiculo;
	}

	public void setDatos_vehiculo(VehiculoGeneral datos_vehiculo) {
		this.datos_vehiculo = datos_vehiculo;
	}

	public EstadoCoche getEstado() {
		return estado;
	}

	public void setEstado(EstadoCoche estado) {
		this.estado = estado;
	}
	public float getPrecioDia() {
		float precio = 0;
		if (this.datos_vehiculo instanceof Coche) {
			precio = 40;
		}
		else if (this.datos_vehiculo instanceof Furgoneta) {
			precio = (float) ((50 + ((Furgoneta) datos_vehiculo).getPma() * 0.05));
		}
		else if (this.datos_vehiculo instanceof Patinete) {
			int dias = this.num_dias;
			precio = 50 + ((dias-1)*30);
		}
		return precio;
	}
	public float getImporteGeneradoPorAlquiler() {
		float importe = 0;
		if (this.datos_vehiculo instanceof Patinete) {
			int dias = this.num_dias;
			importe = getPrecioDia() * dias;
		}
		return importe;
		
	}
}
