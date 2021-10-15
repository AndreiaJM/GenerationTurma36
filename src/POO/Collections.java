

import java.util.ArrayList;
import java.util.Scanner;

public class Collections {

	public static void main(String[] args) {
		
		
		Scanner leia=new Scanner(System.in);
		int opcao = 0;
		
		ArrayList<String> estoque=new ArrayList();
		do {
			System.out.print("\n1) Para adicionar produto a lista?");
			System.out.print("\n2) Para remover produto da lista?");
			System.out.print("\n3) Para atualizar dados da lista?");
			System.out.print("\n4) Para mostrar todos os produtos da lista?");
			System.out.print("\n0) Para sair");
			System.out.print("\n");
			System.out.print("\nDigite a opção desejada: ");opcao=leia.nextInt();
			System.out.print("\n");
			
			switch(opcao) {
			case 1:
				leia.nextLine(); 
				System.out.print("\nDigite o nome do produto para adicionar ao estoque: ");
				String produto=leia.nextLine();
				estoque.add(produto);
				System.out.println("\nProduto adicionado!");
				break;
				
				
			case 2:
				leia.nextLine();
				System.out.print("\nDigite o nome do produto que deseja remover do estoque: ");
				String produtor=leia.nextLine();
				if(estoque.contains(produtor)) {
					estoque.remove(produtor);
					System.out.println("\nProduto removido!");
					
				}
				
				else System.out.println("\nNão existe "+produtor+" no seu estoque!!!");
				break;
				
			case 3: 
				leia.nextLine();
				System.out.print("\nDigite o nome do produto que deseja alterar: "); 
				String alterar=leia.nextLine();
				if(estoque.contains(alterar)) {
					System.out.println("\nDigite o nome do produto que entra no lugar de "+alterar+ ": ");
					String novo=leia.nextLine();
					estoque.remove(alterar);
					estoque.add(novo);
					System.out.println("\nProduto alterado!");
				}
				
				else System.out.println("\nProduto não existe "+alterar+" no seu estoque!!!\nImpossivel alterar");
				break;
				
			case 4:
				leia.nextLine();
				System.out.print("\n");
				System.out.print("\n4) PRODUTOS DO ESTOQUE: ");	
				System.out.println(estoque);
				System.out.print("\n");
				break;
				
				default: System.out.print("\n");
				
			}
			
		}while(opcao!=0);
	
	}

}
