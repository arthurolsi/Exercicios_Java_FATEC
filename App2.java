import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// float a = 0; float b = 0; float media = 0;

		Scanner leitor = new Scanner(System.in); // Criando objeto /// System.in = dados via teclado

		System.out.println("Digite a primeira nota");
		float a = leitor.nextFloat();

		System.out.println("Digite a segunda nota");
		float b = leitor.nextFloat();

		System.out.println("Média = " + ((a + b) / 2));

	}

}
