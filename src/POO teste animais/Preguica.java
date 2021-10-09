package POO;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String emitirSom()
	{
		return "preguiça fazendo vários barulhos... ";
	}
	public String subirNaArvore()
	{
		return "Subindo Subindo";
	}
}
