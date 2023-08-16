
public class Ex15Lista7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 15) Criar um programa que leia um vetor de inteiros de 20 posições e mostre a
		quantidade de números que são múltiplos de 2. */
		
		int qtd = 0, v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 == 0) {
				qtd++;
			}
		}
		System.out.println(qtd);
	}

}
