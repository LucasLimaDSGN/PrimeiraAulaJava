package ExercicioPOO;

public class PessoaFisica extends Cliente {
	
	private String cpf;
	private String mtdPagamento;
	
	public PessoaFisica(String nomeCliente, int idadeCliente, String sexoCliente, String cidadeCliente,
			int celularCliente, String cpf, String mtdPagamento) {
		super(nomeCliente, idadeCliente, sexoCliente, cidadeCliente, celularCliente);
		this.cpf = cpf;
		this.mtdPagamento = mtdPagamento;
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMtdPagamento() {
		return mtdPagamento;
	}

	public void setMtdPagamento(String mtdPagamento) {
		this.mtdPagamento = mtdPagamento;
	}
	
	public void infoPF() {
		
		System.out.println("\nO cliente "+getNomeCliente()+". \nPortador do CPF:"+cpf
				+"\nUtiliza o metodo de pagamento:"+mtdPagamento);
	}
	
}
