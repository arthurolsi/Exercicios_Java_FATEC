package ex;

public class Conta {
	
	double saldo;
	String nrAgencia;
	String titular;
	String nrConta;
	int codBanco;
	
	public Conta(String nrAgencia, String titular, String nrConta, int codBanco) { // Construtor
		this.saldo = 0.0;
		this.nrAgencia = nrAgencia;
		this.titular = titular;
		this.nrConta = nrConta;
		this.codBanco = codBanco;
	}
	
	 public void imprimirDados() {
		 System.out.println("\n----------------------------");
		 System.out.println("AGENCIA:\t"+nrAgencia+"\t BANCO:\t"+codBanco);
		 System.out.println("Conta: \t"+nrConta);
		 System.out.println("TITULAR: \t"+titular);
		 System.out.println("SALDO: \t"+saldo);
		 System.out.println("-----------------------------\n");
		 }

	
	public void saque(double valor) {
		if(valor > 0) {
			if(saldo >= valor) {
				saldo -= valor;
				System.out.println("Sucesso! O valor de "+valor+" foi sacado. Resta "+ saldo);
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		else {
			System.out.println("O valor do saque deve ser positivo!");
		}
	}
	
	public void deposito(double valor) {
		if(valor > 0) {
			saldo += valor;
			System.out.println("Sucesso! O valor de "+valor+" foi depositado");
		}
		else {
			System.out.println("O valor para depósito deve ser positivo.");
		}
	}
	
	double getSaldo() {
		return saldo;
	}
}
