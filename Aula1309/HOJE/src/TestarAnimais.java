
public class TestarAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mamifero camelo = new Mamifero("Null", "Camelo", 150.0f, 4, "Amarelo", "Terra", 2.0f);
		Mamifero ursocanada = new Mamifero("Mel", "Urso-do-Canadá", 180.0f, 4, "vermelho", "Terra", 0.5f);
		Peixe tubarao = new Peixe("Barbatanas e cauda", "Tubarão", 300.0f, 0, "Cinzento", "Mar", 1.5f);
		
		camelo.dadosMamifero();
		ursocanada.dadosMamifero();
		tubarao.dadosPeixe();
	}

}
