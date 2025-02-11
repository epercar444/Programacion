package orentacionAobjetos;

public class Camion extends Vehículo {
    private int tonelajekilos;
    private int numpasajeros;
    private int numejes;

    // Constructor
    public Camion(String dueno, int numpuertas, int numruedas, int tonelajekilos, int numpasajeros, int numejes) {
        super(dueno, numpuertas, numruedas);  // Llamar al constructor de la clase base
        this.tonelajekilos = tonelajekilos;
        this.numpasajeros = numpasajeros;
        this.numejes = numejes;
    }

    // Getters y setters
    public int getTonelajekilos() {
        return tonelajekilos;
    }

    public void setTonelajekilos(int tonelajekilos) {
        this.tonelajekilos = tonelajekilos;
    }

    public int getNumpasajeros() {
        return numpasajeros;
    }

    public void setNumpasajeros(int numpasajeros) {
        this.numpasajeros = numpasajeros;
    }

    public int getNumejes() {
        return numejes;
    }

    public void setNumejes(int numejes) {
        this.numejes = numejes;
    }

    @Override
    public String toString() {
        return super.toString() + ", tonelajekilos=" + tonelajekilos + ", numpasajeros=" + numpasajeros + ", numejes=" + numejes + "]";
    }
}
