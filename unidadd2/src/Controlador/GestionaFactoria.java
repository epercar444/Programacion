package Controlador;

import java.util.Arrays;

import Modelo.*;

public class GestionaFactoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soldador s1 = new Soldador (0, null, 0, null, null, null, 0, null);
		Ensamblador e1 = new Ensamblador(0, null, 0, null, null, null);
		Pintor p1 = new Pintor (0, null, 0, null, null, null);
		Robot [] robots = new Robot [20];
		int contador = 0;
		robots [contador] = s1;
		contador += 1;
		robots [contador] = e1;
		contador += 1;
		robots [contador] = p1;
		System.out.println(Arrays.toString(robots));
		
		Sensores s2 = new Sensores (0, 0, null, null, 0);
		PuertaAutomática p2 = new PuertaAutomática(0, 0, null, null);
		CamaraSeguridad c1 = new CamaraSeguridad(0, 0, null, null);
		DispositivosWIFI [] dispositivos = new DispositivosWIFI [40];
		int contador2 = 0;
		dispositivos [contador2] = s2;
		contador2 += 1;
		dispositivos [contador2] = p2;
		contador2 += 1;
		dispositivos [contador2] = c1;
		System.out.println(Arrays.toString(dispositivos));
	}

}
