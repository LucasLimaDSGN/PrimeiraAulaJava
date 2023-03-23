package ExerciciosEstDados;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> livros = new Stack<String>();
		Scanner read = new Scanner(System.in);
		int op;
		String livro;
		
		do {
			System.out.println("*********************************");
			System.out.println("\n\n  1 - Adicionar Livro na pilha   ");
			System.out.println("  2 - Listar todos os Livros     ");
			System.out.println("  3 - Retirar Livro da pilha     ");
			System.out.println("  0 - Sair                       ");
			System.out.println("\n\n*********************************");
			System.out.println("\nEntre com a opcao desejada: ");
			op = read.nextInt();
			
		switch(op) {
			case 1:
				read.nextLine();
				System.out.println("\nQual livro deseja adicionar? ");
				livro = read.nextLine();
				livros.push(livro);
				
				break;
			case 2:
			for(String listaLivros:livros) {
				System.out.println(livros);
				System.out.println("\n");
			}
				break;
			case 3:
				System.out.println("\nLivro removido com sucesso: "+livros.pop());
				break;
			case 0:
				System.out.println("\nObrigado por ler conosco!");
				break;
			default:
				System.out.println("\nOpcao Invalida!");
				break;
		
		}
			
			
		}while(op != 0);
	}

}
