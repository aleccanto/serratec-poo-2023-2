package aula16.enumm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Agenda {

	private Map<DiaDaSemana, List<String>> eventos;

	public Agenda() {
		eventos = new HashMap<>();
	}

	public void adicionarEvento(DiaDaSemana diaDaSemana, String descricaoDoEvento) {
		if (eventos.containsKey(diaDaSemana)) {
			eventos.get(diaDaSemana).add(descricaoDoEvento);
		} else {
			eventos.put(diaDaSemana, new ArrayList<>());
			eventos.get(diaDaSemana).add(descricaoDoEvento);
		}
	}

	public void listarEventosDoDiaDaSemana(DiaDaSemana diaDaSemana) {
		if (eventos.containsKey(diaDaSemana)) {
			System.out.println("Os eventos para " + diaDaSemana.getNomeDoDia() + " são: ");
			eventos.get(diaDaSemana).forEach(evento -> {
				System.out.println("Descrição do evento: " + evento);
			});
		} else {
			System.out.println("Não há agendamentos para " + diaDaSemana.getNomeDoDia());
		}
	}

	public void listarEventosDoDiaDaSemana(int numeroDoDiaDaSemana) {

		DiaDaSemana diaDaSemana = DiaDaSemana.obterPorNumero(numeroDoDiaDaSemana);
		if (diaDaSemana != null) {
			if (eventos.containsKey(diaDaSemana)) {
				System.out.println("Os eventos para " + diaDaSemana.getNomeDoDia() + " são: ");
				eventos.get(diaDaSemana).forEach(evento -> {
					System.out.println("Descrição do evento: " + evento);
				});
			} else {
				System.out.println("Não há agendamentos para " + diaDaSemana.getNomeDoDia());
			}
		} else {
			System.out.println("Dia inválido, selecione um valor de 1 até 7.");
		}
	}

}
