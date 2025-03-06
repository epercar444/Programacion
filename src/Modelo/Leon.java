package Modelo;

public class Leon extends Animaltres{

	public Leon(String nombre, TipoFamilia tipofamilia, String lugarHabita, Animaltres[] animales_come,
			Animaltres[] animales_comido) {
		super(nombre, tipofamilia, lugarHabita, animales_come, animales_comido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean atacar(Animaltres b) {
		boolean ataca = true;
		if (b.tipofamilia.equals(tipofamilia.LEÓN)) {
			ataca = false;
		}
		return ataca;
	}

	@Override
	public boolean huir(Animaltres c) {
		// TODO Auto-generated method stub
		return false;
	}

}
