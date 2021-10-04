package PrimeiroJava;

import java.math.MathContext;
import java.util.Scanner;

public class LaçoCondicionalEx4 {
	
	public static void main (String[] args)
	
	{
		int numero=0;
		double resultado;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um numero inteiro qualquer: ");
		numero = leia.nextInt();
		
		
		
		
		if (numero%2 ==0)
		{	
			resultado=Math.sqrt(numero);
		}
		else
		{
			resultado = Math.pow(numero, 2);
		}
		System.out.println(" Resultado "+ resultado);
		
		
	}

}
