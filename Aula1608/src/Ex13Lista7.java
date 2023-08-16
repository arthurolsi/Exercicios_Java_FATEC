import java.util.Scanner;
public class Ex13Lista7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 13) Criar um programa que leia um vetor de inteiros de 10 posições e efetue a soma
		somente dos elementos ímpares */
		
		int b = 0, v[] = new int [10];
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com 10 valores");
		
		for (int i = 0; i < v.length; i++) {
			v[i] = leitor.nextInt();
		}
		
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 != 0) {
				b = b + v[i];
			}
		}
		
		System.out.println(b);
	}

}
