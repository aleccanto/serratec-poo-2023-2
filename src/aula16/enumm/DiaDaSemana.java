package aula16.enumm;

public enum DiaDaSemana {

	SEGUNDA_FEIRA(1, "segunda-feira"), TERCA_FEIRA(2, "terça-feira"), QUARTA_FEIRA(3, "quarta-feira"),
	QUINTA_FEIRA(4, "quinta-feira"), SEXTA_FEIRA(5, "sexta-feira"), SABADO(6, "sábado"), DOMINGO(7, "domingo");

	private final String nomeDoDia;
	private final Integer numeroDoDia;

	private DiaDaSemana(Integer numeroDoDia, String nomeDoDia) {
		this.nomeDoDia = nomeDoDia;
		this.numeroDoDia = numeroDoDia;
	}

	public String getNomeDoDia() {
		return nomeDoDia;
	}

	public Integer getNumeroDoDia() {
		return numeroDoDia;
	}
	
	public static DiaDaSemana obterPorNumero(int numeroDoDia) {
		for(DiaDaSemana dia : DiaDaSemana.values()) {
			if(numeroDoDia == dia.getNumeroDoDia()) {
				return dia;
			}
		}
		return null;
	}

}
