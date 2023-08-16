import java.util.Scanner;

public class Ex01Lista04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1) Faça um aplicativo que receba três valores inteiros na linha de comando e
		mostre o maior dentre eles. */ 

		int a, b, c;
		Scanner leitor = new Scanner(System.in);

		System.out.println("Entre com o valor de A");
		a = leitor.nextInt();
		System.out.println("Entre com o valor de B");
		b = leitor.nextInt();
		System.out.println("Entre com o valor de C");
		c = leitor.nextInt();

		if (a > b && a > c) {
			System.out.println("A é o maior número " + a);
		} else if (b > c) {
			System.out.println("B é o maior número " + b);
		} else
			System.out.println("C é o maior número " + c);

	}

}
