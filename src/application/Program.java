package application;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;
import model.exception.Excecao;

public class Program {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente(1001, 013, 1000.0, 300.0, "Pedro Rodrigues", 100.0);
		cc.depositar(500.00);
		cc.sacar(300.0);
		cc.imprimirExtrato();

		Conta cp = new ContaPoupanca(1002, 015, 2500.0, 600.0, "Laiara Pereira", 0.01);
		cp.depositar(750.00);
		cp.sacar(300.00);
		cp.imprimirExtrato();

	}

}
