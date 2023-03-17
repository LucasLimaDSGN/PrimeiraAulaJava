package ExerciciosArray;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		float[][] notas = new float[10][4];
		float[]  notaluno = new float[10];
		String[] nome = new String[10];
		float somanota=0,media=0;
		int aluno, nota;
		
		for(aluno=0;aluno<10;aluno++) {
			System.out.printf("\nQual o nome do %dº aluno?",(aluno+1));
			nome[aluno] = read.nextLine();
		}
		
		for(aluno=0;aluno<10;aluno++) {
			
			for(nota=0;nota<4;nota++) {
				System.out.printf("\nDigite a %dª nota do %s",(nota+1),nome[aluno]);
				notas[aluno][nota] = read.nextFloat();
				somanota+=notas[aluno][nota];
				media=somanota/4;
			
			}
			somanota=0;
			notaluno[aluno]=media;
		}
		for(aluno=0;aluno<10;aluno++) {
		System.out.printf("\nMedia do aluno %s: %.1f",nome[aluno],notaluno[aluno]);
		}
	}

}
