package PrimeiroJava;

import java.util.Scanner;

public class LaçoCondicionalEx1 {
	
	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		int n1, n2, n3, maior=0;
		
		System.out.println("Digite um numero inteiro: ");
		n1 = leia.nextInt();
		System.out.println("Digite outro numero: ");
		n2 = leia.nextInt();
		System.out.println("Digite um outro numero: ");
		n3 = leia.nextInt();
		

		
		if (n1>n2 && n1>n3)
		{
			System.out.println("O maior numero é o " + n1);
		}
		else if (n2>n1 && n2>n3)
		{
			System.out.println("O maior numero é o "+n2);
		}
		else 
		{
			System.out.println("O maior numero é o "+n3);
		}
		
		
		
	}
		
		
}


