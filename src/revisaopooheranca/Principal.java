package revisaopooheranca;

import aula11.abstracts.Pessoa;

public class Principal {

//	Crie a classe Animal que tenha os métodos emitir 
//	som e andar e tenha as propriedades raça e nome.

//	Após crie a classe Cachorro e a classe Gato e sobreescreva 
//	os métodos para o cão latir e o gato miar.

	public static void main(String[] args) {

		Gato gato = new Gato();
		Cachorro cao = new Cachorro();

		Animal animal = new Cachorro();
		Animal animalGato = new Gato();

		cao.emitirSom();
		gato.emitirSom();

		animal.emitirSom();
		animalGato.emitirSom();

	}

}
