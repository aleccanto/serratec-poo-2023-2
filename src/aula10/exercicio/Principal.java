package aula10.exercicio;

public class Principal {
	public static void main(String[] args) {

//										
//		Crie uma classe Jogador com os atributos  (- nome) e (- idade).
//		Crie uma classe Time com os atributos (- nome) e (- jogadores).
// 		Crie dois jogadores e adicione ao time que será criado também.
//		Crie um método para listar os jogadores desse time.

		Time t = new Time("Time", 2);

		Jogador j1 = new Jogador("Jogador 1", 30);
		Jogador j2 = new Jogador("Jogador 2", 15);

		t.adicionarJogador(j1);
		t.adicionarJogador(j2);
		t.adicionarJogador(j2);

		t.listarJogadores();

	}
}
