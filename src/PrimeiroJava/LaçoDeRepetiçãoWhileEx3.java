package PrimeiroJava;

import java.util.Scanner;

public class LaçoDeRepetiçãoWhileEx3 {
	
	public static void main (String[] args)
	{	
		
		Scanner leia = new Scanner(System.in);
		
		int x=0, menor=0, maior=0;
		
		while (x!=-99)
		{	
			System.out.println("Quando terminar digite -99");
			System.out.println("Digite a idade: ");
			x =leia.nextInt();
			
			if (x>=1 && x<21)
			{
				menor++;
			}
			else if (x>50)
			{
				maior++;
			}
		}
		
			System.out.println("Há " + menor+" Pessoa(s) menores que 21 e "+ maior+" Pessoa(s) maiores que 50");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}
