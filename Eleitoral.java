package ex;

public class Eleitoral {

	String nome;
	int idade;
	
	public Eleitoral(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void verificar() {
		if(idade < 16) {
			System.out.println("O eleitor não pode votar");
		}
		else if(idade >= 16 && idade <= 65) {
			System.out.println("O eleitor deve votar");
		}
		else if(idade > 65) {
			System.out.println("Voto facultativo");
		}
		else {
			System.out.println("Inválido!");
		}
	}
	
	public void imprimir() {
		System.out.println("Nome do eleitor: "+nome);
		System.out.println("idade do eleitor: "+idade);
		verificar();

	}
	
	
}
