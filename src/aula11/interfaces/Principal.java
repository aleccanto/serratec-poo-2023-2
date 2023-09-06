package aula11.interfaces;

public class Principal {

	public static void main(String[] args) {

//		Interfaces
//		Pessoa cP = new Pessoa("Nome");
//		Gato cG = new Gato();
//		Porta p = new Porta();
//		Passaro passaro = new Passaro();

//		Comunicar[] comunicadores = new Comunicar[3];
//		
//		comunicadores[0] = cP;
//		comunicadores[1] = cG;
//		comunicadores[2] = passaro;
//
//		for (Comunicar c : comunicadores) {
//			System.out.println(c.comprimentar());
//		}

//		Pessoa p = new Pessoa();

//		Porta p = new Porta();

//		Gato g = (Gato) p;

//		g.qualquerCoisa();
//
//		if (p instanceof Comunicar) {
//			System.out.println("É comunicador.");
//		} else {
//			System.out.println("Não é comunicador.");
//		}

//		Comunicar[] comunicadores = new Comunicar[3];
//
//		comunicadores[0] = p;
//
//		for (Comunicar c : comunicadores) {
//			if (c != null) {
//				System.out.println(c.comprimentar());
//			}
//		}

		Comunicar c = new Pessoa();

		System.out.println(c.comprimentar());

		if (c instanceof Pessoa) {
			Pessoa p = (Pessoa) c;
			System.out.println(p.getNome());
		}
	}

}
