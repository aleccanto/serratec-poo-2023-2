package aula16.enumm;

public class Principal {
	public static void main(String[] args) {

		Agenda agenda = new Agenda();

		agenda.adicionarEvento(DiaDaSemana.SEXTA_FEIRA, "Acertos finais no trabalho");
		agenda.adicionarEvento(DiaDaSemana.SEXTA_FEIRA, "Apresentar trabalho final");
		agenda.adicionarEvento(DiaDaSemana.SABADO, "Palestra");
		agenda.adicionarEvento(DiaDaSemana.DOMINGO, "Descanço");

		agenda.listarEventosDoDiaDaSemana(DiaDaSemana.SEGUNDA_FEIRA);
		agenda.listarEventosDoDiaDaSemana(DiaDaSemana.SEXTA_FEIRA);
		
		agenda.listarEventosDoDiaDaSemana(16);

	}
}
