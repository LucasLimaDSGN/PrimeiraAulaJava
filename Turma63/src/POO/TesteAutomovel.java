package POO;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciando um objeto da classe Automovel
		
		Automovel auto1 = new Automovel("Bruna","Monza","BUZ-4320",2000);
		
		auto1.imprimirInfo();
		
		System.out.println("\nTransferencia de Proprietario: ");
		
		auto1.setNomeProprietario("Larissa Pimenta");
		auto1.imprimirInfo();
		
		System.out.println("\nMudanca de Placa: ");
		auto1.setPlaca("ABC-8888");
		
		auto1.imprimirInfo();
	}

}
