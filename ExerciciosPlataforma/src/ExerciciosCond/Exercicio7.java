package ExerciciosCond;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		int op;
		float n1, n2, res;
		
		System.out.println("\nDigite o primeiro numero: ");
		n1 = read.nextFloat();
		
		System.out.println("\nDigite o primeiro numero: ");
		n2 = read.nextFloat();
		
		System.out.println("\n\t\tQual operacao voce quer realizar? ");
		System.out.println("\n1- Adicao ");
		System.out.println("\n2- Subtracao ");
		System.out.println("\n3- Multiplicacao ");
		System.out.println("\n4- Divisao ");
		op = read.nextInt();
		
		switch(op) {
		case 1:
			res = n1 + n2;
			System.out.printf("\nO resultado de %.0f + %.0f é: %.2f ",n1,n2,res);
			break;
		case 2:
			res = n1 - n2;
			System.out.printf("\nO resultado de %.0f - %.0f é: %.2f ",n1,n2,res);
			break;
		case 3:
			res = n1 * n2;
			System.out.printf("\nO resultado de %.0f x %.0f é: %.2f ",n1,n2,res);
			break;
		case 4:
			res = n1 / n2;
			System.out.printf("\nO resultado de %.0f/%.0f é: %.2f ",n1,n2,res);
			break;
			default:
				System.out.println("\nOpcao Invalida");
				break;
		}
	}

}
