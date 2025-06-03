package Simulación;

import java.time.LocalDate;
import java.util.HashMap;

public class GestionaSimulacion {
	public static void main(String[] args) {
		HashMap <Remetriculación,Vehiculo> vehiculos = new HashMap<Remetriculación,Vehiculo>();
		Vehiculo v1 = new Vehiculo("1HGBH41JXMN109186", "1234ABC", "Toyota", "Corolla", "Juan Pérez", 2015);
		Vehiculo v2 = new Vehiculo("2HGCM82633A004352", "5678XYZ", "Ford", "Focus", "Lucía Gómez", 2018);
		Vehiculo v3 = new Vehiculo("3CZRE4H59BG700001", "9101QWE", "Honda", "Civic", "Carlos Ruiz", 2020);
		Vehiculo v4 = new Vehiculo("WDBUF56X88B123456", "3456LMN", "Mercedes", "Clase C", "Juan Pérez", 2016);
		
		Remetriculación r1 = new Remetriculación("1HGBH41JXMN109186", "1234ABC", "1111DEF", LocalDate.of(2021, 5, 12));
		Remetriculación r2 = new Remetriculación("2HGCM82633A004352", "5678XYZ", "2222GHI", LocalDate.of(2022, 8, 30));
		Remetriculación r3 = new Remetriculación("3CZRE4H59BG700001", "9101QWE", "3333JKL", LocalDate.of(2023, 3, 10));
		Remetriculación r4 = new Remetriculación("1HGBH41JXMN109186", "1111DEF", "4444MNO", LocalDate.of(2024, 1, 5));
		
		RegistroTrafico r = new RegistroTrafico();
		//r.añadirVehiculo();
		
		vehiculos.put(r1, v1);
		r.filtrarNumBast(v1, r1);
	}

}
