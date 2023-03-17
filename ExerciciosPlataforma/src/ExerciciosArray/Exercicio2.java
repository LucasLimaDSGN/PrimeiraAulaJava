package ExerciciosArray;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int[] numero = new int[10];
		int par=0, impar=0, soma=0, x;
		float media=0;
		
		
		for(x=0;x<10;x++) {
			System.out.printf("\nDigite o %dº numero",(x+1));
			numero[x] = read.nextInt();
			
			soma+=numero[x];
			media=soma/10;
			}
			System.out.println("\nElementos nos indices impares: ");
			
		for(x=0;x<10;x++) {
			if(x%2!= 0) {
			
			System.out.printf(" %d",numero[x]);
			}
		}
		System.out.println("\nElementos pares");
		for(x=0;x<10;x++) {
			if(numero[x]%2 == 0) {
			
			System.out.printf(" %d",numero[x]);
			}
		}
		System.out.println("\nSoma: "+soma);
		System.out.println("\nMedia: "+media);
		
	}

}
