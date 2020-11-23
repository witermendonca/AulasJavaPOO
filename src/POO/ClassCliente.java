package POO;

public class ClassCliente {
	
	private String nome ;
	
	private String Rg;
	
	private String telefone;
	
	private String CEP ; 
	
	private String cpf;
	
	

	public ClassCliente(String nome, String rg, String telefone, String cEP, String cpf) {
		super();
		this.nome = nome;
		Rg = rg;
		this.telefone = telefone;
		CEP = cEP;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return Rg;
	}

	public void setRg(String rg) {
		Rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	} 
	
	public String getStatus() {
		return "Compra realizada...";
	}
	
	
	

}
