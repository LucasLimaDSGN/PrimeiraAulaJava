package ExerciciosRep;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int idade=1, tpv=0, tpc=0;
		
		while(idade>=0) {
			System.out.println("\nDigite uma idade: \n(Para sair digite um numero negativo)");
			idade = read.nextInt();
			if(idade<21) {
				tpv++;
				
			}else if(idade>50) {
				tpc++;
			}
			
		}
		System.out.printf("\nTotal de pessoas menor de 21 anos: %d"
				+ "\nTotal de pessoas maior de 50 anos: %d",tpv,tpc);
	}

}
