package ExerciciosEstDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> cliente = new LinkedList<String>();
		int op;
		String nome;
		
		Scanner read = new Scanner(System.in);
		
		do {
		
		Iterator fila = cliente.iterator();
		System.out.println("\n*********************************");
		System.out.println("\n                                 ");
		System.out.println("\n  1 - Adicionar Cliente na Fila  ");
		System.out.println("\n  2 - Listar todos os clientes   ");
		System.out.println("\n  3 - Chamar o proximo da Fila   ");
		System.out.println("\n  0 - Sair                       ");
		System.out.println("\n                                 ");
		System.out.println("\n*********************************");
		System.out.println("\nEntre com a opcao desejada:      ");
		op = read.nextInt();

		switch(op) {
		case 1:
			System.out.println("\nDigite o nome do cliente: ");
			nome = read.next();
			cliente.add(nome);
			
			System.out.println("\nCliente adicionado! ");
			break;
		case 2:
			while(fila.hasNext()) {
				System.out.println(fila.next());
			}
			break;
		case 3:
			if(cliente.size()==0) {
				System.out.println("\nA fila esta vazia!");
			}else {
				System.out.println(fila.next());
				cliente.remove();
				
			}
			break;
		case 0:
			System.out.println("\nObrigado, volte sempre!");
			break;
		default:
			System.out.println("\nOpcao invalida!");
			break;
		
		}
		}while(op != 0);
		
		}
		
	}


