package aula3.revisao;

public class Imovel {
	
	int codImovel;
	String bairro;
	String tipo;
	double valor;

	void reajuste() {
		if (this.tipo.equals("casa")) {
			this.valor *= 1.05;
		} else if (this.tipo.equals("apto")) {
			this.valor *= 1.08;
		}
	}

	void imprimeCategoria() {
		if (this.valor < 10000) {
			System.out.println("Categoria C");
		} else if (this.valor > 10000 && this.valor < 50000) {
			System.out.println("Categoria B");
		} else if (this.valor >= 50000) {
			System.out.println("Categoria A");
		}
	}
}
