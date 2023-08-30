package aula5.revisao;

public class TestePlano {
	public static void main(String[] args) {

		Clinica clinica = new Clinica("Amil", "Clinica", "1111222A");
		Medico medico = new Medico("Amil", "João", 123456);
		Anestesista anestesista = new Anestesista("Amil", "Maria", 654321, "geral");

		System.out.println(clinica);
		System.out.println(medico);
		System.out.println(anestesista);

		clinica.calcularPagamento();
		medico.calcularPagamento();
		anestesista.calcularPagamento();

		System.out.println("\n###############################################\n");

		System.out.println(clinica);
		System.out.println(medico);
		System.out.println(anestesista);
	}
}
