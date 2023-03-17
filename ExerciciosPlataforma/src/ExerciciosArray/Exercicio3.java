package ExerciciosArray;


import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int[][] numero = new int[3][3];
		int linha, coluna, somaprin=0, somasec=0;
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nInsira um numero: ");
				numero[linha][coluna] = read.nextInt();
				
				if(linha==coluna) {
					somaprin += numero [linha][coluna];
					
				} else if((linha==0 && coluna == 2)||(linha==1 && coluna==1)||(linha==2 && coluna==0)) {
					somasec += numero[linha][coluna];
					
				}
			}
			
		}
		System.out.println("\nElementos da diagonal principal");
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
			if(linha==coluna) {
				System.out.println(numero[linha][coluna]);
				
		}
			}
	}
		System.out.println("\nElementos da diagonal secundaria");
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
			if((linha==0 && coluna == 2)||(linha==1 && coluna==1)||(linha==2 && coluna==0)) {
				System.out.println(numero[linha][coluna]);
				
		}
			}
	}
		System.out.println("\nSoma dos elementos da Diagonal Principal: "+somaprin);
		System.out.println("\nSoma dos elementos da Diagonal Secundaria: "+somasec);
		
	}

}
