package Simulación;

import java.time.LocalDate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RegistroTrafico {
	HashMap <Remetriculación,Vehiculo> vehiculos = new HashMap<Remetriculación,Vehiculo>();
	
	public void añadirVehiculo () {
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
		Remetriculación r = registraRematriculacion(v);
		vehiculos.put(r, v);
		System.out.println(vehiculos.keySet());
		System.out.println(vehiculos.values());
	}
	
	public Remetriculación registraRematriculacion (Vehiculo v) {
		Scanner sc = new Scanner(System.in);
		String numbas = v.getNumbast();
		String maInicial = v.getNumatr();
		LocalDate fecharematriculacion = LocalDate.now();
		System.out.println("Dame la matrícula final del coche a rematricular: ");
		String maFinal = sc.next();
		Remetriculación f = new Remetriculación(numbas,maInicial,maFinal,fecharematriculacion);
		return f;
	}
	public Set<String> propietario(String propietario) {
		Set <String> matriculas = new TreeSet<String>();
		for (Vehiculo v1 : vehiculos.values()) {
			if (v1.getPropietario().equals(propietario)) {
				matriculas.add(v1.getNumatr());
			}
		}
		return matriculas;
	}
	
	public void filtrarNumBast(Vehiculo v, Remetriculación f) {
		if (vehiculos.containsValue(v.getNumbast())) {
			System.out.println(v.toString());
		}
		else if (vehiculos.containsKey(f.getNumbas())) {
			System.out.println(f.toString());
		}
	} 
	
	public void vehiculosPorAnyo (LocalDate fecha,Remetriculación f) {
		if (f.getFechaMatriculacion().getYear() == fecha.getYear()) {
			System.out.println(f.toString());
		}
	}
	
		public void mostrarRematriculaciones(Vehiculo v) {
		    Iterator<Remetriculación> it = vehiculos.keySet().iterator();
		    while (it.hasNext()) {
		        Remetriculación r = it.next();
		        if (r.getNumbas().equals(v.getNumbast())) {
		        	System.out.println(r.toString());
		        }
		    }
		}

	}

