import java.util.Scanner;
public class Ex03Lista04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 3) Faça um aplicativo que calcule o produto dos inteiros ímpares de 1 a 15 e
		exiba o resultado na tela. */
		
		int a, b = 1;
		
		for(a = 1; a < 16; a++){
			if(a%2 != 0) {
				b = b * a;
			}
			System.out.println(b);
		}
	}

}
