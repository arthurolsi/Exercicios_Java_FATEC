import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a = 10; int b = 20; int c = (a+b);
		 * 
		 * System.out.println("Resultaaaaado = "+c);
		 */

		Scanner leitor = new Scanner(System.in); // Criando objeto /// System.in = dados via teclado

		System.out.println("Digite um nome...");
		String nome = leitor.next();

		System.out.println("Digite sua idade...");
		int idade = leitor.nextInt();

		System.out.println("Nome..." + nome);
		System.out.println("Idade..." + idade);

	}

}
