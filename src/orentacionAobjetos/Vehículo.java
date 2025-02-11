package orentacionAobjetos;

public class Vehículo {
    private String dueno;
    private int numpuertas;
    private int numruedas;

    // Constructor
    public Vehículo(String dueno, int numpuertas, int numruedas) {
        this.dueno = dueno;
        this.numpuertas = numpuertas;
        this.numruedas = numruedas;
    }

    // Getters y setters
    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public int getNumpuertas() {
        return numpuertas;
    }

    public void setNumpuertas(int numpuertas) {
        this.numpuertas = numpuertas;
    }

    public int getNumruedas() {
        return numruedas;
    }

    public void setNumruedas(int numruedas) {
        this.numruedas = numruedas;
    }

    @Override
    public String toString() {
        return "Vehiculo [dueno=" + dueno + ", numpuertas=" + numpuertas + ", numruedas=" + numruedas + "]";
    }

    public boolean tienelicenciaparacircular(String ciudad) {
        // Implementar la lógica si es necesario
        return false; // Ejemplo básico
    }
}
