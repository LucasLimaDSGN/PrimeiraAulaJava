package JavaIntro;

import java.util.Scanner;

public class LacoIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1, n2, n3, media;
		String nome;
		int op;
		
		Scanner read = new Scanner(System.in);
		
		/*
		System.out.println("\nQual o nome do(a) Alune? ");
		nome = read.nextLine();
		
		System.out.println("\nDigite a primeira nota: ");
		n1 = read.nextFloat();
		
		System.out.println("\nDigite a segunda nota: ");
		n2 = read.nextFloat();
		
		System.out.println("\nDigite a terceira nota: ");
		n3 = read.nextFloat();
		
		media = (n1+n2+n3)/3;
		System.out.printf("\nOla, %s. \nSua media aritmetica e: %.2f.",nome, media);
		
		if(media>=6) {
			System.out.println("\nVoce foi Aprovade!");
		} else if(media>=4 && media<6){
			System.out.println("\nVoce ficou de exame!");
		}else {
			System.out.println("\nVoce foi Reprovade!");	
		}*/
			System.out.println("\n\t\tMenu de Elogios");
			System.out.println("\n\tComo voce define sua familia?");
			System.out.println("\n1- Feliz");
			System.out.println("\n2- Acolhedora");
			System.out.println("\n3- Esta de parabens!");
			System.out.println("\n4- Nota 10!");
			System.out.println("\n5- E Show!");
			System.out.println("\nDigite a sua opcao: ");
			op = read.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("\nFamilia Feliz");
				break;
			case 2:
				System.out.println("\nFamilia Acolhedora");
				break;
			case 3:
				System.out.println("\nFamilia Esta de Parabens!");
				break;
			case 4:
				System.out.println("\nFamilia Nota 10!");
				break;
			case 5:
				System.out.println("\nFamilia E Show!");
				break;
				default:
					System.out.println("\nOpcao invalida.");
			
			}
		
		
	}

}
