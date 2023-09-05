package aula11;

public abstract class Funcionario extends Pessoa {

	private double salario;

	protected Funcionario() {

	}

	protected Funcionario(String nome, String sobrenome, String cpf, double salario) {
		super(nome, sobrenome, cpf);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
