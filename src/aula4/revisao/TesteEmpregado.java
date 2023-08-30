package aula4.revisao;

import aula4.heranca.Veiculo;

public class TesteEmpregado {
	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("João", "Silva", 2600);
		Empregado empregado2 = new Empregado("Maria", "Silva", 6000);

		empregado1.calculaImpostoRenda();
		empregado2.calculaImpostoRenda();
		
		System.out.printf("Empregado 1\nNome: %s\nSobrenome: %s\nSalário: %.2f", empregado1.getNome(),
				empregado1.getSobrenome(), empregado1.getSalario());

		System.out.printf("\n\n");

		System.out.printf("Empregado 2\nNome: %s\nSobrenome: %s\nSalário: %.2f", empregado2.getNome(),
				empregado2.getSobrenome(), empregado2.getSalario());

	}
}
