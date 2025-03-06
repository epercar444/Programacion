package Modelo;

public class AvesRapaces extends Animaltres{

	public AvesRapaces(String nombre, TipoFamilia tipofamilia, String lugarHabita, Animaltres[] animales_come,
			Animaltres[] animales_comido) {
		super(nombre, tipofamilia, lugarHabita, animales_come, animales_comido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean atacar(Animaltres b) {
		boolean ataca = false;
		if (b.tipofamilia.equals(tipofamilia.SERPIENTE) || b.tipofamilia.equals(tipofamilia.ROEDOR)) {
			ataca = true;
		}
		return ataca;
	}

	@Override
	public boolean huir(Animaltres c) {
		boolean huir = false;
		if (c.tipofamilia.equals(tipofamilia.LEÓN)) {
			huir = true;
		}
		return huir;
	}

}
