package aula11;

public abstract class Pessoa {

	protected String nome;
	protected String sobrenome;
	protected String cpf;

	protected Pessoa(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	protected Pessoa() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf != null && cpf.length() == 11 && cpf.matches("\\d+")) {
			this.cpf = cpf;
			System.out.println("O cpf é válido.");
		} else {
			System.out.println("O cpf não é válido.");
		}
	}

	public abstract String dataDeCadastro();
}
