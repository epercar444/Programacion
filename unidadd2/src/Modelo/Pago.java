package Modelo;

public class Pago implements IPago{
	private Divisa divisa;
	private EstadoPago estado_pago;
	public Pago(Divisa divisa, EstadoPago estado_pago) {
		super();
		this.divisa = divisa;
		this.estado_pago = estado_pago;
	}

	public Divisa getDivisa() {
		return divisa;
	}

	public void setDivisa(Divisa divisa) {
		this.divisa = divisa;
	}

	public EstadoPago getEstado_pago() {
		return estado_pago;
	}

	public void setEstado_pago(EstadoPago estado_pago) {
		this.estado_pago = estado_pago;
	}

	@Override
	public boolean validarMetodoPago() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean realizarPago() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
