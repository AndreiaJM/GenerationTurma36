package POO;

public class InforViagem {
	
	public static void main(String[] args) {
		
		Aviao viajem = new Aviao();
		
		viajem.setTotalAcentos(186);
		viajem.setValorPassagem(1500);
		viajem.setValorPetPassagem(250);
		
		System.out.println("Quantidades de acentos do avi�o : "+ viajem.getTotalAcentos());
		System.out.println("O valor da passagem �: "+viajem.getValorPassagem());
		System.out.println("Valor da passagem Pet "+viajem.getValorPetPassagem());
		
	}

}
