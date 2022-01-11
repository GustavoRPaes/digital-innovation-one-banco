package entities;

public class ContaCorrente extends Conta {

	//variavel limite de emprestimo disponivel apenas para Conta Corrente
	private Double limiteEmprestimo;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Integer agencia, Integer numero, Double saldo, Double limiteSaque, String nome,
			Double limiteEmprestimo) {
		super(agencia, numero, saldo, limiteSaque, nome);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	
	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(double valor) {
		if (valor <= limiteEmprestimo) { //Testa para ver se o valor é menor ou igual ao limite de emprestimo
			saldo += valor - 10.0; 
		}
	}
	
	@Override 
	public void sacar (double valor) {
		super.sacar(valor);
		saldo -= 2.0; //taxa de saque conta corrente
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

}
