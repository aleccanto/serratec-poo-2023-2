package aula10.exercicio;

//Crie uma classe Jogador com os atributos  (- nome) e (- idade).
public class Jogador {

	private String nome;
	private int idade;

	public Jogador(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
