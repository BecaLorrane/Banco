package entitites;

public class Banco {
	private int numeroDaConta;
	private String nomeTitular;
	private double valorDepositoInicial;
	private double deposito, saque, saldo;

	public Banco(int numeroConta, String nomeTitular) {
		this.nomeTitular = nomeTitular;
		this.numeroDaConta = numeroConta;
	}

	public double depositoInicial() {
		return valorDepositoInicial;
	}
	public double deposito() {
		return deposito = deposito + valorDepositoInicial;
	}

	public double saque() {
		return saque = (deposito - saque) - 5;
	}
	public double saldo() {
		return saldo = saldo + deposito + valorDepositoInicial - saque;
	}
	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getValorDepositoInicial() {
		return valorDepositoInicial;
	}

	public void setValorDepositoInicial(double valorDepositoInicial) {
		this.valorDepositoInicial = valorDepositoInicial;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
