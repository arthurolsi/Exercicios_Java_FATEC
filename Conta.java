
public class Conta {
	
	double saldo;
	String nrAgencia;
	String titular;
	String nrConta;
	int codBanco;
	
	public void imprimirDados() {
		System.out.println("AGENCIA: "+nrAgencia + " BANCO: " +codBanco);
		System.out.println("CONTA CORRENTE: "+nrConta);
		System.out.println("TITULAR: "+titular);
		System.out.println("SALDO: "+saldo);
	}
}
