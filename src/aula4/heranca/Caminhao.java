package aula4.heranca;

public class Caminhao extends Veiculo {

	private int cargaMaxima;

	public Caminhao(String chassi, String placa, double ipva, int cargaMaxima) {
		super(chassi, placa, ipva);
		this.cargaMaxima = cargaMaxima;
	}

	public Caminhao() {

	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	@Override
	public double getIpva() {
		System.out.println("Caminhao");
		return super.getIpva();
	}

}
