package aula10.exercicio;

//Crie uma classe Time com os atributos (- nome) e (- jogadores).
public class Time {

	private String nome;
	private int qtdJogadores;
	private Jogador[] jogadores;

//	1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12

	public Time(String nome, int qtdJogadores) {
		this.nome = nome;
		this.qtdJogadores = qtdJogadores;
		this.jogadores = new Jogador[qtdJogadores];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionarJogador(Jogador jogador) {
		if (this.jogadores.length > qtdJogadores) {
			int proximaPosicao = this.jogadores.length;
			this.jogadores[proximaPosicao] = jogador;
		} else {
			System.out.println("O time atingiu a quantidade máxima de jogadores.");
		}
	}

	public void listarJogadores() {
		System.out.println("Os jogadores são do time " + this.nome + ":");
//		for (int index = 0; index < this.jogadores.length; index++) {
//			System.out.println(this.jogadores[index].getNome());
//		}
		for (Jogador j : this.jogadores) {
			System.out.println(j.getNome());
		}
	}

}
