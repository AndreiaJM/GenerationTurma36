package PrimeiroJava;

import java.util.Scanner;

public class VetorEx {
	
	
	public static void main(String[] args) {
		
		int matriz[][] = new int[3][3];	
		int linha, coluna, cont=0;
		Scanner leia = new Scanner (System.in);
				
			for (linha=0;linha<3;linha++) // cada vez que o primeiro for é executado, o segundo é executado 3 vez.
			{
				for(coluna=0;coluna<3;coluna++)
				{	
					System.out.println("Digite um numero: ");
					matriz[linha][coluna]=leia.nextInt();
					if (matriz[linha][coluna]>10)
					{
						cont++;
					}
				}
			}
			
			System.out.println("Há "+ cont + " maiores que 10");
		
	}

}
