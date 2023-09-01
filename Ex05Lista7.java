import java.util.Scanner;
public class Ex05Lista7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b = 1;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número");
		a = leitor.nextInt();
		b = a;
		
		while (a > 1){ 
            b = b *(a-1);
            a--;
		}
		if (b == 0)
			b = 1;
		System.out.println(b);
	}
}
