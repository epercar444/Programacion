package Modelo;

public abstract class Producto {
	private int id;
	private String nombre,descripcion;
	private float peso,precioventa,preciocompra,iva_aplicable;
	public Producto(int id, String nombre, String descripcion, float peso, float precioventa, float preciocompra,
			float iva_aplicable) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.peso = peso;
		this.precioventa = precioventa;
		this.preciocompra = preciocompra;
		this.iva_aplicable = iva_aplicable;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", peso=" + peso
				+ ", precioventa=" + precioventa + ", preciocompra=" + preciocompra + ", iva_aplicable=" + iva_aplicable
				+ "]";
	}
	public abstract float precioConIVA();
	public abstract float precioconIVA();
}
