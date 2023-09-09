package aula02.entrada;

import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {

		int numero;
		double dinheiro;
		String textoSimples;
		String textoComposto;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número:");
		numero = entrada.nextInt();

		System.out.println("O número digitado foi:" + numero);

		System.out.println("Informe um número com casas decimais:");
		dinheiro = entrada.nextDouble();

		System.out.println("Informe seu primeiro nome:");
		textoSimples = entrada.next();
		
		entrada.nextLine();

		System.out.println("Informe seu nome completo:");
		textoComposto = entrada.nextLine();

		System.out.printf(
				"Dinheiro: " + dinheiro + "\n" + "Nome:" + textoSimples + "\n" + "Nome completo:" + textoComposto);

		entrada.close();

	}
}
