package aula15.listas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import aula15.modelo.Aluno;

public class Principal {
	public static void main(String[] args) {

//		Array:
//		Aluno[] alunos = new Aluno[5];

//		Listas e os Mapeadores

//		Lista
		List<Aluno> listaDeAlunos = new ArrayList<Aluno>();

//		Set
//		Set<Aluno> hashAlunos = new LinkedHashSet<Aluno>();
		Set<Aluno> hashAlunos = new HashSet<Aluno>();

		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("João 1"));

		listaDeAlunos.remove(70);

		for (Aluno a : listaDeAlunos) {
			System.out.println(a);
		}

		System.out.println("\n//////////////////////////////\n");

		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria"));
		hashAlunos.add(new Aluno("Maria 1"));
		hashAlunos.add(new Aluno("Maria 2"));
		hashAlunos.add(new Aluno("Maria 3"));

		String nome = "Maria 2";
		
//		var nomeVar = condicional ? true : false
		String nomeSql = nome.length() > 5 ? nome.substring(0, 4) : nome;

//		for (Aluno a : hashAlunos) {
//			if (nome.equals(a.getNome())) {
//				hashAlunos.remove(a);
//			}
//		}

		hashAlunos.removeIf(a -> nome.equals(a.getNome()));
		
//		for (Aluno a : hashAlunos) {
//			System.out.println(a);
//		}

		hashAlunos.forEach(a -> System.out.println(a));
	}
}
