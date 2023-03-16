package ExerciciosRep;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int num1, num2, x, cont=0;
		
		System.out.println("\nDigite o primeiro numero do intervalo: ");
		num1 = read.nextInt();
		
		System.out.println("\nDigite o segundo numero do intervalo: ");
		num2 = read.nextInt();
		
			if(num1>num2) {
				System.out.println("\nIntervalo invalido! ");
				
			}else {
				System.out.printf("\nNo intervalo entre %d e %d:",num1, num2);
				
				for(x=num1;x<=num2;x++) {
						if(num1%3==0 && num1%5==0) {
					System.out.println("\nO numero "+num1+" e multiplo de 3 e 5.");
					num1++;
					}else {
						num1++;
					}
			}
			
			
		}
	
	}
	
}
