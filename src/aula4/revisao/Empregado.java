package aula4.revisao;

public class Empregado {
	private String nome;
	private String sobrenome;
	private double salario;

	public Empregado(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}

	public String getNome() {
		return nome.toUpperCase();
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void calculaImpostoRenda() {

		double desconto = 0;

		if (salario > 1903.98 && salario <= 2826.65) {
			desconto = 0.075;
		} else if (salario >= 2826.66 && salario <= 3751.05) {
			desconto = 0.15;
		} else if (salario >= 3751.06 && salario <= 4664.68) {
			desconto = 0.225;
		} else if (salario > 4664.68) {
			desconto = 0.275;
		}

		salario -= salario * desconto;
	}

}
