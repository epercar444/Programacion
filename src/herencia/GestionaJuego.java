package herencia;

public class GestionaJuego {
public static void main(String[] args) {
	Villano pablo=new Villano("Pablo", 10, 100);
	Mago julian= new Mago ("Julian",12,50);
	Caballero c1= new Caballero ("Agapito",9,150);
	Arquero a1= new Arquero("Ussop",6,120);
	System.out.println(pablo.getArma());
	julian.esatacado(pablo);
	System.out.println(pablo.esatacado(c1));
	System.out.println(a1.esatacado(c1));
	System.out.println(c1);
	System.out.println(a1);
	System.out.println(julian);
	System.out.println(pablo);
	System.out.println(julian.esatacado(a1));
}
}
