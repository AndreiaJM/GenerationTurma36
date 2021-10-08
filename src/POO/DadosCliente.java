package POO;

public class DadosCliente {
	
	public static void main(String[] args) {
		
		Cliente clientex = new Cliente();
		
		clientex.setNome("Andreia");
		clientex.setDataNasc("27/12/1994");
		clientex.setCpf(1234567);
		
		System.out.println(clientex.getNome());
		System.out.println(clientex.getDataNasc());
		System.out.println(clientex.getCpf());
	
		
		
		
		
		
	}

}
