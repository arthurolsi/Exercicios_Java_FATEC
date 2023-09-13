
public class TestaConta {

	public static void main(String[] args) {
	
		Conta c = new Conta();
		
		c.saldo = 10000.0;
		c.nrAgencia = "1";
		c.titular = "FULANO";
		c.nrConta = "01945";
		c.codBanco = 234;
		
		c.imprimirDadosConta();

	}

}
