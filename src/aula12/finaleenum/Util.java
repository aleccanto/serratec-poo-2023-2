package aula12.finaleenum;

public class Util {
	
	private Util() {
	}
	
	public static boolean validarCpf(String cpf) {
		if (cpf != null && cpf.length() == 11 && cpf.matches("\\d+")) {
			return true;
		}
		return false;
	}
	
}
