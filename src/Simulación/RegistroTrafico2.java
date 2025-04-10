package Simulación;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RegistroTrafico2 {
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
	public List<String> getMatriculaPorPropietario(String propietario) { //ordenar por matriculas
		List <String> matriculas = new ArrayList<String>();
		for (Vehiculo v1 : vehiculos.values()) {
			if (v1.getPropietario().equals(propietario)) {
				matriculas.add(v1.getNumatr());
			}
		}
		Collections.sort(matriculas);
		return matriculas;
	}
	
	public List<Vehiculo> getVehiculoPorPropietario (String propietario) { //ordenar por vehiculos
		List <Vehiculo> vehiculos1 = new ArrayList<Vehiculo>();
		for (Vehiculo v1 : vehiculos.values()) {
			if (v1.getPropietario().equals(propietario)) {
				vehiculos1.add(v1);
			}
		}
		Collections.sort(vehiculos1);
		return vehiculos1;
	}
	
	public List<Vehiculo> getVehiculoPorNumBast(String numbast) {
		List <Vehiculo> vehiculos1 = new ArrayList<Vehiculo>();
		Set <Map.Entry<Remetriculación, Vehiculo>> entry = vehiculos.entrySet();
		Iterator<Entry<Remetriculación, Vehiculo>> it = entry.iterator();
		while (it.hasNext()) {
			Entry<Remetriculación,Vehiculo> pareja = it.next();
			if (pareja.getValue().getNumbast().equals(numbast)) {
				vehiculos1.add(pareja.getValue());
			}
		}
		return vehiculos1;
	} 
	
	public List<Vehiculo> getVehiculosPorAnyo (LocalDate fecha,Remetriculación f) {
			List <Vehiculo> vehiculos1 = new ArrayList<Vehiculo>();
			Set <Map.Entry<Remetriculación, Vehiculo>> entry = vehiculos.entrySet();
			Iterator<Entry<Remetriculación, Vehiculo>> it = entry.iterator();
			while (it.hasNext()) {
				Entry<Remetriculación,Vehiculo> pareja = it.next();
				if (pareja.getKey().getFechaMatriculacion().getYear() == fecha.getYear()) {
					vehiculos1.add(pareja.getValue());
				}
			}
			return vehiculos1;
		} 
		
	
	
		public List<Remetriculación> getRematriculacionesPorVehiculo(Vehiculo v) {
			List <Remetriculación> rematriculacion = new ArrayList<Remetriculación>();
			Set <Map.Entry<Remetriculación, Vehiculo>> entry = vehiculos.entrySet();
			Iterator<Entry<Remetriculación, Vehiculo>> it = entry.iterator();
			while (it.hasNext()) {
				Entry<Remetriculación,Vehiculo> pareja = it.next();
				if (pareja.getKey().getNumbas().equals(v.getNumbast())) {
					rematriculacion.add(pareja.getKey());
				}
			}
			return rematriculacion;
		} 

	}


