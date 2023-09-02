package revisaopoo2;

//Crie uma classe com nome Carro, defina seus atributos nome, marca e cor e
//crie seus comportamentos de ligar e desligar, o nome do carro e 
//cor serão definidos na criação de um novo objeto do tipo Carro.

// classe com nome Carro
public class Carro {

//	defina seus atributos nome, marca e cor
	private String nome;
	private String marca;
	private String cor;
	private boolean ligado;

//	o nome do carro e cor serão definidos na criação de um novo objeto
	public Carro(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
		this.ligado = false;
	}

	public void ligar() {
		this.ligado = true;
	}

	public void desligar() {
		this.ligado = false;
	}

	public void oCarroEstaLigado() {
		if (this.ligado) {
			System.out.println("O carro está ligado.");
		} else {
			System.out.println("O carro está desligado.");
		}
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", marca=" + marca + ", cor=" + cor + "]";
	}

}
