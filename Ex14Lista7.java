import java.util.Scanner;

public class Ex14Lista7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 14) Criar um programa que leia dois vetores de inteiros de 10 posições, efetue a soma
		dos valores dos elementos de mesmo índice dos dois vetores colocando o resultado
		em um terceiro vetor. Exiba na tela o vetor resultante. */
		
		int v[] = new int [10];
		int v2[] = new int [10];
		int v3[] = new int [10];
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com 10 valores para o vetor 1");
		for (int i = 0; i < v.length; i++) {
			v[i] = leitor.nextInt();
		}
		
		System.out.println("Entre com 10 valores para o vetor 2");
		for (int i = 0; i < v.length; i++) {
			v2[i] = leitor.nextInt();
		}
		
		for (int i = 0; i < v.length; i++) {
			v3[i] = v[i] + v2[i];
		}
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v3[i]);
		}
	}

}
