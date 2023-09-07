package aula12.finaleenum;

public class Principal {
	public static void main(String[] args) {

		Double velocidadeMaxima = 170.0;

		Gol gol = new Gol(velocidadeMaxima);
		gol.alterarCor("cinza");
		gol.colocarCorEmUpCase();
		gol.setNome("Cross");

//		Passagem por valor.
		alteraValorPrimitivo(velocidadeMaxima);

		System.out.println("Velocidade máxima: " + velocidadeMaxima);

		gol.imprimeInformacoes();

		System.out.println("\n//////////////////////");

//		Passagem por referencia.
		alteraValorObjeto(gol);

		gol.imprimeInformacoes();

	}

	static void alteraValorPrimitivo(double valor) {
//		System.out.println("Valor dentro do método: " + valor);
		valor = 40;
//		System.out.println("Valor dentro do método: " + valor);
	}

	static void alteraValorObjeto(Gol gol) {
		gol.setNome("Outro nome");
		gol.setVelocidadeMaxima(30.0);
	}
}
