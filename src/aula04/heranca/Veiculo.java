package aula04.heranca;

public class Veiculo {

	private String chassi;
	private String placa;
	private String cor;
	private double ipva;
	
	public Veiculo() {
	
	}

	public Veiculo(String chassi) {
		this.chassi = chassi;
	}

	public Veiculo(String chassi, String placa) {
		this(chassi);
		this.placa = placa;
	}

	public Veiculo(String chassi, String placa, double ipva) {
		this(chassi, placa);
		this.ipva = ipva;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getIpva() {
		return ipva;
	}

	public void setIpva(double ipva) {
		this.ipva = ipva;
	}

	@Override
	public String toString() {
		return "Chassi: " + this.chassi + " Placa: " + this.placa + " Cor: " + this.cor + " Ipva: " + this.ipva;
	}

}
