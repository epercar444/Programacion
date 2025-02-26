package Modelo;

import java.time.LocalDate;

public class CuentaBancaria {
	private static int contador = 0;
	private int saldo;
	private int iban;
	private LocalDate fecha_apertura;
	private int id;
	private Cliente titular;
	private Cliente autorizado;
	public CuentaBancaria(int saldo, int iban, LocalDate fecha_apertura,Cliente titular,
			Cliente autorizado) {
		super();
		this.saldo = saldo;
		this.iban = iban;
		this.fecha_apertura = fecha_apertura;
		this.id = contador+1;
		contador = contador + 1;
		this.titular = titular;
		this.autorizado = autorizado;
	}
	
	public Cliente getAutorizado() {
		return autorizado;
	}
	public void setAutorizado(Cliente autorizado) {
		this.autorizado = autorizado;
	}
	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + ", iban=" + iban + ", fecha_apertura=" + fecha_apertura + ", id=" + id
				+ ", titular=" + titular + ", autorizado=" + autorizado + "]";
	}
	
}
