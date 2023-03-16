package JavaIntro;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int numero, somaPar=0, contImpar=0;
		
		System.out.println("\nEntre com um numero");
		numero = read.nextInt();
		
		while(numero != 0) {
			if(numero%2==0) {
				somaPar+=numero;
				
			}else {
				
				contImpar++;
			}
			System.out.println("\nEntre com outro numero: ");
			numero = read.nextInt();
		}
		System.out.printf("\nA soma de numeros pares e %d e a quantidade de numeros impar e %d",somaPar, contImpar);
	}

}
