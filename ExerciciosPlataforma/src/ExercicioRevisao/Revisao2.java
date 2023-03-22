package ExercicioRevisao;

import java.util.Scanner;

public class Revisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lanc = new int[10];
		int x, maiorqtd=1, soma=0, maior=0;
		float media=0;
		Scanner read = new Scanner(System.in);
		
		for(x=0;x<10;x++) {
			System.out.printf("\nQual numero o dado apresenta?");
			lanc[x]= read.nextInt();
			
			while(lanc[x]<1 || lanc[x] > 6) {
				System.out.println("\nValor digitado invalido, digite um numero entre 1 e 6");
				lanc[x] = read.nextInt();
			}
				
				soma+=lanc[x];
				
				if(lanc[x]==maior) {
					maiorqtd++;
				}else if(lanc[x]>maior) {
						maiorqtd=1;
						maior=lanc[x];
					}
			}
			media= soma/10;
			
			System.out.println("\nOs numeros lancados pelo dado foram: ");
			
			for(x=0;x<10;x++) {
				System.out.printf(" %d",lanc[x]);
			}
			System.out.printf("\nA media aritmetica do lancamento e: %.2f"
					+ "\nO maior numero da serie foi: %d"
					+ "\nE esse numero apareceu %d vezes na serie.",media,maior,maiorqtd);
			
		}
	}

