package PrimeiroJava;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float n1, n2, n3, p1, p2, p3, media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("Digite a segunda nota:  ");
		n2 = leia.nextFloat();
		System.out.println("Digite a terceira nota:  ");
		n3 = leia.nextFloat();
		
		p1 = n1*2;
		p2 = n2*3;
		p3 = n3*5;
		
		media = (p1+p2+p2)/10;
		System.out.println("Sua media ponderada é de:  "+ media);
		
		
	}

}
