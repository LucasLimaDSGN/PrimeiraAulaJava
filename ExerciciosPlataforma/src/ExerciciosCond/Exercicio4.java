package ExerciciosCond;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palavra1, palavra2, palavra3;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nQual a primeira caracteristica?");
		palavra1 = read.nextLine();
		
		System.out.println("\nQual a segunda caracteristica?");
		palavra2 = read.nextLine();
		
		System.out.println("\nQual a terceira caracteristica?");
		palavra3 = read.nextLine();
		
		if(palavra1.equalsIgnoreCase("vertebrado")) {
			if(palavra2.equalsIgnoreCase("ave")) {
				if(palavra3.equalsIgnoreCase("Carnivoro")) {
					System.out.println("\nAguia");
				}else {
					System.out.println("\nPomba");
				}
				
			}else if(palavra3.equalsIgnoreCase("Onivoro")){
				System.out.println("\nHomem");
			}else {
				System.out.println("\nVaca");	
				}
			
			
		}else if(palavra2.equalsIgnoreCase("inseto")) {
			if(palavra3.equalsIgnoreCase("Hematofago")) {
				System.out.println("\nPulga");
			}else {
				System.out.println("\nLagarta");
			}
			
		}else{
			if(palavra3.equalsIgnoreCase("hematofago")) {
				System.out.println("\nSanguessuga");
			} else {
				System.out.println("\nMinhoca");
			}
			
		}
	}

}
