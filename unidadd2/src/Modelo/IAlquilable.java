package Modelo;

import java.time.LocalDate;

public interface IAlquilable {
	boolean estaAlquilado();
	boolean estaAlquiladoenFechaDeterminada();
	float getPrecioporDia();
}
