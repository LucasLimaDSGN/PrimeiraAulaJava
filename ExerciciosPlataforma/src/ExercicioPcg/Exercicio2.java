package ExercicioPcg;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1, nota2, nota3, nota4, media;
		
		String nome;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nQual o nome do aluno? ");
		nome = read.nextLine();
		
		System.out.println("\nQual a primeira nota?");
		nota1 = read.nextDouble();
		
		System.out.println("\nQual a segunda nota?");
		nota2 = read.nextDouble();
		
		System.out.println("\nQual a terceira nota?");
		nota3 = read.nextDouble();
		
		System.out.println("\nQual a quarta nota?");
		nota4 = read.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		System.out.printf("\nA media aritmetica do aluno "+ nome+ "foi: %2f",media);
	}

}
