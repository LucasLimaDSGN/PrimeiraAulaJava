package ExerciciosRep;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int[] num = new int[11];
		int x, contPar=0, contImpar=0;
		
		for(x=1;x<=10;x++) {
			
			System.out.printf("\nDigite o %dº numero:",x);
			num[x] = read.nextInt();
			if(num[x]%2==0) {
				contPar++;
				
			}else {
				contImpar++;
			}
			
		}
		System.out.printf("\nTotal de numeros pares: %d \nTotal de numeros impares: %d",contPar,contImpar);
	}

}
