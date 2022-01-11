package entities;

import model.exception.Excecao;

public abstract class Conta implements Iconta {
	
	protected Integer agencia;
	protected Integer numero;
	protected Double saldo;
	protected Double limiteSaque;
	private String nome;
	

	public Conta() {
		
	}
	
	public Conta(Integer agencia, Integer numero, Double saldo, Double limiteSaque, String nome) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
		this.nome = nome;
	}

	
	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void sacar(double valor) {
		validarSaque(valor);
		this.saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}

	public void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.nome));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println("Saldo: " + this.saldo);

	}

	@Override
	public void validarSaque(double valor) {
		if (valor > getLimiteSaque()) {
			throw new Excecao("Erro de saque: O valor excede o limite de saque.");
		}
		if (valor > getSaldo()) {
			throw new Excecao("Erro de saque: Saldo insuficiente.");
		}
		
	}

}
