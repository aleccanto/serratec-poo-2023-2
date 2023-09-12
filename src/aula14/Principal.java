package aula14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) throws SQLException {

//		try (Scanner entrada = new Scanner(System.in);
//				Connection conexao = obterConexao();
//				PreparedStatement ps = conexao.prepareStatement(sqlTabela())) {
//
//			ps.executeUpdate();
//
//			String sql = "select * from veiculos where nome = ?";
//
//			PreparedStatement ps1 = conexao.prepareStatement(sql);
//
//			ps1.setString(1, "gol");
//
//			ResultSet rs = ps1.executeQuery();
//
//			while (rs.next()) {
//				System.out.println(rs.getString("nome"));
//			}
//
//			rs.close();
//			ps1.close();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("Não foi possível fechar a conexão.");
//		}

		Scanner entrada = new Scanner(System.in);
		Connection connection = obterConexao();
		Statement statement = null;
		try {
			statement = connection.createStatement();

			statement.executeUpdate(sqlTabela());

			String sqlInsert = "insert into veiculos(nome) values ('gol'),('escort'),('polo')";

			statement.executeUpdate(sqlInsert);

			System.out.printf("Digite o nome do carro: ");
			String query = entrada.next();

			String sql = "select * from veiculos where nome like '%" + query + "%'";

			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("id") + " Nome: " + rs.getString("nome"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		entrada.close();
		if (connection != null) {
			connection.close();
		}
	}

	public static String sqlTabela() {
		return "CREATE TABLE IF NOT EXISTS veiculos ( id serial primary key, nome varchar not null );";
	}

	public static Connection obterConexao() {

//		localhost = 127.0.0.1

		String url = "jdbc:postgresql://127.0.0.1:5432/empresa";
		String usuario = "postgres";
		String senha = "admin";

		Connection conexao = null;

		try {
			conexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão estabelecida");
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return conexao;

	}
}
