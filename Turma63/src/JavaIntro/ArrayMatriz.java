package JavaIntro;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int[][] numero = new int[3][3];
		int linha, coluna, somaMatriz=0, somaDiagonal=0;
	
		for(linha=0; linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nEntre com um numero: ");
				numero[linha][coluna] = read.nextInt();
				somaMatriz+=numero[linha][coluna];
				
				if(linha==coluna) {
					
					somaDiagonal += numero[linha][coluna];
				}
			}
			
		}
		System.out.println("Soma dos valores da Matriz: "+somaMatriz);
		System.out.println("Soma dos valores da Diagonal Principal: "+somaDiagonal);
	}

}
