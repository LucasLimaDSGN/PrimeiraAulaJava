package ExercicioRevisao;

import java.util.Scanner;

public class Revisao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] N1 = new int[3][2], N2 = new int[3][2], M1 = new int[3][2], M2 = new int[3][2];
		int linha, coluna;
		
		Scanner read = new Scanner(System.in);
		
	
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.println("\nDigite um numero:");
				N1[linha][coluna] = read.nextInt();
				
			}
		}
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.println("\nDigite um numero:");
				N2[linha][coluna] = read.nextInt();
				
			}
		}
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
			}
		}
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
			}
		}
		
		System.out.println("A matriz N1 e composta pelos seguinte numeros: ");
	}

}
