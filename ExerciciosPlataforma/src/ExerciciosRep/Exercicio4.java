package ExerciciosRep;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int idade, sexo, cargo, c1=0, c2=0, c3=0, c4=0;
		char resp='s';
		
		while(resp != 'n') {
			
			System.out.println("\nQual a idade do(a) Dev? ");
			idade = read.nextInt();

			System.out.println("\nSelecione o sexo do(a) Dev: "
					+ "\n1- Masculino \n2- Feminino \n3- Outros \n4- Prefiro nao responder");
			sexo = read.nextInt();
			
			System.out.println("\nSelecione a categoria do(a) Dev:"
					+ "\n1- BackEnd \n2- FrontEnd \n3- Mobile \n4- Fullstack");
			cargo = read.nextInt();
			
			
			
			
			if(cargo==1) {
				c1++;
				
			}else if(sexo==2 && cargo==2) {
				c2++;
			}else if(sexo==1 && cargo==3 && idade>40) {
				c3++;
				
			}else if(sexo==2 && cargo==4 && idade<30) {
				c4++;
				
			}
			System.out.println("\nDeseja continuar a leitura de dados?(s/n)");
			resp = read.next().charAt(0);
			
		}
		System.out.printf("\nO numero de pessoas desenvolvedoras BackEnd e: %d",c1);
		System.out.printf("\nO numero de mulheres desenvolvedoras FrontEnd e: %d",c2);
		System.out.printf("\nO numero de homens desenvolvedores Mobile acima dos 40 anos e: %d",c3);
		System.out.printf("\nO numero de mulheres desenvolvedoras FullStack abaixo dos 30 anos e: %d",c4);
	}

}
