package Modelo;

public abstract class Recurso implements IPrestable{
	private int id;
	private String ubicacion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Recurso(int id, String ubicacion) {
		super();
		this.id = id;
		this.ubicacion = ubicacion;
	}
	
	

}
