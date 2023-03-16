package JavaIntro;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int tabuada, x=1,resultado;
		
		System.out.println("\nDigite a tabuada que deseja visualizar: ");
		tabuada = read.nextInt();
		
		do {
			resultado = tabuada*x;
			System.out.println("\n"+tabuada+" X "+x+" = "+resultado);
			
			x++;
		} while(x<=10);
	}

}
