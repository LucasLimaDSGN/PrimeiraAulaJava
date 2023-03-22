package ExerciciosCollection;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner read = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet();
		int userChoice, i;
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("\nDigite o numero que deseja encontrar:");
		userChoice = read.nextInt();
		
	
		
		if(numeros.contains(userChoice)) {
			System.out.println("\nO numero "+userChoice+" foi encontrado!");
		}else {
			System.out.println("\nO numero "+userChoice+" nao foi encontrado!");
			
		}
	}


	}

