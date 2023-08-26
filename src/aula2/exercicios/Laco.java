package aula2.exercicios;

public class Laco {
	public static void main(String[] args) {

		int par = 0;
		int impar = 0;

		for (int i = 0; i <= 30; i++) {
			if (i % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}

		System.out.println("A quantidade de números impares é:" + impar);
		System.out.println("A quantidade de números pares é:" + par);

	}
}
