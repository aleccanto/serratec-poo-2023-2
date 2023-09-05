package aula10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

//		Primeira formula
//		System.out.printf("Informe o seu nome: ");
////		Uma palavra
//		String nome = entrada.next();
//		
//		entrada.nextLine();
//
//		System.out.printf("Informe o seu sobrenome: ");
////		Mais de uma palavra
//		String sobrenome = entrada.nextLine();
//
//		entrada.close();
//
//		System.out.printf("\n");
//
//		Pessoa p = new Pessoa(nome, sobrenome);
//
//		System.out.println("Os dados da pessoa são: ");
//		System.out.println(p.toString());
//		Segunda formula

		Endereco endereco = new Endereco();

		Pessoa pessoa2 = new Pessoa(endereco);

		System.out.printf("Informe o seu nome: ");
		pessoa2.setNome(entrada.next());

		entrada.nextLine();

		System.out.printf("Informe o seu sobrenome: ");
		pessoa2.setSobrenome(entrada.nextLine());

		System.out.printf("Informe o número do endereço: ");
		pessoa2.getEndereco().setNumero(entrada.nextInt());

		entrada.nextLine();

		System.out.printf("Informe a rua do endereço: ");
		pessoa2.getEndereco().setRua(entrada.nextLine());

		System.out.printf("Informe o bairro do endereço: ");
		pessoa2.getEndereco().setBairro(entrada.nextLine());

		System.out.printf("Informe a cidade do endereço: ");
		pessoa2.getEndereco().setCidade(entrada.nextLine());

		System.out.printf("\n");

		System.out.println("Os dados da pessoa são: ");
		System.out.println(pessoa2.toString());

		entrada.close();

	}

}
