package aula2.poo;

public class Conta {
	String titular;
	double numero;
	double saldo;

	void deposito(double valor) {
		saldo += valor;
	}

	boolean saque(double valor) {
		if (saldo < valor) {
			return false;
		} else {
			saldo -= valor;
			return true;
		}
	}
}
