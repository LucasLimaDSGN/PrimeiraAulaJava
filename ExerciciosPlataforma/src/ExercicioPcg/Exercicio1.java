package ExercicioPcg;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario, abono, novSal;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nQual o seu salario? ");
		salario = read.nextDouble();
		
		System.out.println("\nQual o valor do abono? ");
		abono = read.nextDouble();
		
		novSal = salario+abono;
		
		System.out.println("\nO seu novo salario e: "+novSal);
	}

}
