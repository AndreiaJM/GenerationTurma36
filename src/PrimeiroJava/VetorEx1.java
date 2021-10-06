package PrimeiroJava;

import java.util.Scanner;

public class VetorEx1 {
	
	public static void main(String[] args) {
		
	int a[]=new int[6];
	int soma,x;
	
	a[0]=1;
	a[1]=0;
	a[2]=5;
	a[3]=-2;
	a[4]=-5;
	a[5]=7;
	
	soma=a[0]+a[1]+a[5];
	a[4]=100;
	System.out.println("A soma entre a posição 0, 1 e 5 é: "+soma);
	
	for (x=0;x<6;x++)
		
	{	
		System.out.println("Posição "+x+"="+a[x]);
	}
		
		
	
	
	
	
		
		
		
	}
	
	
	
}
