package Modelo;

public class Detergente extends Producto implements ILiquido,IDescuentos{
	public Detergente(int id, String nombre, String descripcion, float peso, float precioventa, float preciocompra,
			float iva_aplicable,String marca,TipoDetergente tipodetergente, TipoRopa tirporopa) {
		super(id, nombre, descripcion, peso, precioventa, preciocompra, iva_aplicable);
		this.marca = marca;
		this.tipodetergente = tipodetergente;
		this.tirporopa = tirporopa;
	}
	private String marca;
	private TipoDetergente tipodetergente;
	private TipoRopa tirporopa;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public TipoDetergente getTipodetergente() {
		return tipodetergente;
	}
	public void setTipodetergente(TipoDetergente tipodetergente) {
		this.tipodetergente = tipodetergente;
	}
	public TipoRopa getTirporopa() {
		return tirporopa;
	}
	public void setTirporopa(TipoRopa tirporopa) {
		this.tirporopa = tirporopa;
	}
	@Override
	public void setDescuento(double des) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getPrecioDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setVolumen(double v) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setTipoEnvase(String env) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getTipoEnvase() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public float precioConIVA() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float precioconIVA() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
