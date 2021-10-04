package PrimeiroJava;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		int anos, meses, dias, idade;
		
		System.out.println("Quantos anos você tem? ");
		anos = leia.nextInt();
		System.out.println("E quantos meses? ");
		meses = leia.nextInt();
		System.out.println("E quantos dias? ");
		dias = leia.nextInt();
		idade = anos*365 + meses*30 + dias;
		
		System.out.println("Sua idade em dias é de: " + idade);
	}

	
		
	}


