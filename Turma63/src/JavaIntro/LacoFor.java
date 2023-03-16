package JavaIntro;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		float n1, n2, n3, media, somaMedia=0,mediaGeral;
		int x;
		String[] nome = new String [5];
		
		for(x=0;x<=5;x++) {
			
			System.out.println("\nQual o nome do(a) alune?");
			nome[x] = read.nextLine();
			read.nextLine();
			
			System.out.println("\nEntre com a primeira nota: ");
			n1 = read.nextFloat();
			
			System.out.println("\nEntre com a primeira nota: ");
			n2 = read.nextFloat();
			
			System.out.println("\nEntre com a primeira nota: ");
			n3 = read.nextFloat();
		
			media = (n1+n2+n3)/3;
			somaMedia += media;
		}
		x--;
		mediaGeral = somaMedia/x;
		 
		System.out.printf("\nA media geral dos %d alunes da sala e: %.2f",x,mediaGeral);
	}

}
