package ExercicioPOO;

public class Cliente {
	
	private String nomeCliente;
	private int idadeCliente;
	private String sexoCliente;
	private String cidadeCliente;
	private int celularCliente;
	


	public Cliente(String nomeCliente, int idadeCliente, String sexoCliente, String cidadeCliente, int celularCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.idadeCliente = idadeCliente;
		this.sexoCliente = sexoCliente;
		this.cidadeCliente = cidadeCliente;
		this.celularCliente = celularCliente;
	}

	
	
	public String getNomeCliente() {
		return nomeCliente;
	}



	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}



	public int getIdadeCliente() {
		return idadeCliente;
	}



	public void setIdadeCliente(int idadeCliente) {
		this.idadeCliente = idadeCliente;
	}



	public String getSexoCliente() {
		return sexoCliente;
	}



	public void setSexoCliente(String sexoCliente) {
		this.sexoCliente = sexoCliente;
	}



	public String getCidadeCliente() {
		return cidadeCliente;
	}



	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}



	public int getCelularCliente() {
		return celularCliente;
	}



	public void setCelularCliente(int celularCliente) {
		this.celularCliente = celularCliente;
	}



	public void visualizar() {
	
		if(idadeCliente == 0) {
			System.out.println("ERRO! Idade Cliente nao cadastrada.");
			
		}else if(sexoCliente == " ") {
			System.out.println("ERRO! Sexo Cliente nao cadastrado.");
			
		}else if(nomeCliente == " ") {
			
			System.out.println("ERRO! Nome Cliente nao cadastrado.");
		}else if(cidadeCliente == " ") {
				
			System.out.println("ERRO! Cidade Cliente nao cadastrado.");
		}else if(celularCliente == 0) {
			
			System.out.println("ERRO! Celular Cliente nao cadastrado.");
		} else if(idadeCliente == 0 ||sexoCliente == " "||nomeCliente == " "||cidadeCliente == " "||celularCliente == 0){
			
			System.out.println("\nO cadastro do cliente esta incompleto, realize novamente a operacao!");
		}else{
			
			System.out.println("\nO cliente: "+nomeCliente+"\nIdade: "+idadeCliente+"\nSexo: "+sexoCliente
					+"\nResidente em: "+cidadeCliente+"\nNumero de celular: "+celularCliente+"\nFoi cadastrado com sucesso!");
			
		}
	}
	

}
