package ExercicioRevisao;

import java.util.Scanner;

public class Revisao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] M1 = new int [3][3];
		int linha, coluna, somaVal=0, somaDiag=0;
		
		Scanner read = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.println("\nDigite um numero:");
				M1[linha][coluna] = read.nextInt();
				
				somaVal+= M1[linha][coluna];
				
				if(linha == coluna) {
					somaDiag+= M1[linha][coluna];	
				}
			}
		}
	}

}
