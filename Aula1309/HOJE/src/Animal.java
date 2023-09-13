
public class Animal {

	String nome;
	float comprimento;
	int numPatas;
	String cor;
	String ambiente;
	float velMedia;
	
	public Animal() {
		
	}
	
	public Animal(String nome, float comprimento, int numPatas, String cor, String ambiente, float velMedia) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numPatas = numPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velMedia = velMedia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public float getVelMedia() {
		return velMedia;
	}

	public void setVelMedia(float velMedia) {
		this.velMedia = velMedia;
	}
	
	public void dados() {
		System.out.println("=========== Relatório animal ===========");
		System.out.println("Nome: "+nome);
		System.out.println("Comprimento: "+comprimento);
		System.out.println("Número de patas: "+numPatas);
		System.out.println("Cor: "+cor);
		System.out.println("Ambiente: "+ambiente);
		System.out.println("Velocidade média: "+velMedia);
	}
}
