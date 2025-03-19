package Modelo;

public class Desarrollador extends AEmpleado{
	public Desarrollador(String nombre, String identificador, String apellidos, float salario,
			boolean tieneReduccionHoraria, Categoria categoria, int lenguajes, int frameworks) {
		super(nombre, identificador, apellidos, salario, tieneReduccionHoraria, categoria);
		this.lenguajes = lenguajes;
		this.frameworks = frameworks;
	}

	private int lenguajes,frameworks;

	@Override
	public float calculaImporteNomina() {
		float nomina = (float) (lenguajes * 0.01 + frameworks * 0.03);
		return nomina;
	}

	@Override
	public String devuelveFunciones() {
		return "Las funciones de un desarrollador codificar, diseñar planes de pruebas y ejecutarlos";
	}

	@Override
	public String imprimeHorario() {
		if (isTieneReduccionHoraria()) {
		return "La jornada reducida será de 8 a 15";
	}
		else {
		return "Los programadores en dos turnos de 8 a 4 y de 4 a 12";
		}
	}
}
