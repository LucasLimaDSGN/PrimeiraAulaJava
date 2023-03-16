package ExercicioPcg;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1,n2,n3,n4, dif;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nDigite um numero: ");
		n1 = read.nextFloat();
		
		System.out.println("\nDigite outro");
		n2 = read.nextFloat();
		
		System.out.println("\nAgora mais um: ");
		n3 = read.nextFloat();
		
		System.out.println("\nO ultimo, eu prometo: ");
		n4 = read.nextFloat();
		
		dif = (n1*n2)-(n3*n4);
		
		System.out.printf("\nA diferenca dos produtos de n1 com n2 e n3 com n4 e: "+ dif);
	}

}
