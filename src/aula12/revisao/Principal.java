package aula12.revisao;

public class Principal {

	public static void main(String[] args) {

		Ave ave = new Ave();

		ave.voar();

		if (ave instanceof Ave) {
			System.out.println("É uma ave");
		}

		if (ave instanceof Animal) {
			System.out.println("É um animal");
		}

		if (ave instanceof Alimentar) {
			System.out.println("Se alimenta");
		}

		if (ave instanceof Caca) {
			System.out.println("Ela caça");
		}
	}
}
