package Modelo;

public class JefeProyecto extends AEmpleado{
	public JefeProyecto(String nombre, String identificador, String apellidos, float salario,
			boolean tieneReduccionHoraria, Categoria categoria, int certificaciones, boolean hablaingles) {
		super(nombre, identificador, apellidos, salario, tieneReduccionHoraria, categoria);
		this.hablaingles = hablaingles;
		this.certificaciones = certificaciones;
	}
	private boolean hablaingles;
	private int certificaciones;
	@Override
	public float calculaImporteNomina() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String devuelveFunciones() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String imprimeHorario() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
