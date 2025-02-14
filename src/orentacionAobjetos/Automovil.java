package orentacionAobjetos;

public class Automovil extends Vehículo {
	public CalificacionEcologica calificacinEcologica;
    public enum CalificacionEcologica {
    	ECO, O, C , B;
    } 

    // Constructor
    public Automovil(String dueno, int numpuertas, int numruedas, CalificacionEcologica calificacinEcologica) {
        super(dueno, numpuertas, numruedas);  // Llamar al constructor de la clase base
        this.calificacinEcologica = calificacinEcologica;
    }

    // Getter y setter
    public CalificacionEcologica getCalificacinEcologica() {
        return calificacinEcologica;
    }

    public void setCalificacinEcologica(CalificacionEcologica calificacinEcologica) {
    	if (calificacinEcologica.equals(CalificacionEcologica.ECO) || calificacinEcologica.equals(CalificacionEcologica.B) || calificacinEcologica.equals(CalificacionEcologica.C) || calificacinEcologica.equals(CalificacionEcologica.O)) {
    		this.calificacinEcologica = calificacinEcologica;
    }}

    @Override
    public String toString() {
        return super.toString() + ", calificacinEcologica=" + calificacinEcologica + "]";
    }

    // Implementación de la lógica específica
    @Override
    public boolean tienelicenciaparacircular(String ciudad) {
        // Implementa lógica específica si es necesario
        return false;  // Ejemplo básico
    }
}