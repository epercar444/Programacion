package Modelo;

import java.time.LocalDate;

public class CuentaBancaria {
	private static int contador = 0;
	private double saldo;
	private int iban;
	private LocalDate fecha_apertura;
	private int id;
	private Cliente titular;
	private Cliente autorizado;
	public CuentaBancaria(double saldo, int iban, LocalDate fecha_apertura,Cliente titular) {
		super();
		this.saldo = saldo;
		this.iban = iban;
		this.fecha_apertura = fecha_apertura;
		this.id = id+1;
		contador = contador + 1;
		this.titular = titular;
	}
	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + ", iban=" + iban + ", fecha_apertura=" + fecha_apertura + ", id=" + id
				+ ", titular=" + titular + ", autorizado=" + autorizado + "]";
	}
	
}
