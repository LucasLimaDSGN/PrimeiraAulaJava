package Heranca;

public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empregado lucas = new Empregado("Lucas Lima","R. da Marola, 99", "27889911223",985436732,22,322,9800,15);
		
		lucas.imprimirInfo();
		lucas.calcularSalario();
		
		Operario lucas1 = new Operario("Lucas Lima","R. da Marola, 99", "27889911223",985436732,22,25,10);
		lucas1.imprimirInfo();
		lucas1.calcularValorArtigo();
	}

}
