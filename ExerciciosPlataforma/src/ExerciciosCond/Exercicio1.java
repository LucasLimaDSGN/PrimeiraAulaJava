package ExerciciosCond;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de A: ");
		a = read.nextInt();
		
		System.out.println("\nDigite o valor de B: ");
		b = read.nextInt();
		
		System.out.println("\nDigite o valor de C");
		c = read.nextInt();
		
		if((a+b)>c) {
			System.out.println("\nO valor de A+B e MAIOR que C");
		}else if((a+b)<c) {
			System.out.println("\nO valor de A+B e MENOR que C");
		}else {
			System.out.println("\nO valor de A+B e IGUAL a C");
		}
	}

}
