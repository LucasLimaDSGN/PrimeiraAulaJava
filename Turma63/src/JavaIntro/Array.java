package JavaIntro;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] media = new float[3], nota = new float[3];
		float somaMedia=0, mediaGeral=0;
		int x, y;
		
		Scanner read = new Scanner(System.in);
		
		for(x=0;x<3;x++) {
			for(y=0;y<3;y++) {
				System.out.printf("\nEntre com a %d nota: ",y+1);
				nota[y] = read.nextFloat();
			}
			media[x] = (nota[0]+nota[1]+nota[2])/3;
				System.out.printf("\nA media do %d alune e: %.2f",(x+1),media[x]);
			somaMedia+=media[x];
			mediaGeral=somaMedia/3;
		}
			System.out.printf("\nA media geral da turma foi: %.2f", mediaGeral);
	}

}
