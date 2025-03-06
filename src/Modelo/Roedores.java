package Modelo;

public class Roedores extends Animaltres{

	public Roedores(String nombre, TipoFamilia tipofamilia, String lugarHabita, Animaltres[] animales_come,
			Animaltres[] animales_comido) {
		super(nombre, tipofamilia, lugarHabita, animales_come, animales_comido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean atacar(Animaltres b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean huir(Animaltres c) {
		boolean huir = false;
		if (c.tipofamilia.equals(tipofamilia.SERPIENTE)) {
			huir = true;
		}
		return huir;
	}


}
