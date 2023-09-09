package aula03.encapsulamento;

public class Pessoa {
	private int pessoaId;
	private String nome;
	private double peso;
	private double altura;

	public Pessoa(int pessoaId, String nome) {
		this.pessoaId = pessoaId;
		this.nome = nome;
	}

	public Pessoa(int pessoaId, String nome, double peso, double altura) {
		this(pessoaId, nome);
		this.peso = peso;
		this.altura = altura;
	}

	public int getPessoaId() {
		return this.pessoaId;
	}

	public void setPessoaId(int pessoaId) {
		this.pessoaId = pessoaId;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso > 0) {
			this.peso = peso;
		}
		System.out.println("O peso é inválido");
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		}
		System.out.println("A altura é inválida");
	}

	public double getImc() {
		if (this.altura > 0 && this.peso > 0) {
			System.out.println("Peso e altura não informados.");
			return 0;
		}
		return (this.altura * this.altura) / this.peso;
	}

}
