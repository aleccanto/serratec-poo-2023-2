package aula03.estaticos;

public class Produto {
	private int cod;
	private String descricao;
	private double valor;
	static int totalProdutos;

	public Produto(int cod, String descricao, double valor) {
		this.cod = cod;
		this.descricao = descricao;
		this.valor = valor;
		Produto.totalProdutos++;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public static int getTotalProdutos() {
		return Produto.totalProdutos;
	}

}
