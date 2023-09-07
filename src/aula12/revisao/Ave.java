package aula12.revisao;

public class Ave extends Animal implements Alimentar {

	private boolean voa;

	public Ave(int qtdPatas, boolean aquatico, boolean voa) {
		super(qtdPatas, aquatico);
		this.voa = voa;
	}

	public Ave() {

	}

	public boolean isVoa() {
		return voa;
	}

	public void setVoa(boolean voa) {
		this.voa = voa;
	}

	public void voar() {
		System.out.println("Voar");
	}

	public void voar(int altura) {
		System.out.println("Voou " + altura + " metros");
	}

	@Override
	public void movimentar() {

	}

	@Override
	public void comer() {
		System.out.println("Comendo...");
	}

	@Override
	public void cacar() {
		// TODO Auto-generated method stub
		
	}


}
