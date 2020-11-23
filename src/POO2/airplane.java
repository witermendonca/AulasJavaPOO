package POO2;

public class airplane {

	  private String numeroDoVoo;
	    private String saida;
	    private String destino;
	    private int numAcento;
	    private int pesoMala;
	    public String horas;

	    public void setHoras(String horas) {
	        this.horas = horas;
	    }
	    public String getNumeroDoVoo() {
	        return numeroDoVoo;
	    }
	    public void setNumeroDoVoo(String numeroDoVoo) {
	        this.numeroDoVoo = numeroDoVoo;
	    }
	    public String getSaida() {
	        return saida;
	    }
	    public void setSaida(String saida) {
	        this.saida = saida;
	    }
	    public String getDestino() {
	        return destino;
	    }
	    public void setDestino(String destino) {
	        this.destino = destino;
	    }
	    public int getNumAcento() {
	        return numAcento;
	    }
	    public void setNumAcento(int numAcento) {
	        this.numAcento = numAcento;
	    }
	    public int getPesoMala() {
	        return pesoMala;
	    }
	    public void setPesoMala(int pesoMala) {
	        this.pesoMala = pesoMala;
	    }

	    public String getHorarioSaida() {
	        return "Sairá as 13:30";
	    }

	    public String getHoras() {
	        return horas;
	    }

	    public String getStatus() {
	        return "Decolando ...";
	        }
}
