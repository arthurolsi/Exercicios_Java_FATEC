
public class TestaCarro {

	public static void main(String[] args) {
		// Instanciar uma classe
		// ou criar um objeto
		
		
		Carro c1 = new Carro();
		// Imprimindo os dados
		
		c1.marca = "VW";
		c1.modelo = "Polo";
		c1.placa = "REGSPWE";
		
		Carro c2 = new Carro();
		
		c2.marca = "Renault";
		c2.modelo = "Duster";
		c2.placa = "MFJ4JN";
		
		
		c1.imprimirDados();
		System.out.println("--------------------");
		c2.imprimirDados();
		
		
		/*System.out.println("Marca  : " +c.marca);
		System.out.println("Modelo : " +c.modelo);
		System.out.println("Placa  : " +c.placa);*/

	}

}
