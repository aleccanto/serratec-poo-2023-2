package aula12.finaleenum;

public abstract class Carro {

	private String nome;
	private Double velocidadeMaxima;

	public Carro(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public final void imprimeInformacoes() {
		System.out.printf("Nome: %s - Velocidade Máxima: %.2f", this.nome, this.velocidadeMaxima);
	}

	public Double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(Double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	

}
