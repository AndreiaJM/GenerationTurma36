package PrimeiroJava;

import java.util.Scanner;

public class VetorEx2 {
	
	public static void main(String[] args) {
		
		
		int numero[] = new int[6];
		int x, somaPar=0, somaImpar=0;
		Scanner leia = new Scanner (System.in);
		
		for(x=0;x<6;x++)
		{
			System.out.println("Digite um numero inteiro: ");
			numero[x] = leia.nextInt();
		}
		
		System.out.println("Numeros pares digitados: ");
		for(x=0;x<6;x++)
		{
			if(numero[x]%2==0)
			{	
				somaPar+=numero[x];
				System.out.printf("%d,",numero[x],"\n");
			}
		}
		System.out.println("\nNumeros impares digitados: ");
		for(x=0;x<6;x++)
		{
			if(numero[x]%2!=0)
			{
				somaImpar++;
				System.out.printf("%d,", numero[x]);
			}
		}
		
		System.out.println("\nSoma dos numeros pares: "+somaPar );
		System.out.println("Há "+ somaImpar+ " numeros ímpares");
	
	}
	
	
	
}
