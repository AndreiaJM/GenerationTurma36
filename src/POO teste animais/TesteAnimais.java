package POO;

public class TesteAnimais {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Simba", 1);
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getIdade());
		System.out.println(cachorro.emitirSom());
		System.out.println();
		Cavalo cavalo = new Cavalo("Robson", 5);
		System.out.println(cavalo.getNome());
		System.out.println(cavalo.getIdade());
		System.out.println(cavalo.emitirSom());
		System.out.println();
		Preguica preguiça = new Preguica("Cleiton", 23);
		System.out.println(preguiça.getNome());
		System.out.println(preguiça.getIdade());
		System.out.println(preguiça.emitirSom());
		
		
	}

}
