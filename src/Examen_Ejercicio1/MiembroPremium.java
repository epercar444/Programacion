package Examen_Ejercicio1;

public class MiembroPremium extends MiembroBase{
	private TipoPremium tipopremium;
	private static int maximoAmigos = 3;

	public MiembroPremium(String email, String nombre,TipoPremium tipopremium) {
		super(email, nombre);
		this.tipopremium = tipopremium;
		amigos = new MiembroBase[maximoAmigos];
	}

	public TipoPremium getTipopremium() {
		return tipopremium;
	}


	public void setTipopremium(TipoPremium tipopremium) {
		this.tipopremium = tipopremium;
	}


	@Override
	public String getTipoUsuario() {
		return "Premium: " + tipopremium;
	}

	@Override
	public String toString() {
		return "MiembroPremium [getTipoUsuario()=" + getTipoUsuario() + ", getId()=" + getId() + ", getEmail()="
				+ getEmail() + ", getNombre()=" + getNombre() + "]";
	}


	

}
