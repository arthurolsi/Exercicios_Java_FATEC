
public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor[] = new int[3];
		valor[0] = 10;
		valor[1] = 14;
		valor[2] = 13;
		
		String nome[] = {"José", "Ana", "Paula"};
		
		for (int i = 0; i < nome.length; i++) {
			System.out.println(nome[i]);
		}
		
		/////
		
		int populacao[][] = new int [2][3];
		populacao[0][0] = 1000;
		populacao[0][1] = 2000;
		populacao[0][2] = 3000;
		populacao[1][0] = 7000;
		populacao[1][1] = 8000;
		populacao[1][2] = 9000;
		
		for (int linha = 0; linha < populacao.length; linha++) {
			for ( int coluna = 0; coluna < populacao[0].length; coluna++) {
				System.out.println("Estado " + (linha+1) + " Município " + 
						(coluna+1) + " >> " + populacao[linha][coluna]);
			}
		}
	}

}
