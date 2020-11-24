package ExerciciosCollections;

public class ClassProdutos {
	
	private String nome;
	private int  qtd ;
	private double preco;
	private String tipo;
	
	
	public ClassProdutos(String nome, int qtd, double preco, String tipo) {
		super();
		this.nome = nome;
		this.qtd = qtd;
		this.preco = preco;
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getqtd() {
		return qtd;
	}
	public void setData( int qtd) {
		this.qtd = qtd;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Estoque: Produto: " + nome + " - Quantidade em Estoque: " + qtd + " - Valor por Unidade: " + preco + " - Tipo: " + tipo+ " .";
	}
	
	

}
