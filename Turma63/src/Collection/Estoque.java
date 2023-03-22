package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		
		Scanner read = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n----------------------------------");
			System.out.println("\n\t\tMenu do Estoque");
			System.out.println("\n(1) Adicionar Produtos");
			System.out.println("\n(2) Remover Produtos");
			System.out.println("\n(3) Atualizar Produtos");
			System.out.println("\n(4) Visualizar Estoque");
			System.out.println("\n(0) SAIR");
			op = read.nextInt();
			
			switch(op) {
			
			case 1:
				read.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque:");
				String produto = read.nextLine();
				estoque.add(produto);
				break;
			case 2:
				read.nextLine();
				System.out.println("\nDigite o produto para remover ao estoque:");
				String produtor = read.nextLine();
				
				if(estoque.contains(produtor)) {
					estoque.remove(produtor);
					
				}else {
					System.out.println("\nEste produto nao existe!");
					
				}
				System.out.println("\nProdutos em Estoque:");
				System.out.println(estoque);
				
				break;
			case 3:
				read.nextLine();
				
				System.out.println("\nDigite o produto que deseja atualizar: ");
				String verifica = read.nextLine();
				System.out.println("\nDigite o nome do produto que entrara no lugar do '"+verifica+"':");
				String novo = read.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
					
				}else {
					System.out.println("\nEste produto nao existe!");
					
				}
				System.out.println("\nProdutos em Estoque:");
				System.out.println(estoque);
				
				break;
			case 4:
				System.out.println("\nProdutos em Estoque:");
				System.out.println(estoque);
				
				break;
			case 0:
				System.out.println("\nMuito obrigado por utilizar o nosso sistema!");
				
				break;
			default:
				System.out.println("\nOpcao invalida, tente novamente!");
				
			}
			
		}while(op != 0);
	}

}
