package POO3;

public class produtoEletronico {
	   private String tipo;
	    private String marca;
	    private double valor;
	    private int tamanho; 
	    private boolean aPrazo; 
	    private int qntParcelas;
	    private String status;


	    public String getTipo() {
	        return tipo;
	    }
	    public void setTipo(String tipo) {
	        this.tipo = tipo;
	    }
	    public String getMarca() {
	        return marca;
	    }
	    public void setMarca(String marca) {
	        this.marca = marca;
	    }
	    public double getValor() {
	        return valor;
	    }
	    public void setValor(double valor) {
	        this.valor = valor;
	    }
	    public int getTamanho() {
	        return tamanho;
	    }
	    public void setTamanho(int tamanho) {
	        this.tamanho = tamanho;
	    }
	    public boolean isaPrazo() {
	        return aPrazo;
	    }
	    public void setaPrazo(boolean aPrazo) {
	        this.aPrazo = aPrazo;
	    }
	    public String getStatus() {
	        if(isaPrazo()) {
	            return "voc� parcelou em "+ qntParcelas;
	        }
	        return "Voc� pagou a vista";
	    }
	    public void setStatus(String status) {
	        this.status = status;
	    }
	    public int getQntParcelas() {
	        return qntParcelas;
	    }
	    public void setQntParcelas(int qntParcelas) {
	        this.qntParcelas = qntParcelas;
	    }

	    public produtoEletronico(String tipo, String marca, double valor, int tamanho, boolean aPrazo) {
	        super();
	        this.tipo = tipo;
	        this.marca = marca;
	        this.valor = valor;
	        this.tamanho = tamanho;
	        this.aPrazo = aPrazo;

	    }
	    public String getFuncionando() {
	        return "O aparelho est� zero bala";
	    }
	    public String getTempoGarantia() {
	        return "Ta safe voc� ainda tem 1 ano";
	    }
	
	
}
