import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in); // Criando objeto /// System.in = dados via teclado

		System.out.println("Digite o primeiro nome");
		String nome1 = leitor.next();
		
		System.out.println("Digite o segundo nome");
		String nome2 = leitor.next();
		
		System.out.println("Digite o terceiro nome");
		String nome3 = leitor.next();
		
		System.out.print(nome1);
		System.out.println(nome3);
		System.out.println(nome2);

	}

}
