package Modelo;

public abstract class VehiculoCombustible extends VehiculoGeneral{
	public VehiculoCombustible(int id, Alquiler[] alquileres, boolean estaDisponible,String matricula,boolean es_diesel, String marca, String modelo) {
		super(id, alquileres, estaDisponible);
		this.matricula = matricula;
		this.es_diesel = es_diesel;
		this.marca = marca;
		this.modelo = modelo;
	}
	private String matricula;
	private boolean es_diesel;
	private String marca,modelo;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public boolean isEs_diesel() {
		return es_diesel;
	}
	public void setEs_diesel(boolean es_diesel) {
		this.es_diesel = es_diesel;
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
}
