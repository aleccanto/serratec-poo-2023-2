package revisaopoo;

public class Principal {

//	na main
	public static void main(String[] args) {

//		Crie uma classe chamada Pessoa com atributo nome e crie um objeto do tipo pessoa, 
//		defina seu nome e imprima o nome da pessoa na main;

//		Objeto do tipo pessoa
		Pessoa p = new Pessoa();

//		Defina seu nome
		p.setNome("Rodrigo");

//		Imprima o nome da pessoa
		System.out.println("O nome da pessoa é: " + p.getNome());

	}
}
