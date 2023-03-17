package ExerciciosRep;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int num, totdiv=0, qtd=0;
		double tMed;
		
		do {
			System.out.println("Digite um numero: \n(Pressione 0 para sair)");
			num = read.nextInt();
			
			if(num%3==0 && num != 0) {
				qtd++;
				totdiv += num;	
				
			}
			
			
		}while(num != 0);
		
		
		tMed=totdiv/qtd;
		System.out.printf("\nA media de todos o numeros diviseis por 3 digitados e: %.2f",tMed);
	}

}
