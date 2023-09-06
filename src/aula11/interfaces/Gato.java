package aula11.interfaces;

public class Gato implements Comunicar {
	
	public void qualquerCoisa() {
		System.out.println("print");
	}

	@Override
	public String comprimentar() {
	
		return "Miau";
	}

}
