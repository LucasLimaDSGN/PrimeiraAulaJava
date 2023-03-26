package ExercicioPOO;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario func1 = new Funcionario("Lucas",25,"Desenvolvedor Java Senior",22000,"home office");
		Funcionario func2 = new Funcionario("Sarah",24,"Biologa Marinha",25000,"presencial");
		
		func1.visualizar();
		
		func2.visualizar();
	
	}

}
