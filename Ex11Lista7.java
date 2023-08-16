import java.util.Scanner;
public class Ex11Lista7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 11) Dado um vetor v = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50}, criar
		um programa a que leia um número e verifique e imprima na tela se este número
		existe no vetor. */
		
		int a, i, v[] = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50};
		boolean existe = false;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com um valor");
		a = leitor.nextInt();
		
		for (i = 0; i < v.length; i++) {
			if (v[i] == a) {
				System.out.println("EXISTE!");
				existe = true;
				break;
			}
		}
		if (existe == false) System.out.println("NÃO EXISTE!");
	}

}
