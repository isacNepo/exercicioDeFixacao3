package entities;

public class Account {
	//atributos da conta(Account)
	private int conta;
	private String titular;
	private double saldo;
	//construtores da classe Account
	public Account(int conta, String titular) {
		this.conta = conta;
		this.titular = titular;
	}
	
	public Account(int conta, String titular, double depositoInicial) {
		this.conta = conta;
		this.titular = titular;
		deposito(depositoInicial);
	}
	//git's e set's da classe
	public int getConta() {
		return conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	//metodos da classe
	public void deposito(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public void saque(double valorSaldo) {
		saldo -= (valorSaldo + 5.00);
	}
	
	public String toString() {
		return "conta " + conta + ",titular: " + titular + ", Saldo: $ " + String.format("%.2f", saldo);
	}
}
