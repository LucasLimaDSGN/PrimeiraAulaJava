package ExercicioPcg;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario, vhe=100, adNot, desc, qhe, salQ;
		String nome;
		
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nQual o seu nome?");
		nome = read.nextLine();
		
		System.out.println("\nDigite o valor do seu salario bruto: ");
		salario = read.nextDouble();
		adNot = salario*0.25;
		
		System.out.println("\nQuantas horas extra fez esse mes? ");
		qhe = read.nextDouble();
		vhe = vhe*qhe;
		desc = salario*0.1;
		
		salQ = salario+vhe+adNot-desc;
		
		System.out.println("\nOla, "+nome+"! \nSeu salario e: R$"+salario+
				"\nVoce fez "+qhe+" horas extras, e por isso recebeu R$"+vhe+" a mais esse mes. "
						+ "\nTambem recebeu R$"+adNot+" de Adicional Noturno."
						+"\nOs seus descontos somam R$"+desc+
						"\nSendo assim, seu salario liquido e: R$"+salQ);
		
		
		
		
	}

}
