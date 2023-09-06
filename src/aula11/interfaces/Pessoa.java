package aula11.interfaces;

public class Pessoa implements Comunicar {
	private String nome;

	public Pessoa() {
	}

	protected Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String comprimentar() {
		return "Olá";
	}

}
