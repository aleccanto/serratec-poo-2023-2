package aula13;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import aula13.dados.CriadorDeTabela;
import aula13.dados.FabricaDeConexoes;
import aula13.modelo.Empresa;

public class Principal {
	public static void main(String[] args) throws SQLException {

		Connection conexao = FabricaDeConexoes.obterConexao();

//		if (conexao != null) {
//
//			CriadorDeTabela criadorDeTabela = new CriadorDeTabela();
//
//			criadorDeTabela.construirTabelas(conexao);
//
//			Statement stmt = conexao.createStatement();
//
//			Empresa empresa = new Empresa();
//
//			empresa.setNome("Empresa A");
//
//			stmt.executeUpdate(empresa.getSqlInsert());
//
//			ResultSet rs = stmt.executeQuery(empresa.getSqlSelect());
//
//			System.out.println("Empresas:");
//
//			while (rs.next()) {
//				Empresa empresa2 = new Empresa(rs.getInt("id"), rs.getString("nome"));
//				System.out.println(empresa2);
//			}
//
//			conexao.close();
//
//		}

		Scanner entrada = new Scanner(System.in);

		if (conexao != null) {

			CriadorDeTabela criadorDeTabela = new CriadorDeTabela();

			criadorDeTabela.construirTabelas(conexao);

			Statement stmt = conexao.createStatement();

			System.out.println("Cadastro de empresas.");

			Empresa empresa = new Empresa();

			while (true) {

				System.out.printf("Digite o nome da empresa: ");
				empresa.setNome(entrada.nextLine());
				
				stmt.executeUpdate(empresa.getSqlInsert());

				System.out.printf("Empresa cadastrada. \nDeseja continuar? Sim(S) ou Não(N) ");
				System.out.println();

				if (!entrada.next().equalsIgnoreCase("S")) {
					break;
				}
				
				entrada.nextLine();
			}

			ResultSet rs = stmt.executeQuery(empresa.getSqlSelect());

			System.out.println("Empresas:");

			while (rs.next()) {
				Empresa empresa2 = new Empresa(rs.getInt("id"), rs.getString("nome"));
				System.out.println(empresa2);
			}

			conexao.close();

		}

		entrada.close();

		System.out.println("Aplicação finalizada.");

	}
}
