
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Computador pc = new Computador("Multilaser", "Preto");
		
		/*/*pc.marca = "Multilaser";
		pc.cor = "Preto";
		pc.modelo = "M1";
		pc.serie = "01";
		pc.valor = 10000.0;*/
		
		
		// Usando get e set
		pc.setCor("Verde");
		pc.setMarca("Dell");
		System.out.println("Cor: " + pc.getCor());
		System.out.println("Marca: " + pc.getMarca());
		
		//pc.imprimirDados();

	}
	
}
