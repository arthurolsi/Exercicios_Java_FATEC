
public class Mamifero extends Animal{
	
	String alimento;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String alimento, String nome, float comprimento, int numPatas, String cor, String ambiente, float velMedia) {
		super(nome, comprimento, numPatas, cor, ambiente, velMedia);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public void dadosMamifero() {
		super.dados();
		System.out.println("Característica: "+alimento);
		System.out.println("========================================");

	}
}
