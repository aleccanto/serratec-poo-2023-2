package aula12.finaleenum;

public class Gol extends Carro {

	public final static String FABRICANTE = "VW";

	private String cor;

	public Gol(double velocidadeMaxima) {
		super(velocidadeMaxima);
	}

	public String getCor() {
		return cor;
	}

	public final void alterarCor(String cor) {
		this.cor = cor;
	}
	
	public void colocarCorEmUpCase() {
		this.cor = this.cor.toUpperCase();
	}


}
