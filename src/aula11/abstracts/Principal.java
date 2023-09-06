package aula11.abstracts;

public class Principal {
	public static void main(String[] args) {

//		Pessoa p = new Pessoa();
//		
//		Funcionario f = new Funcionario();
//		f.setNome("Nome - Funcionario");
//		f.setSobrenome("Sobrenome - Funcionario");

		Gerente g = new Gerente();

		g.setNome("Gerente");
		g.setSobrenome("Sobrenome");

		g.setCpf("1234");

		Cliente cliente = new Cliente();

		cliente.setCpf(null);

		cliente.setCpf("12345678901");
		cliente.setCpf("123456789A1");
		

	}
}
