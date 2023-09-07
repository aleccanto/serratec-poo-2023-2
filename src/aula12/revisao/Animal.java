package aula12.revisao;

public abstract class Animal implements Caca {

	private int quantidadeDePatas;
	private boolean aquatico;

	public Animal(int quantidadeDePatas, boolean aquatico) {
		this.quantidadeDePatas = quantidadeDePatas;
		this.aquatico = aquatico;
	}

	public Animal() {

	}

	public int getQuantidadeDePatas() {
		return quantidadeDePatas;
	}

	public void setQuantidadeDePatas(int quantidadeDePatas) {
		this.quantidadeDePatas = quantidadeDePatas;
	}

	public boolean isAquatico() {
		return aquatico;
	}

	public void setAquatico(boolean aquatico) {
		this.aquatico = aquatico;
	}
	
	public abstract void movimentar();

}
