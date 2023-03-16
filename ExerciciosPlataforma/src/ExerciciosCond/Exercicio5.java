package ExerciciosCond;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cod, qtd, punit;
		float vt;
		String prod;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nDigite o codigo do produto: ");
		cod = read.nextInt();
		
		System.out.println("\nDigite a quantidade comprada: ");
		qtd = read.nextInt();
		
		switch(cod) {
		case 1:
			prod = "Cachorro Quente";
			punit = 10;
			vt = qtd*punit;
			System.out.printf("\nProduto: %s \n%d Unidades \nValor Total: R$ %.2f",prod,qtd,vt);
			break;
		
		case 2:
			prod = "X-Salada";
			punit = 15;
			vt = qtd*punit;
			System.out.printf("\nProduto: %s \n%d Unidades \nValor Total: R$ %.2f",prod,qtd,vt);
			break;
			
		case 3:
			prod = "X-Bacon";
			punit = 18;
			vt = qtd*punit;
			System.out.printf("\nProduto: %s \n%d Unidades \nValor Total: R$ %.2f",prod,qtd,vt);
			break;
			
		case 4:
			prod = "Bauru";
			punit = 12;
			vt = qtd*punit;
			System.out.printf("\nProduto: %s \n%d Unidades \nValor Total: R$ %.2f",prod,qtd,vt);
			break;
			
		case 5:
			prod = "Refrigerante";
			punit = 8;
			vt = qtd*punit;
			System.out.printf("\nProduto: %s \n%d Unidades \nValor Total: R$ %.2f",prod,qtd,vt);
			break;
			
		case 6:
			prod = "Suco de Laranja";
			punit = 13;
			vt = qtd*punit;
			System.out.printf("\nProduto: %s \n%d Unidades \nValor Total: R$ %.2f",prod,qtd,vt);
			break;
			default:
				System.out.println("\nOpcao Invalida");
		}
		
		
	}

}
