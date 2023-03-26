package ExercicioPOO;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente("Lucas",25,"Masculino","Sumare",971068178);
		
		Cliente cliente2 = new Cliente("Sarah",24,"Feminino","Dourados",981818181);
		
		System.out.println("Checando Cadastro:");
		
		cliente1.visualizar();
		
		cliente2.visualizar();
		
	}

}
