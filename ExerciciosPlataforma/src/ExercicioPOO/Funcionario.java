package ExercicioPOO;

import java.text.NumberFormat;

public class Funcionario {

	private String nomeFunc;
	private int idadeFunc;
	private String cargoFunc;
	private float salarioFunc;
	private String ondeTrabalha;
	
	public Funcionario(String nomeFunc, int idadeFunc, String cargoFunc, float salarioFunc, String ondeTrabalha) {
		super();
		this.nomeFunc = nomeFunc;
		this.idadeFunc = idadeFunc;
		this.cargoFunc = cargoFunc;
		this.salarioFunc = salarioFunc;
		this.ondeTrabalha = ondeTrabalha;
	}
	public String getNomeFunc() {
		return nomeFunc;
	}
	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}
	public int getIdadeFunc() {
		return idadeFunc;
	}
	public void setIdadeFunc(int idadeFunc) {
		this.idadeFunc = idadeFunc;
	}
	public String getCargoFunc() {
		return cargoFunc;
	}
	public void setCargoFunc(String cargoFunc) {
		this.cargoFunc = cargoFunc;
	}
	public float getSalarioFunc() {
		return salarioFunc;
	}
	public void setSalarioFunc(float salarioFunc) {
		this.salarioFunc = salarioFunc;
	}
	
	public String getOndeTrabalha() {
		return ondeTrabalha;
	}
	public void setOndeTrabalha(String ondeTrabalha) {
		this.ondeTrabalha = ondeTrabalha;
	}
	public String alterarSalario() {
		NumberFormat formatoNumero = NumberFormat.getCurrencyInstance();
		formatoNumero.setMinimumFractionDigits(2);
		
		String formatarMoeda = formatoNumero.format(salarioFunc);
		
		return formatarMoeda;
		
	}
	
	
	
	public void visualizar() {
		System.out.printf("O funcionario: %s \nIdade: %d \nNo cargo: %s",nomeFunc,idadeFunc,cargoFunc);
		System.out.println("\nSeu salario e de: "+this.alterarSalario());
		System.out.println("\nEle trabalha no sistema de: "+ondeTrabalha);
	}
}
