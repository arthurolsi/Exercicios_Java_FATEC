package aula2308;

import java.util.Scanner;

public class Ex01Lista7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1) Crie um aplicativo que receba uma frase e mostre-a de forma invertida. */
		
		char[] vetor1 = null;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite uma palavra");
		String palavras = leitor.nextLine();
		leitor.close();
		
		System.out.println(new StringBuilder(palavras).reverse().toString());
		
	}
	
}
