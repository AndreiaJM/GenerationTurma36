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
		Preguica pregui�a = new Preguica("Cleiton", 23);
		System.out.println(pregui�a.getNome());
		System.out.println(pregui�a.getIdade());
		System.out.println(pregui�a.emitirSom());
		
		
	}

}
