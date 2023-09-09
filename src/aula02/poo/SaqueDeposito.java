package aula02.poo;

public class SaqueDeposito {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();

		conta1.titular = "Maria";
		conta1.deposito(200);

		conta2.titular = "João";
		conta2.deposito(100);

		System.out.println("Titular da conta 1: " + conta1.titular);
		System.out.println("Saldo da conta 1: " + conta1.saldo);

		System.out.println("Titular da conta 2: " + conta2.titular);
		System.out.println("Saldo da conta 2: " + conta2.saldo);
	}
}
