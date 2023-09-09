package aula04.heranca;

public class TesteHeranca {
	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo();
		VeiculoPasseio veiculoPasseio = new VeiculoPasseio();
		Caminhao caminhao = new Caminhao();

		veiculo.setPlaca("AAAA-1234");
		veiculo.setCor("azul");

		veiculoPasseio.setQuantPortas(4);
		veiculoPasseio.setCor("Azul");

		caminhao.setCargaMaxima(1000);
		caminhao.setChassi("2929282");
		caminhao.setCor("Vermelho");
		caminhao.setPlaca("AAAA-1235");
		caminhao.setIpva(1000);

		veiculoPasseio.setIpva(400);

		System.out.println(veiculoPasseio.getIpva());
		System.out.println(veiculoPasseio.getIpva(50));

		System.out.println(caminhao.toString());
		System.out.println(caminhao);

	}
}
