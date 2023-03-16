package ExerciciosCond;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		String nome, cargo;
		int cod;
		double salario, reajuste;
		
		System.out.println("\nDigite o nome do colaborador: ");
		nome = read.nextLine();
		
		System.out.println("\nDigite o codigo do cargo: ");
		cod = read.nextInt();
		
		System.out.println("\nDigite o salario do colaborador: ");
		salario = read.nextDouble();
		
		switch(cod) {
		case 1:
			cargo = "Gerente";
			reajuste = salario+(salario*0.1);
			
			System.out.printf("\nOla, %s. \nSeu novo salario no cargo de %s"
					+ " e de R$ %.2f",nome,cargo,reajuste);
			break;
		case 2:
			cargo = "Vendedor";
			reajuste = salario+(salario*0.07);
			
			System.out.printf("\nOla, %s. \nSeu novo salario no cargo de %s"
					+ " e de R$ %.2f",nome,cargo,reajuste);
			break;
			
		case 3:
			cargo = "Supervisor";
			reajuste = salario+(salario*0.09);
			
			System.out.printf("\nOla, %s. \nSeu novo salario no cargo de %s"
					+ " e de R$ %.2f",nome,cargo,reajuste);
			break;
			
		case 4:
			cargo = "Motorista";
			reajuste = salario+(salario*0.06);
			
			System.out.printf("\nOla, %s. \nSeu novo salario no cargo de %s"
					+ " e de R$ %.2f",nome,cargo,reajuste);
			break;
			
		case 5:
			cargo = "Estoquista";
			reajuste = salario+(salario*0.05);
			
			System.out.printf("\nOla, %s. \nSeu novo salario no cargo de %s"
					+ " e de R$ %.2f",nome,cargo,reajuste);
			break;
			
		case 6:
			cargo = "Tecnico de T.I";
			reajuste = salario+(salario*0.08);
			
			System.out.printf("\nOla, %s. \nSeu novo salario no cargo de %s"
					+ " e de R$ %.2f",nome,cargo,reajuste);
			break;
			default:
				System.out.printf("\nOpcao invalida");
				break;
			
		}
	}

}
