import java.util.Random;
import java.util.Scanner;

public class Ex04Lista04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4) Crie uma classe que gere um numero aleatório entre os valores máximo e
		mínimo recebidos do usuário na linha de comando. */
		
		Random random = new Random();
		int aleatorio, max, min;

		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o limite máximo...");
		max = leitor.nextInt();
		System.out.println("Informe o limite mínimo...");
		min = leitor.nextInt();

		aleatorio = random.nextInt(min, max++);
		System.out.println("Número gerado: " + aleatorio);
	}

}
