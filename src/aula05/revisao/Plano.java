package aula05.revisao;

public class Plano {
	protected String empresa;
	protected double valorPago = 80;
	protected double iss = 5;

	public Plano(String empresa) {
		this.empresa = empresa;
	}

	public void calcularPagamento() {
		this.valorPago *= (1 - (this.iss / 100));
	}

	public double getValorPago() {
		return this.valorPago;
	}

	@Override
	public String toString() {
		return "Plano [empresa=" + empresa + ", valorPago=" + valorPago + ", iss=" + iss + "]";
	}

}
