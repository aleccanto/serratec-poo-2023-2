package aula15.modelo;

import java.util.Objects;

public class Aluno {
	private static int quantidadeDeAlunos = 1;
	
	private Integer id;
	private String nome;

	private Aluno(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Aluno(String nome) {
		this(quantidadeDeAlunos, nome);
		quantidadeDeAlunos++;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}

}
