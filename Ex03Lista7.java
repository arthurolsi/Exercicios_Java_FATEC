package aula2308;
import java.util.Scanner;
public class Ex03Lista7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 3) Crie uma classe que leia um parâmetro passado na linha de comando no
			seguinte formato: dd/mm/aaaa. Desta maneira, a classe devera ser executada
			como java Exe04 11/09/2001. A saída gerada por essa execução deve ser a
			impressão separada do dia, do mês e do ano - utilizando apenas os métodos da
			classe String.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira uma data");
		String data = leitor.next();
		
		System.out.println("Dia: " + data.substring(0, 2));
		System.out.println("Mês: " + data.substring(3, 5));
		System.out.println("Ano: " + data.substring(6, 10));
		
	}

}
