package aula15.vetores;

import java.util.Scanner;

import aula15.modelo.Aluno;

public class Principal {
	public static void main(String[] args) {

//		Arrays - Vetores

		Aluno[] alunos = new Aluno[5];

		alunos[0] = new Aluno("João");
		alunos[1] = new Aluno("Maria");
		alunos[2] = new Aluno("Marcos");
		alunos[3] = new Aluno("André");
		alunos[4] = new Aluno("Sofia");

//		for (int i = 0; i < alunos.length; i++) {
//			System.out.println(alunos[i].toString());
//		}

		for (Aluno a : alunos) {
			if (a != null) {
				System.out.println(a.toString());
			}
		}

		Aluno[] alunos2 = new Aluno[6];

		for (int i = 0; i < 5; i++) {
			alunos2[i] = alunos[i];
		}

		alunos2[5] = new Aluno("João 2");

		for (Aluno a : alunos2) {
			if (a != null) {
				System.out.println(a.toString());
			}
		}

//		Matriz
		Aluno[][] matrizDeAlunos = new Aluno[2][2];

		matrizDeAlunos[0][0] = new Aluno("Marcos");
		matrizDeAlunos[0][1] = new Aluno("Marcos 2");

		matrizDeAlunos[1][0] = new Aluno("Maria");
		matrizDeAlunos[1][1] = new Aluno("Maria 2");

		for (int i = 0; i < matrizDeAlunos.length; i++) {
			for (int j = 0; j < matrizDeAlunos[i].length; j++) {
				System.out.println(matrizDeAlunos[i][j]);
			}
		}

//		Matriz

		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o tamanho da matriz: ");

		int matrizI = scanner.nextInt();
		int matrizJ = scanner.nextInt();

		Aluno[][] matrizDeAlunos2 = new Aluno[matrizI][matrizJ];

		for (int i = 0; i < matrizDeAlunos2.length; i++) {
			for (int j = 0; j < matrizDeAlunos2[i].length; j++) {
				System.out.printf("Informe o nome do aluno %d-%d: ", i, j);
				matrizDeAlunos2[i][j] = new Aluno(scanner.next());
			}
		}

		for (int i = 0; i < matrizDeAlunos2.length; i++) {
			for (int j = 0; j < matrizDeAlunos2[i].length; j++) {
				System.out.println(matrizDeAlunos2[i][j]);
			}
		}
		
		scanner.close();

	}
}
