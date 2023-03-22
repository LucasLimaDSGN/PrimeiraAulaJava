package ExerciciosCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		int userChoice, i;
		
		for(i=0;i<10;i++) {
			System.out.println("\nDigite um numero: ");
			userChoice = read.nextInt();
			numeros.add(userChoice);
			
		}
		
		Iterator<Integer> listaNumeros = numeros.iterator();
		
		while(listaNumeros.hasNext()) {
			System.out.println(listaNumeros.next());
		}
	}

}
