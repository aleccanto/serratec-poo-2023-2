package aula05.revisao;

public class Anestesista extends Medico {

	private String tipoAnestesia;

	public Anestesista(String empresa, String nome, int crm, String tipoAnestesia) {
		super(empresa, nome, crm);
		this.tipoAnestesia = tipoAnestesia;
	}

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}

	public void setTipoAnestesia(String tipoAnestesia) {
		this.tipoAnestesia = tipoAnestesia;
	}

	@Override
	public void calcularPagamento() {
		super.calcularPagamento();
		this.valorPago += 1000;
	}

	@Override
	public String toString() {
		return "Anestesista [tipoAnestesia=" + tipoAnestesia + ", nome=" + nome + ", empresa=" + empresa
				+ ", valorPago=" + valorPago + ", iss=" + iss + "]";
	}

}
