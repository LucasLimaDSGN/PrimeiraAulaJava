package ExerciciosCond;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int idade;
		boolean doador;
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nOla, qual o seu nome? ");
		nome = read.nextLine();
		
		System.out.println("\nQual a sua idade? ");
		idade = read.nextInt();
		
		System.out.println("\nVoce ja doou sangue?");
		doador = read.nextBoolean();
		
		System.out.println("\nOla "+nome);
		
		if(idade>=18 && idade<=59) {
			System.out.printf("\nOla %s, voce esta APTO para doar sangue.",nome);	
			} else if(idade>=60 && idade<=69 && doador==true) {
				
				System.out.printf("\nOla %s, voce esta APTO para doar sangue.",nome);
				
			}else {
				System.out.printf("\nOla %s, voce NAO ESTA APTO para doar sangue.",nome);
				
			}
		}
	}


