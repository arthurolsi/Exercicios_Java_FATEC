
public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c1 = new Conta();
		
		c1.saldo = 10000.0;
		c1.nrAgencia = "1";
		c1.titular = "FULANO";
		c1.nrConta = "01945";
		c1.codBanco = 234;
		
		c1.imprimirDados();
	}

}
