package ExercicioRevisao;

import java.util.Scanner;

public class Revisao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[5];
		int maior=0, x,y=0;
		
		Scanner read = new Scanner(System.in);
		System.out.printf("\nDigite o 1 numero:");
		num[0] = read.nextInt();
		
		for(x=1;x<5;x++) {
		System.out.printf("\nDigite o %d numero:",(x+1));
		num[x] = read.nextInt();
		
		if(num[x]>maior) {
			maior=num[x];
			y=x;
		}
		}
		System.out.println("\nNumeros encontrados no vetor:");
		for(x=0;x<5;x++) {
			System.out.printf(" %d",num[x]);	
		}
		System.out.printf("\nNo vetor apresentado, o maior numero e o %d, que se encontra no indice %d",maior,y);
	}
}
