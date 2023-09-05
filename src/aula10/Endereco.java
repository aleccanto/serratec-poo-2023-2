package aula10;

public class Endereco {

	private Integer numero;
	private String rua;
	private String bairro;
	private String cidade;

	public Endereco(Integer numero, String rua, String bairro, String cidade) {
		this.numero = numero;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public Endereco() {

	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Endereco [numero=" + numero + ", rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + "]";
	}

}
