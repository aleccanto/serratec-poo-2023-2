package aula11.abstracts;

public class Cliente extends Pessoa {

	private String cartaoDeCredito;

	public String getCartaoDeCredito() {
		return cartaoDeCredito;
	}

	public void setCartaoDeCredito(String cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}

	@Override
	public String dataDeCadastro() {
		return null;
	}

}
