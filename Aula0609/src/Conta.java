
public class Conta {

	double saldo;
	String nrAgencia;
	String titular;
	String nrConta;
	int codBanco;
	
	
	// Criar Getters e Setters
	public double getSaldo() {
		return saldo;
	}
	
	public void imprimirDadosConta() {
		System.out.println("AGENCIA: " + nrAgencia + " BANCO: " + codBanco);
		System.out.println("CONTA CORRENTE: " + nrConta);
		System.out.println("TITULAR: " + titular);
		System.out.println("SALDO: " + saldo);
	}

}
