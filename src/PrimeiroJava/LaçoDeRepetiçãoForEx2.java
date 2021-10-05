package PrimeiroJava;

import java.util.Scanner;

public class LaçoDeRepetiçãoForEx2 {
	
	public static void main (String[] args)
	{	
		Scanner leia = new Scanner (System.in);
		
		int x, numero, par=0,impar=0;
		
		for (x=1;x<=10;x++)
		{
			System.out.println("Digite um numero inteiro: ");
			numero = leia.nextInt();
			
			if (numero%2==0)
			{
				par++;
			}
			else
			{
				impar++;
			}
			
		}
		System.out.println("Há " + par + " numero(s) par(es).");
		System.out.println("E " + impar + " numero(s) impar(es).");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}
