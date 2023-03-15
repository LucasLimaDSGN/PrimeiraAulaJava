package ExercicioPcg;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1,n2,n3,n4, dif;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nDigite um numero: ");
		n1 = read.nextDouble();
		
		System.out.println("\nDigite outro");
		n2 = read.nextDouble();
		
		System.out.println("\nAgora mais um: ");
		n3 = read.nextDouble();
		
		System.out.println("\nO ultimo, eu prometo: ");
		n4 = read.nextDouble();
		
		dif = (n1*n2)-(n3*n4);
		
		System.out.printf("\nA diferenca dos produtos de n1 com n2 e n3 com n4 e: "+ dif);
	}

}
