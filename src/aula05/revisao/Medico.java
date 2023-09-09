package aula05.revisao;

public class Medico extends Plano {

	protected String nome;
	private int crm;

	public Medico(String empresa, String nome, int crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public int getCrm() {
		return crm;
	}

	@Override
	public void calcularPagamento() {
		super.calcularPagamento();
		valorPago *= 1.1;
	}

	@Override
	public String toString() {
		return "Medico [nome=" + nome + ", crm=" + crm + ", empresa=" + empresa + ", valorPago=" + valorPago + ", iss="
				+ iss + "]";
	}

}
