package Biblioteca;

public class Libro {
	private String titulo,autor,genero;
	private int anio_pub;
	private EstadoLibro estadolibro;
	public Libro(String titulo, String autor, String genero, int anio_pub, EstadoLibro estadolibro) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.anio_pub = anio_pub;
		this.estadolibro = estadolibro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAnio_pub() {
		return anio_pub;
	}
	public void setAnio_pub(int anio_pub) {
		this.anio_pub = anio_pub;
	}
	public EstadoLibro getEstadolibro() {
		return estadolibro;
	}
	public void setEstadolibro(EstadoLibro estadolibro) {
		this.estadolibro = estadolibro;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", anio_pub=" + anio_pub
				+ ", estadolibro=" + estadolibro + "]";
	}
	
}
