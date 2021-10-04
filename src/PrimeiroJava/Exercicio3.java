package PrimeiroJava;

import java.util.Scanner;

public class Exercicio3 {
	
	
public static void main(String[] args) {
	
	Scanner leia = new Scanner (System.in);
	
	double custoFabrica, distribuidor=0, impostos=0, custoConsumidor;
	
	System.out.println("Qual o custo de fabrica do carro? ");
	custoFabrica = leia.nextDouble();
	
	distribuidor = (custoFabrica*28)/100;
	impostos = (custoFabrica*45)/100;
	
	custoConsumidor = custoFabrica + distribuidor + impostos;
	
	System.out.println("O custo ao consumidor sera de "+custoConsumidor );
	
}

}
