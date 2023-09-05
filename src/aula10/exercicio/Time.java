package aula10.exercicio;

//Crie uma classe Time com os atributos (- nome) e (- jogadores).
public class Time {

	private String nome;
	private int qtdJogadores;
	private Jogador[] jogadores;

	public Time(String nome, int qtdJogadores) {
		this.nome = nome;
		this.jogadores = new Jogador[qtdJogadores];
		this.qtdJogadores = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionarJogador(Jogador jogador) {
		if (qtdJogadores < this.jogadores.length) {
			this.jogadores[qtdJogadores] = jogador;
			this.qtdJogadores++;
		} else {
			System.out.println("O time atingiu a quantidade máxima de jogadores.");
		}
	}

	public void listarJogadores() {
		System.out.println("Os jogadores do time " + this.nome + " são :");
		for (Jogador j : this.jogadores) {
			if (j != null) {
				System.out.println(j.getNome());
			}
		}
	}

}
