package JavaIntro;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Lucas Vinicius";
		int idade = 26;
		double altura = 1.86, nota1, nota2, nota3, media;
		
		System.out.println("\nO seu nome e: "+nome);
		System.out.println("\nA sua idade e: "+idade +" Anos de vida");
		System.out.println("\nA sua altura e: "+altura+" Metros");
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = read.nextDouble();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = read.nextDouble();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = read.nextDouble();
		
		media = (nota1+nota2+nota3)/3;
		
		
		System.out.printf("\nA media aritimetica foi de: %.2f",media);
	}

}
