package PrimeiroJava;

import java.util.Scanner;

public class La�oCondicionaEX3 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Qual a sua idade? ");
		idade = leia.nextInt();
		
		if (idade >=10 && idade<=14) 
		{
			System.out.println(" "+ idade + " Anos categoria Infantil");
		}
		else if (idade>=15 && idade<=17) 
		{
			System.out.println(" "+ idade + " Anos categoria Juvenil");
		}
		else if (idade>= 18 && idade<= 25)
		{
			System.out.println(" "+idade+" Anos categoria Adulto");
		}
		else 
		{
			System.out.println("Idade inv�lida");
		}
		
		
		
		
	}

}
