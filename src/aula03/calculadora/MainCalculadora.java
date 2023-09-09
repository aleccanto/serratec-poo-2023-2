package aula03.calculadora;

import java.util.Scanner;

import aula03.encapsulamento.Pessoa;

public class MainCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		
		int opc = 0;

		while (opc != 5) {
			System.out.println("Digite uma das opções");
			
			System.out.printf("1: Soma\n2: Subtração\n3: Multiplicação\n4: Divisão\n5: Sair\n");
			opc = entrada.nextInt();
			
			if(opc == 5) {
				break;
			}

			System.out.println("Digite o primeiro número:");
			double numero1 = entrada.nextDouble();

			System.out.println("Digite o segundo número:");
			double numero2 = entrada.nextDouble();

			System.out.println("O resultado é: " + calculadora.calcular(numero1, numero2, opc));

		}
		
		System.out.println("Sistema finalizado.");

		entrada.close();
	}
}
