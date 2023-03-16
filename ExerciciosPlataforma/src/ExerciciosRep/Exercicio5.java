package ExerciciosRep;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int num, totnum=0;
		
		do {
			System.out.println("Digite um numero: \n(Pressione 0 para sair)");
			num = read.nextInt();
			
			if(num>0) {
				
				totnum += num;
			}
			
			
		}while(num !=0);
		System.out.printf("\nA soma dos numeros inteiros positivos digitados e: %d",totnum);
	}

}
