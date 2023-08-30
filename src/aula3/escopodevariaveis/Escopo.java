package aula3.escopodevariaveis;

public class Escopo {
//	escopo de classe
	public static int quantidade;

//	escopo de instância/objeto
	private double valor;
	
	private double totalValor() {
//		escopo local
		double valorTotal = this.valor * Escopo.quantidade;
		return valorTotal;
	}

}
