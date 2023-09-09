package aula08.revisaopoo2;

public class Principal {
	public static void main(String[] args) {

//		Crie uma classe com nome Carro, defina seus atributos nome, marca e cor e 
//		crie seus comportamentos de ligar e desligar, o nome do carro e 
//		cor serão definidos na criação de um novo objeto do tipo Carro.

//		Crie um novo carro e de um nome e cor.
//		Defina como ligado.

//		e mostre se o carro está ligado.
//		defina sua marca e imprima todas as informações do carro.

		Carro carro = new Carro("Gol", "Prata");

		carro.ligar();
		carro.oCarroEstaLigado();
		carro.setMarca("VW");

		System.out.println(carro.toString());
	}
}
