package ExerciciosCond;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int op;
		float saldo=1000, dep, saq;
		String nome;
		
		System.out.println("\n\t\tBEM VINDE AO BANCO DO POVO");
		System.out.println("\nComo devo te chamar?");
		nome = read.nextLine();
		System.out.println("\n\nMuito bem Sr(a)"+nome+"\nQual operacao deseja realizar hoje?");
		System.out.println("\n1- Saldo ");
		System.out.println("\n2- Saque ");
		System.out.println("\n3- Deposito ");
		op = read.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("\n\t\tOperacao - Saldo");
			System.out.printf("\nSaldo: R$%.2f",saldo);
		break;
		
		case 2:
			System.out.println("\n\t\tOperacao - Saque");
			System.out.println("\nQual valor deseja sacar? ");
			saq = read.nextFloat();
			if(saq>saldo) {
			System.out.printf("\\nSaldo Insuficiente! \nSeu saldo e de: R$%.2f \nPor favor, tente novamente.",saldo);
			
			}else {
				saldo = saldo - saq;
				System.out.printf("\nSaque de: R$%.2f efetuado com sucesso!",saq);
				System.out.printf("\nNovo Saldo: R$%.2f",saldo);
			
			}
			break;
		case 3:
			System.out.println("\n\t\tOperacao - Deposito");
			System.out.println("\nQual valor deseja depositar? ");
			dep = read.nextFloat();
			
				saldo = saldo + dep;
				System.out.println("\n\t\tOperacao - Deposito");
				System.out.printf("\nDeposito de: R$%.2f efetuado com sucesso!",dep);
				System.out.printf("\nNovo Saldo: R$%.2f",saldo);
			break;
			default:
				System.out.println("\n\t\tOperacao Invalida!");
			}
			}
		}
	


