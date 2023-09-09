package aula13.modelo;

public class Empresa {

	private int id;
	private String nome;

	public Empresa(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Empresa() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSqlInsert() {
		return "insert into empresa(nome) values ('" + this.getNome() + "')";
	}

	public String getSqlSelect() {
		return "select * from empresa";
	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nome=" + nome + "]";
	}

}
