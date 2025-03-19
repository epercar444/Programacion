package Modelo;

public class Tienda extends Pago{
	String [] pagos = new String[100];
	public Tienda(Divisa divisa, EstadoPago estado_pago, int comprasdia) {
		super(divisa, estado_pago);
		this.comprasdia = comprasdia;
	}

	private int comprasdia;

	public int getComprasdia() {
		return comprasdia;
	}

	public void setComprasdia(int comprasdia) {
		this.comprasdia = comprasdia;
	}

	@Override
	public String toString() {
		return "Tienda [comprasdia=" + comprasdia + ", getDivisa()=" + getDivisa() + ", getEstado_pago()="
				+ getEstado_pago() + "]";
	}
}
