package ex;

public class Lampada {
	
	Boolean status;
	
	public void ligar() {
		this.status = true;
	}
	
	public void desligar() {
		this.status = false;
	}
	
	public String observar() {
		if(status == true) {
			return "Ligada";
		}
		else {
			return "Desligada";
		}
	}
	
}
