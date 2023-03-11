package br.com.banco;

import java.io.Serializable;

public class Conta implements Serializable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int agencia;
	private int numero;
	private double saldo;
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Conta() {
		
	}
	
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void retirar(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

}
