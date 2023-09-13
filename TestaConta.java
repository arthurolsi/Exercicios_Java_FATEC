package ex;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("123456", "Arthur", "123-3", 01);
		
		c1.imprimirDados();
		c1.saque(500);
		c1.imprimirDados();
		c1.deposito(500);
		c1.imprimirDados();
		System.out.println("Saldo: "+ c1.getSaldo());

	}

}
