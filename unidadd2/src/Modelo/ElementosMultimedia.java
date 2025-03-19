package Modelo;

public abstract class ElementosMultimedia extends Recurso{
	public ElementosMultimedia(int id, String ubicacion,String genero,String nombre) {
		super(id, ubicacion);
		this.nombre = nombre;
		this.genero = genero;
	}

	protected String nombre;
	protected String genero;
	


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "ElementosMultimedia [nombre=" + nombre + ", genero=" + genero + ", getId()=" + getId()
				+ ", getUbicacion()=" + getUbicacion() + "]";
	}

	

	

}
