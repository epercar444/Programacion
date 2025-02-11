package orientacionAobjetos;

public class CocheElectrico {
	public class CocheElectrico extends Automovil {
	    private String tipoBateria;

	    public CocheElectrico(String marca, String modelo, int año, String tipoBateria) {
	        super(marca, modelo, año);
	        setTipoBateria(tipoBateria);
	    }

	    public String getTipoBateria() {
	        return tipoBateria;
	    }

	    public void setTipoBateria(String tipoBateria) {
	        if (tipoBateria.equals("LFP") || tipoBateria.equals("NCM")) {
	            this.tipoBateria = tipoBateria;
	        } else {
	            this.tipoBateria = "Desconocido";
	        }
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", Tipo de Batería: " + tipoBateria;
	    }
	}
ss
}
