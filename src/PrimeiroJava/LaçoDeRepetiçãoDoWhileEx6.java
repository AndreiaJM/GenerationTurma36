package PrimeiroJava;

import java.util.Scanner;

public class La�oDeRepeti��oDoWhileEx6 {
	
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int x=0, cont=0, soma=0;
		float media = 0;
		
		
		do 
		{	
			System.out.println("Digite um numero inteiro");
			x =leia.nextInt();
			
			if (x==0)
			{
				System.out.println("Voc� digitou 0 e sair� do programa");
			}
			
			else if (x>=1 && x%3==0)
			{
				soma+=x;
				cont++;
			}
			
			}while(x!=0);
		
			if (cont==0)
			{
				System.out.println("N�o � poss�vel fazer divis�o por 0\n");
			}
			else
			{
			media = soma/cont;
			
			System.out.println("H� "+ cont + " numeros divisiveis por 3");
			System.out.printf("Sua media � %2.2f", media);
			}
			
			
			
			
		
		
		
	}
	

}

