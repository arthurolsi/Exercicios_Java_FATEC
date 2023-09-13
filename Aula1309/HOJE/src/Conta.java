

public class Conta {
	
	String nrAgencia;
	String titular;
	String nrConta;
	int codBanco;
	
	public Conta() {
		
	}

	public String getNrAgencia() {
		return nrAgencia;
	}

	public void setNrAgencia(String nrAgencia) {
		this.nrAgencia = nrAgencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNrConta() {
		return nrConta;
	}

	public void setNrConta(String nrConta) {
		this.nrConta = nrConta;
	}

	public int getCodBanco() {
		return codBanco;
	}

	public void setCodBanco(int codBanco) {
		this.codBanco = codBanco;
	}

	 
	public void imprimirDados() {
		 System.out.println("\n----------------------------");
		 System.out.println("AGENCIA:\t"+nrAgencia+"\t BANCO:\t"+codBanco);
		 System.out.println("Conta: \t"+nrConta);
		 System.out.println("TITULAR: \t"+titular);
		 System.out.println("-----------------------------\n");
		 }
	 
	 // FALTA COISA
	 
	 
	 
	 
	 
}