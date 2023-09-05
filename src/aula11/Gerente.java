package aula11;

public class Gerente extends Funcionario {

	private int qtdFuncionariosGerenciados;

	public Gerente() {

	}

	public Gerente(String nome, String sobrenome, String cpf, double salario, int qtdFuncionariosGerenciados) {
		super(nome, sobrenome, cpf, salario);
		this.qtdFuncionariosGerenciados = qtdFuncionariosGerenciados;
	}

	public int getQtdFuncionariosGerenciados() {
		return qtdFuncionariosGerenciados;
	}

	public void setQtdFuncionariosGerenciados(int qtdFuncionariosGerenciados) {
		this.qtdFuncionariosGerenciados = qtdFuncionariosGerenciados;
	}

	@Override
	public String dataDeCadastro() {
		return null;
	}

}
