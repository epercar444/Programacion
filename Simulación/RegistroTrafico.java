package Simulación;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class RegistroTrafico {
	HashMap <Remetriculación,Vehiculo> vehiculos = new HashMap<Remetriculación,Vehiculo>();
	
	public Vehiculo añadirVehiculo (Remetriculación f) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica el número de bastidor del coche que se quiere añadir: ");
		String numbas = sc.next();
		System.out.println("Introduce el número de matrícula: ");
		String matricula = sc.next();
		System.out.println("Indica la marca del coche: ");
		String marca = sc.next();
		System.out.println("Indica el modelo del mismo: ");
		String modelo = sc.next();
		System.out.println("Introduce el año de fabricación: ");
		int fechama = sc.nextInt();
		System.out.println("Por último, indica el nombre del propietario actual: ");
		String propietario = sc.next();
		Vehiculo v = new Vehiculo(numbas,matricula,marca,modelo,propietario,fechama);
		vehiculos.put(registraRematriculacion(v), v);
		return v;

	}
	
	public Remetriculación registraRematriculacion (Vehiculo v) {
		Scanner sc = new Scanner(System.in);
		String numbas = v.getNumbast();
		String maInicial = v.getNumatr();
		LocalDate fecharematriculacion = LocalDate.now();
		System.out.println("Dame la matrícula final del coche a rematricular: ");
		String maFinal = sc.next();
		Remetriculación f = new Remetriculación(numbas,maInicial,maFinal,fecharematriculacion);
		System.out.println(f.toString());
		vehiculos.put(f, añadirVehiculo(f));
		return f;
	}
	
	public void filtrarNumBast(Vehiculo v, Remetriculación f) {
		if (vehiculos.containsValue(v.getNumbast())) {
			System.out.println(v.toString());
		}
		else if (vehiculos.containsKey(f.getNumbas())) {
			System.out.println(f.toString());
		}
	}
	public 
	
	public void vehiculosPorAnyo (LocalDate fecha,Remetriculación f) {
		if (f.getFechaMatriculacion().getYear() == fecha.getYear()) {
			System.out.println(f.toString());
		}
	}
}
