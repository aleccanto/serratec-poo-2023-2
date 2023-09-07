package aula12.finaleenum;

public class GolBola extends Gol {

	final private int qtdPortas;

	public GolBola(int velocidadeMaxima, int qtdPortas) {
		super(velocidadeMaxima);
		this.qtdPortas = qtdPortas;
	}

	public int getQtdPortas() {
		return qtdPortas;
	}

}
