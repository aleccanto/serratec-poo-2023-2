package aula13.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {

	private FabricaDeConexoes() {
	}

	public static Connection obterConexao() {

		String url 		= "jdbc:postgresql://localhost:5432/empresa";
		String usuario 	= "postgres";
		String senha 	= "";

		Connection conexao = null;
		
		try {
			conexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
		} catch (SQLException e) {
			System.out.println("Não foi possível obter a conexão com o banco de dados!");
		}

		return conexao;

	}

}
