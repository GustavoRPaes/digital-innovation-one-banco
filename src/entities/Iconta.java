package entities;

public interface Iconta {

	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void validarSaque(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
}
