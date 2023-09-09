package aula03.estaticos;

public class TesteProduto {
	public static void main(String[] args) {

//		System.out.println("Quantidade total de produtos: " + Produto.getTotalProdutos());
//
//		Produto produto1 = new Produto(1, "pc", 2499.99);
//		System.out.println("Quantidade total de produtos: " + Produto.getTotalProdutos());
//
//		Produto produto2 = new Produto(2, "pc", 2499.99);
//		System.out.println("Quantidade total de produtos: " + Produto.getTotalProdutos());
//
//		Produto produto3 = new Produto(3, "pc", 2499.99);
//		System.out.println("Quantidade total de produtos: " + Produto.getTotalProdutos());
//
//		Produto produto4 = new Produto(9, "pc", 2499.99);
		
		Produto produto4 = null;
		
		produto4.totalProdutos = 10;
		
		System.out.println(produto4.getTotalProdutos());

		System.out.println("//////////////////////////////\n\n\n\n");

		System.out.println(produto4.getCod());
	}
}
