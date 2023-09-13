
public class Poupanca extends Conta {
	private double saldo;
	
	public Poupanca() {
		
	}
	
	public double getSaldo() {
		return saldo;
	}

	
	
	
	public Poupanca(double saldo, String nrAgencia, String titular, int codBanco) {
		// chama o construtor da classe mãe
		super(nrAgencia, titular, nrConta, codBanco); //O SUPER SEMPRE É A PRIMEIRA LINHA!!!!
		this.saldo = saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void imprime() {
		super.imprimirDados();
		System.out.println("Saldo... " +saldo);
	}
}


// FALTA COISA
