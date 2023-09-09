package aula13.dados;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriadorDeTabela {

	public void construirTabelas(Connection conexao) {

		String sql = criarSql();

		try {
			Statement statement = conexao.createStatement();
			statement.executeUpdate(sql);
			System.out.println("Tabela criada com sucesso!");
		} catch (SQLException e) {
			System.out.println("Não foi possível obter o Statement da conexão.");
			System.out.println("Erro: " + e.getMessage());
		}
	}

	private String criarSql() {
		String sql = "CREATE TABLE IF NOT EXISTS empresa ( id SERIAL PRIMARY KEY, nome VARCHAR(100) NOT NULL );";
		return sql;
	}

}
