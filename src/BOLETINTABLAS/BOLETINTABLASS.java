package BOLETINTABLAS;

public class BOLETINTABLASS {

	public static void main(String[] args) {
		int tabla1 []= {1,2,3,4};
		int tabla2 []={1,2,0,4};
		
		int i=0;
		boolean iguales = true;
		while (tabla1.length == tabla2.length)
		if (i<tabla1.length) {
				if (tabla1[i]==tabla2[i]) {
					iguales= true;
				i++;}
				else {
					iguales = false;
				i++;
				}}
		else {
			iguales = false;
		
			}
		System.out.println(iguales);
		}
	}


