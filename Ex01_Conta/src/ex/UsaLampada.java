package ex;

public class UsaLampada {

	public static void main(String[] args) {
		
		Lampada lampada1 = new Lampada();
		Lampada lampada2 = new Lampada();

		lampada1.ligar();
		lampada2.desligar();
		
		System.out.println("A lâmpada 1 está: " + lampada1.observar());
		System.out.println("A lâmpada 2 está: " + lampada2.observar());
	}

}
