package Modelo;

public class Serpiente extends Animaltres{

	public Serpiente(String nombre, TipoFamilia tipofamilia, String lugarHabita, Animaltres[] animales_come,
			Animaltres[] animales_comido) {
		super(nombre, tipofamilia, lugarHabita, animales_come, animales_comido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean atacar(Animaltres b) {
		boolean ataca = false;
		if (b.tipofamilia.equals(tipofamilia.ROEDOR)) {
			ataca = true;
		}
		return ataca;
	}


	@Override
	public boolean huir(Animaltres c) {
		// TODO Auto-generated method stub
		return false;
	}

}
