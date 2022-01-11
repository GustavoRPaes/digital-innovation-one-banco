package entities;

public class ContaPoupanca extends Conta {

	private Double taxaDeJuros;

	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(Integer agencia, Integer numero, Double saldo, Double limiteSaque, String nome,
			Double taxaDeJuros) {
		super(agencia, numero, saldo, limiteSaque, nome);
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * taxaDeJuros;
	}
	
	@Override
	public void sacar(double valor) {
		validarSaque(valor);
		saldo -= valor;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();

	}

}
