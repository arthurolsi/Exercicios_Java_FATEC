import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in); // Criando objeto /// System.in = dados via teclado

		System.out.println("Digite a quantidade 1");
		Float quantidade1 = leitor.nextFloat();
		
		System.out.println("Digite o valor 1");
		Float valor1 = leitor.nextFloat();
		
		System.out.println("Digite a quantidade 2");
		Float quantidade2 = leitor.nextFloat();
		
		System.out.println("Digite o valor 2");
		Float valor2 = leitor.nextFloat();
		
		System.out.println("Digite a quantidade 3");
		Float quantidade3 = leitor.nextFloat();
		
		System.out.println("Digite o valor 3");
		Float valor3 = leitor.nextFloat();
		
		float total = (quantidade1 * valor1) + (quantidade2 * valor2) + (quantidade3 * valor3);
		System.out.println("Total = " + total);

	}

}
