package POO;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String emitirSom()
	{
		return "relinchando relinchando";
	}
	public String correr()
	{
		return "correndo";
	}

}
