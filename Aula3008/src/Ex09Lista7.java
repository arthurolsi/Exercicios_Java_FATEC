import java.util.Scanner;
public class Ex09Lista7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner (System.in);
		String palavra = "", aux1, aux2;
		
		System.out.println("Digite algo...");
		palavra = leitor.next();
		palavra.toLowerCase();
		
		String reverso = new StringBuilder(palavra).reverse().toString();
		if (palavra.intern() == reverso.intern()) {
			System.out.println(palavra + " é um palíndromo!");
		}
		else {
			System.out.println(palavra + " não é um palíndromo!");
		}
	}
}
