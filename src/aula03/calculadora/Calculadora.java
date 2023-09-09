package aula03.calculadora;

public class Calculadora {

	double calcular(double valor1, double valor2, int opc) {

		switch (opc) {
			case 1: {
				return valor1 + valor2;
			}
			case 2: {
				return valor1 - valor2;
			}
			case 3: {
				return valor1 * valor2;
			}
			case 4: {
				return valor1 / valor2;
			}
			default: {
				break;
			}
		}

		return 0;
	}

}
