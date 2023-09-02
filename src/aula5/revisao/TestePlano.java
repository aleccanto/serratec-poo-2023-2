package aula5.revisao;

public class TestePlano {
	public static void main(String[] args) {

		Medico medico = new Medico("Amil", "João", 123456);
		Clinica clinica = new Clinica("Amil", "Clinica", "1111222A");
		Anestesista anestesista = new Anestesista("Amil", "Maria", 654321, "geral");

		System.out.println(medico);
		System.out.println(clinica);
		System.out.println(anestesista);

		medico.calcularPagamento();
		clinica.calcularPagamento();
		anestesista.calcularPagamento();

		System.out.println("\n###############################################\n");

		System.out.println(medico);
		System.out.println(clinica);
		System.out.println(anestesista);
	}
}
