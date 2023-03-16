package ExerciciosCond;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nDigite um numero");
		n1 = read.nextInt();
		
		if(n1%2==0) {
			if(n1>=0) {
				System.out.println("\nO numero e PAR e Positivo");
			}else {
				System.out.println("\nO numero e PAR e Negativo");
			}} else if(n1>=0) {
				System.out.println("\nO numero e IMPAR e Positivo");
			}else {
				System.out.println("\nO numero e IMPAR e Negativo");
			}	
	}

}
