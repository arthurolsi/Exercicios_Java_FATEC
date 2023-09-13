
public class Computador {

	String marca, cor, modelo, serie;
	double valor;
	
	/*Private String marca;
	Private String cor;*/
	
	// Source - Generate Getters and Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public Computador(String marca, String cor) {
		super();
		this.marca = marca;
		this.cor = cor;
	}

	/*// construtor
	public Computador(String marca, String cor) { // VARIAVEIS SÂO DECLARADAS DENTRO DE MÉTODOS
		this.marca = marca;
		this.cor = cor;
	}
	
	// construtor vazio
	public Computador() {
	}*/
	
	// PERGUNTA DE PROVA -> metodos com mesmo nome, com assinaturas (parametros) diferentes, o computador sabe qual ele chama pelos parametros
	// SOBRECARGA, OVERLOAD
	
	// UM OBJETO NÃO PODE MANIPULAR OS ATRIBUTOS DE OUTROS DIRETAMENTE
	// UMA CLASSE N PODE ALTERAR O VALOR DE OUTRA?
	
	// Existem 4 modificadores: Public, Private, Protected e Default
	
	public void imprimirDados() {
		System.out.println("Marca: "+marca);
		System.out.println("Cor do veículo: "+cor);
	}

	
	
}
