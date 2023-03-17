package ExerciciosArray;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int[] numero = new int[10];
		int x, find, found=0;
		
		for(x=0;x<10;x++) {
			System.out.printf("Digite o %d numero",(x+1));
			numero[x] = read.nextInt();	
		}
		System.out.println("\nDigite o numero que voce quer encontrar: ");
		find = read.nextInt();
		
		for(x=0;x<10;x++) {
		if(find==numero[x]) {
			System.out.printf("\nO numero %d esta localizado na posicao %d",find,numero[x]);
			found = 1;
			}	
		}
		if(found !=1) {
			System.out.println("\nNao foi encontrado!");
			
		}
	}
}
