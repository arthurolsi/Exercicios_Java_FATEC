import java.util.Scanner;

public class Ex12Lista7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 12) Dado um vetor v = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9}, criar um
		programa que leia um número e informe na tela quantas vezes este número foi
		encontrado no vetor*/
		
		int qtd = 0, a, i, v[] = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9};
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com um valor");
		a = leitor.nextInt();
		
		for (i = 0; i < v.length; i++) {
			if (v[i] == a) {
				qtd++;
			}
		}
		
		System.out.println("O número " + a + " foi exibido " + qtd + " vezes.");
		
	}

}
