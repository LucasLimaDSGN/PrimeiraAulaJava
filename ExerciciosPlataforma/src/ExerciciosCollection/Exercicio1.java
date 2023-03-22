package ExerciciosCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList();
		
		
		for(int i=0;i<5;i++) {
		System.out.println("\nDigite uma cor: ");
		String cor = read.nextLine();
		cores.add(cor);
		
		}
		System.out.println("\nLista de cores: ");	
			System.out.println(cores);
			
		cores.sort(null);
		System.out.println("\nLista de cores por ordem alfabetica: ");
			System.out.println(cores);
		}
	
	}


