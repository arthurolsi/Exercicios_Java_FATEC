
public class Peixe extends Animal {

	String caracteristica;
	
	public Peixe() {
		
	}
	
	public Peixe(String caracteristica, String nome, float comprimento, int numPatas, String cor, String ambiente, float velMedia) {
		super(nome, comprimento, numPatas, cor, ambiente, velMedia);
		this.caracteristica = caracteristica;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public void dadosPeixe() {
		super.dados();
		System.out.println("Característica: "+caracteristica);
		System.out.println("========================================");
	}

}
