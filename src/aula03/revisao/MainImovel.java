package aula03.revisao;

public class MainImovel {
	public static void main(String[] args) {
		
		Imovel imovel1 = new Imovel();
		Imovel imovel2 = new Imovel();

		imovel1.bairro = "Centro";
		imovel1.tipo = "apto";
		imovel1.valor = 25000;

		imovel2.bairro = "Quitandinha";
		imovel2.tipo = "casa";
		imovel2.valor = 98900;

		imovel1.reajuste();
		imovel2.reajuste();

		System.out.println("Imovel 1 valor:" + imovel1.valor);
		System.out.println("Imovel 2 valor:" + imovel2.valor);

		imovel1.imprimeCategoria();

		imovel2.imprimeCategoria();

	}
}
