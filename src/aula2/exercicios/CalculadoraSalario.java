package aula2.exercicios;

public class CalculadoraSalario {
	public static void main(String[] args) {
		double salario = 5000;
		double desconto = 0.0;
		double salarioComDesconto = 0.0;

		if (salario <= 1751.81) {
			desconto = 0.92;
		} else if (salario >= 1751.82 && salario <= 2919.72) {
			desconto = 0.91;
		} else if (salario >= 2919.73 && salario <= 5839.45) {
			desconto = 0.9;
		} else {
			desconto = 0.89;
		}

		salarioComDesconto = salario = salario * desconto;

		System.out.println("O valor do salário com o desconto é:" + salarioComDesconto);
	}
}
