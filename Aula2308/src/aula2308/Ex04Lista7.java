package aula2308;
import java.util.Scanner;
public class Ex04Lista7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 4) Uma empresa quer transmitir dados por telefone, mas está preocupada com a
			possibilidade de seus telefones estarem grampeados. Todos seus dados são
			transmitidos como inteiros de quatro dígitos. Eles pedem para você escrever um
			programa que criptografará seus dados de modo que estes possam ser
			transmitidos mais seguramente. Seu aplicativo deve ler um inteiro de quatro
			dígitos inserido pelo usuário na linha de comando e criptografá-lo como segue:
			substitua cada digito por (a soma deste dígito mais 1). Então troque o primeiro
			digito pelo terceiro e troque o segundo pelo quarto. A seguir imprima o inteiro
			criptografado. Escreva um aplicativo separado que recebe como entrada um
			inteiro de quatro dígitos criptografado e o descriptografa para formar o número
			original.
		*/
		
		Scanner leitor = new Scanner(System.in);
		String numero;
		
		System.out.println("Informe o dado de quatro dígitos...");
		numero = leitor.next();
		
		int a, b, c, d;
		
		a = Integer.parseInt(numero.substring(0,1))+1;
		b = Integer.parseInt(numero.substring(1,2))+1;
		c = Integer.parseInt(numero.substring(2,3))+1;
		d = Integer.parseInt(numero.substring(3,4))+1;
		
		if(a == 10) {
			a = 0;
		}
		if(b == 10) {
			b = 0;
		}
		if(c == 10) {
			c = 0;
		}
		if(d == 10) {
			d = 0;
		}
		
		System.out.println("Resultado: " + c+d+a+b);
	}

}
