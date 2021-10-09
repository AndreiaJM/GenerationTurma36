package POO;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String emitirSom()
	{
		return "Au au";
	}
	
	public String correr()
	{
		return "correndo";
	}
	
	

}
