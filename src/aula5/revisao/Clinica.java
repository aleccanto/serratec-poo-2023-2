package aula5.revisao;

public class Clinica extends Plano {

	private String nome;
	private String cgc;

	public Clinica(String empresa, String nome, String cgc) {
		super(empresa);
		this.nome = nome;
		this.cgc = cgc;
		System.out.println("Clinica");
	}

	public String getNome() {
		return nome;
	}

	public String getCgc() {
		return cgc;
	}

	@Override
	public String toString() {
		return "Clinica [nome=" + nome + ", cgc=" + cgc + ", empresa=" + empresa + ", valorPago=" + valorPago + ", iss="
				+ iss + "]";
	}

}
