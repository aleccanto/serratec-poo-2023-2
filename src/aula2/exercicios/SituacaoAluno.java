package aula2.exercicios;

public class SituacaoAluno {
	public static void main(String[] args) {
		double nota1 = 10;
		double nota2 = 3;
		double media = (nota1 + nota2) / 2;

		if (media == 10) 
			System.out.println("Aprovado Parabéns!");
		else if (media >= 7 && media < 10) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
}
