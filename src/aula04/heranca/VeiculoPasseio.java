package aula04.heranca;

public class VeiculoPasseio extends Veiculo {

	private int quantPortas;

	public VeiculoPasseio(String chassi, String placa, double ipva, int quantPortas) {
		super(chassi, placa, ipva);
		this.quantPortas = quantPortas;
	}
	
	public VeiculoPasseio() {
		
	}

	public int getQuantPortas() {
		return quantPortas;
	}

	public void setQuantPortas(int quantPortas) {

		this.quantPortas = quantPortas;
	}

	@Override
	public double getIpva() {
		System.out.println("VeiculoPasseio");
		return super.getIpva();
	}

	public double getIpva(double acrescimo) {
		return super.getIpva() * acrescimo;
	}

}
