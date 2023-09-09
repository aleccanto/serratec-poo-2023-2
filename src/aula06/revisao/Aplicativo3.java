package aula06.revisao;

public class Aplicativo3 {
	public static void main(String[] args) {
//		Imprimir a soma dos valores pares e ímpares de 0 a 5 
//		em duas linhas diferenciando pelo tipo.

		int somarPares = 0;
		int somarImpares = 0;

		for (int i = 0; i <= 5; i = i + 1) {
			if (i % 2 == 0) {
				somarPares = somarPares + i;
			} else {
				somarImpares = somarImpares + i;
			}
		}
		
		System.out.println("Pares = " + somarPares);
		System.out.println("Impares = " + somarImpares);

	}
}
