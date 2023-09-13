package aula16.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {
	public static void main(String[] args) {

//		Mapeadores

//		Lista

		List<String> nomes = new ArrayList<String>();

		nomes.add("Nome 1"); // 0
		nomes.add("Nome 2"); // 1

		nomes.get(0);

		Map<String, Aluno> notasPorAluno = new HashMap<>();

		notasPorAluno.put("João", new Aluno());
		notasPorAluno.put("Maria", new Aluno());
		notasPorAluno.put("Lucia", new Aluno());
		notasPorAluno.put("Marcos", new Aluno());
		notasPorAluno.put("Jose", new Aluno());
		notasPorAluno.put("Alex", new Aluno());
		
//		Aluno joao = notasPorAluno.get("João");
//
//		joao.setIdade(10);
//		joao.setNome("João");
//		
//		System.out.println(notasPorAluno.get("João"));
//
//		notasPorAluno.put("João", new Aluno());
//
//		System.out.println(notasPorAluno.get("João"));
//		
//		System.out.println(joao);
		
		notasPorAluno.forEach((chave, valor) -> {
			System.out.println("Chave: " + chave);
			System.out.println("Valor: " + valor);
		});
		
		for(Map.Entry<String, Aluno> entry : notasPorAluno.entrySet()) {
			System.out.println("Chave: " + entry.getKey());
			System.out.println("Valor: " + entry.getValue());
		}
	}
}

class Aluno {
	private String nome;
	private Integer idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + "]";
	}

}
