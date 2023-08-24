package aula2308;

public class Ex02Lista7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 2) Crie um aplicativo que mostre o efeito abaixo:
		   
		    J
			Ja
			Jav
			Java
			Jav
			Ja
			J
			
		*/

		char v[] = {'J','A','V','A'};
		//String v = "JAVA";
		//char[] letras = v.toCharArray();
		
		for(int i = 0; i < v.length; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(v[j]);
			}
			System.out.println();
		}
		
		for(int i = v.length;i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print(v[j]);
			}
			System.out.println();
		}
	}

}
